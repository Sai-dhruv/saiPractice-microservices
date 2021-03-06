/**
 * 
 */
package com.saipractice.usersservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saipractice.usersservice.entity.User;

/**
 * @author Saikrishna Vinjamuri
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	User findByUserId(Long id);

}
