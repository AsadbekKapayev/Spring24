package org.example.annotation_based;

import org.example.annotation_based.repository.CrudRepository;
import org.example.annotation_based.repository.UserRepository;
import org.example.annotation_based.service.UserService;
import org.example.annotation_based.service.UserWithInject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            var bean = context.getBean(UserService.class);
            var userWithInject = context.getBean(UserWithInject.class);
            var crudRepository = context.getBean(CrudRepository.class);
            System.out.println(crudRepository.findById(1).orElse(null));
        }

    }

}
