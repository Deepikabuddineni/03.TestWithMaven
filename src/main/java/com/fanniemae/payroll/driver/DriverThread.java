package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.EmailProcess;

public class DriverThread {

	public static void main(String[] args) {
		EmailProcess e = new EmailProcess();
		e.sendEmail();
		
		Thread t2 = new Thread(e);
		t2.start();
		
		
		Thread t = new Thread(){
			
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("loop 2 " + i);
					
					
				}
					
				}
			
			
		};
		
		for (int i = 0; i < 20; i++) {
			System.out.println("loop 1 " + i);
			
		}
	

	}

}

