package org.example.event_listener;

import org.example.event_listener.config.ApplicationConfiguration;
import org.example.event_listener.service.CompanyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            var bean = context.getBean(CompanyService.class);
            var company = bean.findById("1");
            System.out.println("SNA67IgK :: company: " + company.orElseThrow());
        }

    }

}
