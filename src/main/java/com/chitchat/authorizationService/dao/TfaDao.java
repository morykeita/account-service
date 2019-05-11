package com.chitchat.authorizationService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Mory Keita
 */

@Repository
public class TfaDao {

    @Autowired
    private JdbcTemplate template;
}
