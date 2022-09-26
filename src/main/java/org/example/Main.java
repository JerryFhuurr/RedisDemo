package org.example;

import org.example.connection.Connect;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Connect connect = new Connect();
        connect.initConnect();
    }
}