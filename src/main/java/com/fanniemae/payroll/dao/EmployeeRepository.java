package com.fanniemae.payroll.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.EmployeeType;

public class EmployeeRepository {

	public int getSize() {
		return 3;
	}

	public ArrayList<EmployeeType> findAll() {
		String fileName = "/data/employees.txt";

		FileReader fr;

		ArrayList<EmployeeType> list = new ArrayList<>();

		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String row = "";

			br.readLine();
			while ((row = br.readLine()) != null) {
				String[] columns = row.split(",");
				if (columns.length < 3) {
					// create a report
					continue;
				}
				String type = columns[0];
				float salary = Float.parseFloat(columns[1]);
				float hoursWorked = Float.parseFloat(columns[2]);
				EmployeeType empType = new EmployeeType(type, salary, hoursWorked);

				list.add(empType);

			}

			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
