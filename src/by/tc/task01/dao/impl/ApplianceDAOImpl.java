package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public Appliance find(Criteria criteria) {

		Set<String> keys = criteria.getCriteria().keySet();

		String parametr;

		List<String> parametrs = new ArrayList<String>();
		List<String> appliances = new ArrayList<String>();

		for (String key : keys) {

			Object value = criteria.getCriteria().get(key);
			parametr = key + "=" + value.toString();
			parametrs.add(parametr);

		}

		try (BufferedReader reader = new BufferedReader(new FileReader(
				"F:\\Курсы\\ПВТ2\\eclipsWorkSpace\\jd1-les21-criteria02\\resources\\appliances_db.txt"))) {

			String app = reader.readLine();
			int count = 0;

			while (app != null) {

				if (app.contains(criteria.getGroupSearchName())) {

					for (int i = 0; i < parametrs.size(); i++) {
						if (app.contains(parametrs.get(i))) {
							count++;
						}
					}

					if (count == parametrs.size()) {
						appliances.add(app);
					}

					count = 0;

				}

				app = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		Appliance applance = new Appliance();
		applance.setAppliance(appliances);

		return applance;
	}

}
