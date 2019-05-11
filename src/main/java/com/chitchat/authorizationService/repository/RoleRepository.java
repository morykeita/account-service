package com.chitchat.authorizationService.repository;

import com.chitchat.authorizationService.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mory Keita
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String roleName);
}
