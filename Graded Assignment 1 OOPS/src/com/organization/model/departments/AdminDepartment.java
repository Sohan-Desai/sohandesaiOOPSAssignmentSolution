package com.organization.model.departments;
import com.organization.model.*;

public class AdminDepartment extends SuperDepartment {
	/**
	 * 
	 * @return department name as "Admin Department"
	 */
	public String departmentName() {
		
		return "Admin Department";
	}
	/**
	 * 
	 * @return today's work as "Complete your documents Submission"
	 */
	public String getTodaysWork() {
		
		return "Complete your documents submission";
	}
	/**
	 * 
	 * @return work deadline as "Complete by EOD"
	 */
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	
}
