package org.example.java_based;

import org.example.annotation_based.repository.CrudRepository;
import org.example.annotation_based.service.UserService;
import org.example.annotation_based.service.UserWithInject;
import org.example.java_based.config.ApplicationConfiguration;
import org.example.java_based.repo.CustomerRepo;
import org.example.xml_based.dao.ConnectionPool;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Man {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            var bean = context.getBean(UserService.class);
            var userWithInject = context.getBean(UserWithInject.class);
            var crudRepository = context.getBean(CrudRepository.class);
            var pool1 = context.getBean("pool1", ConnectionPool.class);
            var customer = context.getBean(CustomerRepo.class);
            System.out.println(crudRepository.findById(1).orElse(null));
        }

    }

}
