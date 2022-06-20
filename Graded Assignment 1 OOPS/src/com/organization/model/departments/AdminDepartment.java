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
	 * @return
	 */
	public String getTodaysWork() {
		
		return "Complete your documents Submission";
	}
	/**
	 * 
	 * @return work deadline as "Complete by EOD"
	 */
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	
}
