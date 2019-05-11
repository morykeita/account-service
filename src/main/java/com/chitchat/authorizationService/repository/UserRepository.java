/**
 * 
 */
package com.chitchat.authorizationService.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chitchat.authorizationService.entity.User;



/**
 * @author Mory Keita
	Mar 2, 2019
 *
 */
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>  {

	User findByUsername(String username);
	User findByEmail(String email);


}
