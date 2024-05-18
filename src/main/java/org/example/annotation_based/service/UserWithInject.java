package org.example.annotation_based.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserWithInject {

/*
    @Resource(name = "pool1")
    @Autowired
    @Qualifier("pool1")
    private UserService userService;
*/

    @Autowired
    private UserService pool1;

    @Value("${db.pool.size}")
    private Integer poolSize;

}
