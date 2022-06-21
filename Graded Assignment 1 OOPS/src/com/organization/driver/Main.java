package com.organization.driver;
import com.organization.model.departments.*;
public class Main {

	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment	hr = new	HrDepartment();
		TechDepartment tech = new TechDepartment();
		/**
		 * Displaying following information about Admin Department:
		 * ~Today's work
		 * ~Work Deadline
		 * ~Is today a Holiday?
		 */
		System.out.print("\nWelcome to ");					//Welcome to Admin Department
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());			//Complete your documents Submission
		System.out.println(admin.getWorkDeadline());		//Complete by EOD
		System.out.println(admin.isTodayAHoliday());		//Today is not a Holiday
		
		/**
		 * Displaying following information about HR Department:
		 * ~Activity
		 * ~Today's work
		 * ~Work Deadline
		 * ~Is today a Holiday?
		 */
		System.out.print("\nWelcome to ");					//Welcome to HR Department
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());				//team Lunch
		System.out.println(hr.getTodaysWork());				//Fill today's timesheet and mark your attendance
		System.out.println(hr.getWorkDeadline());			//Complete by EOD
		System.out.println(hr.isTodayAHoliday());			//Today is not a Holiday
		
		/**
		 * Displaying following information about Tech Department:
		 * ~Today's work
		 * ~Work Deadline
		 * ~Tech Stackinformation
		 * ~Is today a Holiday?
		 */
		System.out.print("\nWelcome to ");					//Welcome to Tech Department
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());			//Complete coding of module 1
		System.out.println(tech.getWorkDeadline());			//Complete by EOD
		System.out.println(tech.getTechStackInformation());	//core Java
		System.out.println(tech.isTodayAHoliday());			//Today is not a Holiday
		System.out.println();								//prints additional new line
	}

}
