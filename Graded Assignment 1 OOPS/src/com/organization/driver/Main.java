package com.organization.driver;
import com.organization.model.departments.*;
public class Main {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		HrDepartment	hr = new	HrDepartment();
		TechDepartment tech = new TechDepartment();
		/**
		 * @returns following information about Admin Department:
		 * ~Today's work
		 * ~Work Deadline
		 * ~Is today a Holiday?
		 */
		System.out.print("\nWelcome to ");
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.print("\nWelcome to ");
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.print("\nWelcome to ");
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
	}

}
