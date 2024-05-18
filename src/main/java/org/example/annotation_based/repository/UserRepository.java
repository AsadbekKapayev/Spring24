package org.example.annotation_based.repository;

import org.example.annotation_based.bpp.Transaction;
import org.example.annotation_based.model.User;

import java.util.Optional;

@Transaction
public class UserRepository implements CrudRepository<Integer, User> {

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
