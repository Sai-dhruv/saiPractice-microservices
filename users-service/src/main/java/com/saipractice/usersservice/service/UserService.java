/**
 * 
 */
package com.saipractice.usersservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.saipractice.usersservice.entity.Department;
import com.saipractice.usersservice.entity.ResponseTemplate;
import com.saipractice.usersservice.entity.User;
import com.saipractice.usersservice.repository.UserRepository;

/**
 * @author Saikrishna Vinjamuri
 *
 */

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public ResponseTemplate findByUserId(Long id) {
		ResponseTemplate responseTemplate = new ResponseTemplate();
		User user =  repository.findByUserId(id);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
		responseTemplate.setDepartment(department);
		responseTemplate.setUser(user);
		return responseTemplate;
		
	}
	
	
}
