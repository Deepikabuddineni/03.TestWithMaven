import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.Employee;
import com.fanniemae.payroll.ManagementEmployee;

public class ManagementEmployeeTest {

	@Test
	public void testHourlyWage() {
		ManagementEmployee m = new ManagementEmployee(52_000, 40);
		float wage = m.getHourlyWage();

		assertTrue(wage == 25);
	}

	@Test
	public void testWeeklySalary() {
		ManagementEmployee m = new ManagementEmployee(52_000, 40);
		float WeeklySalary = m.getWeeklySalary();

		assertTrue("Salary: " + WeeklySalary, WeeklySalary == 1_000);
	}

	@Test
	public void testMonthlySalary() {
		Employee m = new ManagementEmployee(52_000);
		float MonthlySalary = m.getMonthlySalary();

		assertTrue("Salary: " + MonthlySalary,MonthlySalary == 4333.3335f);
	}

	

	}


