package org.example.xml_based.service;

import org.example.xml_based.dao.ConnectionPool;

public class PersonRepository {
    private ConnectionPool connectionPool;

    public void setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
