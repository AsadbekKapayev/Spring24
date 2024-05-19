package org.example.java_based.repo;

import org.example.xml_based.dao.ConnectionPool;

public class CustomerRepo {
    private final ConnectionPool pool;

    public CustomerRepo(ConnectionPool pool) {
        this.pool = pool;
    }
}
