

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmployeeBO {

	   static EmployeeBO empBo;  
	   static Employee employee;
	   

	   @BeforeClass
	   public static void setup()
	   {
		   empBo = new EmployeeBO();
		   employee = new Employee();
	   }
	   //test to check appraisal
	   @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double appraisal = empBo.calculateAppraisal(employee);
	      assertEquals(500, appraisal, 0.0);
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double salary = empBo.calculateYearlySalary(employee);
	      assertEquals(96000, salary, 0.0);
	   }
	}
