package org.example.java_based.config;

import org.example.annotation_based.repository.CrudRepository;
import org.example.java_based.repo.CustomerRepo;
import org.example.web.WebConfiguration;
import org.example.xml_based.dao.ConnectionPool;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@ImportResource("classpath:application.xml")
//@Configuration(proxyBeanMethods = false)
@Import(WebConfiguration.class)
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(
        basePackages = "org.example",
        useDefaultFilters = false,
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, value = Component.class),
                @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
                @Filter(type = FilterType.REGEX, pattern = "com\\..+class")
        }
)
public class ApplicationConfiguration {

    @Bean
    public ConnectionPool pool1() {
        return new ConnectionPool("tets", 20, List.of("1"), Map.of());
    }

    @Bean
    public ConnectionPool pool2() {
        return new ConnectionPool("tets", 20, List.of("1"), Map.of());
    }

    @Bean
    public CustomerRepo customerService(ConnectionPool pool1) {
        return new CustomerRepo(pool1);
    }

}
