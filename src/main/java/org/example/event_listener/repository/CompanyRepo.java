package org.example.event_listener.repository;

import org.example.annotation_based.repository.CrudRepository;
import org.example.event_listener.model.dao.CompanyDao;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanyRepo implements CrudRepository<String, CompanyDao> {

    @Override
    public Optional<CompanyDao> findById(String id) {
        System.out.println("findById...");
        return Optional.of(new CompanyDao(id));
    }

    @Override
    public void delete(CompanyDao entity) {
        System.out.println("delete...");
    }

}
