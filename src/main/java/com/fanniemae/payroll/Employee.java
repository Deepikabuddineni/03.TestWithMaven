package com.fanniemae.payroll;

public class Employee {
	
	float yearlySalary = 0;
	
	public float getYearlySalary(){
		return yearlySalary;
	}
	
	public Employee(float yearlySalary){
		this.yearlySalary = yearlySalary;
		
	}
	
	
  public float getWeeklySalary(){
	  return yearlySalary/52;
		
	}
 
  
  public float getMonthlySalary(){
	  return yearlySalary/12;
		
	}
  
  public float getHourlySalary(){
	  return yearlySalary/(52*40);
		
	}
  
  public float getHourlyWage(){
	  return yearlySalary/52/40;
  }
 
 public float getOverTimeHourlyWage(){
	 return 0;
	 
 }
  
  
}