package org.example.xml_based.dao;

public class Db {
    private final String username;
    private final String password;
    private final int poolSize;
    private final String driver;
    private final String url;
    private final String[] hosts;

    public Db(String username, String password, int poolSize, String driver, String url, String[] hosts) {
        this.username = username;
        this.password = password;
        this.poolSize = poolSize;
        this.driver = driver;
        this.url = url;
        this.hosts = hosts;
    }
}
