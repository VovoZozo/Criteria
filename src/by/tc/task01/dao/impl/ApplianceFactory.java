package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceFactory {

	public List<Appliance> create(List<String> strAppliancesData) {

		List<Appliance> results = new ArrayList<Appliance>();

		for (String data : strAppliancesData) {
			results.add(create(data));
		}

		return results;

	}

	private Appliance create(String data) {

		String[] applianceData = data.split(":");

		switch (applianceData[0].trim()) {

		case "Oven":
			return createOven(applianceData);

		case "Laptop":
			return createLaptop(applianceData);

		case "Refrigerator":
			return createRefrigerator(applianceData);

		case "VacuumCleaner":
			return createVacuumCleaner(applianceData);

		case "TabletPC":
			return createTabletPC(applianceData);

		case "Speakers":
			return createSpeakers(applianceData);

		default:
			Appliance appliance = new Appliance();
			return appliance;
		}

	}

	private Appliance createLaptop(String[] data) {

		String[] criterias = data[1].trim().split(",");

		List<String> value = criteriaValue(criterias);

		int batteryCapacity = Integer.parseInt(value.get(0));
		String operatingSystem = value.get(1);
		int memoryRom = Integer.parseInt(value.get(2));
		int systemMemory = Integer.parseInt(value.get(3));
		double centralProcessingUnit = Double.parseDouble(value.get(4));
		int displayInchs = Integer.parseInt(value.get(5));

		Appliance laptop = new Laptop(batteryCapacity, operatingSystem, memoryRom, systemMemory, centralProcessingUnit,
				displayInchs);

		return laptop;

	}

	private Appliance createOven(String[] data) {

		String[] criterias = data[1].trim().split(",");

		List<String> value = criteriaValue(criterias);
		int powerConsumption = Integer.parseInt(value.get(0));
		int capacity = Integer.parseInt(value.get(2));
		double depth = Double.parseDouble(value.get(3));
		double weight = Double.parseDouble(value.get(1));
		double heigth = Double.parseDouble(value.get(4));
		double width = Double.parseDouble(value.get(5));

		Appliance oven = new Oven(powerConsumption, capacity, weight, depth, heigth, width);

		return oven;

	}

	private Appliance createRefrigerator(String[] data) {

		String[] criterias = data[1].trim().split(",");

		List<String> value = criteriaValue(criterias);

		int powerConsumption = Integer.parseInt(value.get(0));
		double weight = Double.parseDouble(value.get(1));
		int freezerCapacity = Integer.parseInt(value.get(2));
		int overallCapacity = Integer.parseInt(value.get(3));
		double height = Double.parseDouble(value.get(4));
		double width = Double.parseDouble(value.get(5));

		Appliance refrigerator = new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height,
				width);

		return refrigerator;

	}

	private Appliance createVacuumCleaner(String[] data) {

		String[] criterias = data[1].trim().split(",");

		List<String> value = criteriaValue(criterias);

		int powerConsumption = Integer.parseInt(value.get(0));
		String filterType = value.get(1);
		String bagType = value.get(2);
		String wandType = value.get(3);
		int motorSpeedRegulation = Integer.parseInt(value.get(4));
		int cleaningWidth = Integer.parseInt(value.get(5));

		Appliance vacuumCleaner = new VacuumCleaner(powerConsumption, filterType, bagType, wandType,
				motorSpeedRegulation, cleaningWidth);

		return vacuumCleaner;

	}

	private Appliance createTabletPC(String[] data) {

		String[] criterias = data[1].trim().split(",");

		List<String> value = criteriaValue(criterias);

		int batteryCapacity = Integer.parseInt(value.get(0));
		String color = value.get(4);
		int memoryRom = Integer.parseInt(value.get(2));
		int flashMemoryCapacity = Integer.parseInt(value.get(3));
		int displayInchs = Integer.parseInt(value.get(1));

		Appliance tabletPC = new TabletPC(batteryCapacity, color, memoryRom, flashMemoryCapacity, displayInchs);

		return tabletPC;

	}

	private Appliance createSpeakers(String[] data) {

		String[] criterias = data[1].trim().split(",");

		List<String> value = criteriaValue(criterias);

		int powerConsumption = Integer.parseInt(value.get(0));
		int numberOfSpeakers = Integer.parseInt(value.get(1));
		String frequencyRange = value.get(2);
		int cordLength = Integer.parseInt(value.get(3));

		Appliance speakers = new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);

		return speakers;

	}

	private List<String> criteriaValue(String[] criterias) {

		List<String> value = new ArrayList<String>();

		int index = 0;

		for (String criteria : criterias) {
			index = criteria.indexOf("=");
			value.add(criteria.substring(index + 1));
		}

		return value;
	}
}
