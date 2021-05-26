/**
 * 
 */
package com.saipractice.usersservice.entity;

/**
 * @author Saikrishna Vinjamuri
 *
 */
public class ResponseTemplate {
	
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private Department department;

}
