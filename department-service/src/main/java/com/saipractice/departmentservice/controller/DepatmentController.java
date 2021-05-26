package com.saipractice.departmentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saipractice.departmentservice.entity.Department;
import com.saipractice.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Saikrishna Vinjamuri
 *
 */

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepatmentController {
	 Logger logger = LoggerFactory.getLogger(DepatmentController.class);
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("In controller saveDepartment"+department);
		Department response = departmentService.saveDepartment(department);
		return response;
		
	}

	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable Long id) {
		return departmentService.findByDepartmentId(id);
		
	}
	

}
