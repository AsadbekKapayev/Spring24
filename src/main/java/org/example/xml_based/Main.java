package org.example.xml_based;

import org.example.xml_based.dao.ConnectionPool;
import org.example.xml_based.dao.Db;
import org.example.xml_based.service.CompanyRepository;
import org.example.xml_based.service.PersonRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (var classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml")) {
            var bean = classPathXmlApplicationContext.getBean("p1", ConnectionPool.class);
            var companyRepository = classPathXmlApplicationContext.getBean(CompanyRepository.class);
            var personRepository = classPathXmlApplicationContext.getBean(PersonRepository.class);
            var db = classPathXmlApplicationContext.getBean(Db.class);

            System.out.println(bean);
        }

    }

}