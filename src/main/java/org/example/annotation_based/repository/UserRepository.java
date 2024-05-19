package org.example.annotation_based.repository;

import org.example.annotation_based.bpp.Transaction;
import org.example.annotation_based.model.User;
import org.example.xml_based.dao.ConnectionPool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transaction
public class UserRepository implements CrudRepository<Integer, User> {

    private final ConnectionPool pool;

    public UserRepository(@Qualifier("pool1") ConnectionPool pool1) {
        this.pool = pool1;
    }

    @Override
    public Optional<User> findById(Integer id) {
        System.out.println("findById...");
        return Optional.of(new User(1));
    }

    @Override
    public void delete(User entity) {
        System.out.println("delete...");
    }

}
