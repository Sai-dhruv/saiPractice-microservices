/**
 * 
 */
package com.saipractice.usersservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.saipractice.usersservice.entity.ResponseTemplate;
import com.saipractice.usersservice.entity.User;
import com.saipractice.usersservice.service.UserService;

/**
 * @author Saikrishna Vinjamuri
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

   @GetMapping("/{id}")
   public ResponseTemplate findByUserId(@PathVariable Long id) {
	   System.out.println("----------------------------------------->>"+id);
	   return userService.findByUserId(id);
   }

   
   
   
}
