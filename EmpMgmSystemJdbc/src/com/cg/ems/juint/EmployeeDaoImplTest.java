package com.cg.ems.juint;

import java.time.LocalDate;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeImpl;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public class EmployeeDaoImplTest {
	
	static EmployeeDao empdao=null;
	
	@BeforeClass
	public static void setUp()
	{
		empdao = new EmployeeImpl();
	}
	
	@Test
	public void addEmpTest() throws EmployeeException{
		Assert.assertEquals(161735, empdao.addEmployee(new Employee(161735,"Hyndhu",5000.0F,LocalDate.now())));
			
				
	}
	

}
