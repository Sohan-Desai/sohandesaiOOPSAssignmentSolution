package com.organization.model.departments;
import com.organization.model.*;

public class HrDepartment extends SuperDepartment {
	/**
	 * 
	 * @return department name as "HR Department"
	 */
	public String departmentName() {
		
		return "HR Department";
	}
	/**
	 * 
	 * @return
	 */
	public String getTodaysWork() {
		
		return "Fill today's timesheet and mark your attendance";
	}
	/**
	 * 
	 * @return work deadline as "Complete by EOD"
	 */
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	/**
	 * 
	 * @return activity to be done as "team Lunch"
	 */
	public String doActivity() {
		
		return "team Lunch";
	}
}
