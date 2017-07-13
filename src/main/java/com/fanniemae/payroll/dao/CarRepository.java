package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRepository implements IQuery<String> {

	public CarRepository() {
		// TODO Auto-generated constructor stub
		System.out.println("Iam alive");
	}
	
	
	@Override
	public ArrayList<String> findAll() {

		return null;
	}
	
	
	

	@Override
	public Map<String, Double> findMaps() {
		Map<String, Double> carMap = new HashMap<>();
		
		carMap.put("Lexus", 9_000_000d);
		carMap.put("MiniCooper", 8_000_000d);
		carMap.put("Acura", 7_000_000d);
		carMap.put("Merc", 6_000_000d);
		carMap.put("BMW", 5_000_000d);
		carMap.put("KIA", 4_000_000d);
		carMap.put("Honda", 3_000_000d);
		carMap.put("Hundai", 2_000_000d);
		carMap.put("Toyoto", 1_500_000d);
		carMap.put("Subaru", 1_000_000d);
		
	//	System.out.println(carMap.get("Lexus"));

		return carMap;
	}


	
	
}
 