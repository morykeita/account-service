/**
 * 
 */
package com.chitchat.authorizationService.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Mory Keita
	Mar 2, 2019
 *
 */
@MappedSuperclass
public class BasedIdEntity  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

}
