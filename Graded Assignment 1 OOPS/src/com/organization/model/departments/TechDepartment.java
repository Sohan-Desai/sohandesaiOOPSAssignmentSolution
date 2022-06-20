package com.organization.model.departments;
import com.organization.model.*;

public class TechDepartment extends SuperDepartment {
	/**
	 * 
	 * @return department name as "Tech Department"
	 */
	public String departmentName() {
		
		return "Tech Department";
	}
	/**
	 * 
	 * @return
	 */
	public String getTodaysWork() {
		
		return "Complete coding of module 1";
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
	 * @return tech stack information as "core Java"
	 */
	public String getTechStackInformation() {
		
		return "core Java";
	}
}
