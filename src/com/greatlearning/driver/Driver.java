package com.greatlearning.driver;
import com.greatlearning.departments.*;

public class Driver {

	public static void main(String[] args) {
		
		
		// Creating ADMIN department object and display its functionalities
		
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println("");

		// Creating HR department object and display its functionalities
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println("");
		// Creating HR department object and display its functionalities
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
