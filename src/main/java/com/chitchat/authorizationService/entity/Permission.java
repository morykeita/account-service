/**
 * 
 */
package com.chitchat.authorizationService.entity;

import javax.persistence.Entity;

/**
 * @author Mory Keita
	Mar 2, 2019
 *
 */

@Entity
public class Permission extends BasedIdEntity {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
