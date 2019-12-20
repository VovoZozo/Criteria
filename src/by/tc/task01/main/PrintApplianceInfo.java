package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliances) {
		// you may add your own code here

		appliances.forEach(action -> System.out.println(action.toString()));

	}

	// you may add your own code here

}
