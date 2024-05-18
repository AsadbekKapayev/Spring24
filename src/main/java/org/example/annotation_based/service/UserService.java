package org.example.annotation_based.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserService {

    public UserService() {
        System.out.println("UserService");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

}
