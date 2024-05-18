package org.example.xml_based.service;

import org.example.xml_based.dao.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static CompanyRepository of(ConnectionPool connectionPool) {
        return new CompanyRepository(connectionPool);
    }

}
