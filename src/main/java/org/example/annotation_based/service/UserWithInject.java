package org.example.annotation_based.service;

import org.example.annotation_based.bpp.InjectBean;

public class UserWithInject {

    @InjectBean
    private UserService userService;

}
