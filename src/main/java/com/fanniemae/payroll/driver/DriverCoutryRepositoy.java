package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;
import com.fanniemae.payroll.dao.CountryRepository;

public class DriverCoutryRepositoy {

	public static void main(String[] args) {
		
		CountryRepository dao = new CountryRepository();
		dao.findAll().forEach(System.out::println);


	}

}
