package org.example.connection;

import redis.clients.jedis.Jedis;


public class Connect {
    private String link;
    private int port;
    private String password;

    // public link and has password
    public Connect(String link, int port, String password) {
        this.link = link;
        this.port = port;
        this.password = password;
    }

    // public link but no password
    public Connect(String link, int port) {
        this.link = link;
        this.port = port;
        this.password = "";
    }

    // local link with password
    public Connect(int port, String password) {
        this.link = "localhost";
        this.port = port;
        this.password = password;
    }

    // local link without password
    public Connect() {
        this.link = "localhost";
        this.port = 6379;
        this.password = "";
    }

    public Jedis initConnect() {
        try {
            Jedis jedis = new Jedis(link, port);
            if (!password.equals("")) {
                jedis.auth(password);
            }
            System.out.println("Connection OK!");
            return jedis;
        } catch (Exception e) {
            System.out.println("Connection failed! " + e.getMessage());
        }
        return null;
    }
}
