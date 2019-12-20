package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		// you may add your own code here
		
		for (int i = 0; i < appliances.size(); i++) {
			System.out.println(  appliances.get(i).getName() );
		}
		
	}
	
	// you may add your own code here

}
