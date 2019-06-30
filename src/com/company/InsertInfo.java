package com.company;

import java.sql.*;

public class InsertInfo {

    protected void InsertInfoShop(){
        String userName = "dL2L8H5mMg";
        String password = "ZVTjUJD39m";
        String url = "jdbc:mysql://remotemysql.com:3306/dL2L8H5mMg";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Shop (price, product) VALUES ('21', 'iphone1')");
            statement.executeUpdate("INSERT INTO Shop (price, product) VALUES ('22', 'iphone2')");
            statement.executeUpdate("INSERT INTO Shop (price, product) VALUES ('23', 'iphone3')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void InsertInfoPerson(){
        String userName = "dL2L8H5mMg";
        String password = "ZVTjUJD39m";
        String url = "jdbc:mysql://remotemysql.com:3306/dL2L8H5mMg";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Persons (name) VALUES ('Vas9')");
            statement.executeUpdate("INSERT INTO Persons (name) VALUES ('Pet9')");
            statement.executeUpdate("INSERT INTO Persons (name) VALUES ('Sasha')");
            statement.executeUpdate("INSERT INTO Persons (name) VALUES ('Dima')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void InsertInfoOrders(){
        String userName = "dL2L8H5mMg";
        String password = "ZVTjUJD39m";
        String url = "jdbc:mysql://remotemysql.com:3306/dL2L8H5mMg";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Orders (ordernumber, shopID, personsID) VALUES (001, 2, 3)");
            statement.executeUpdate("INSERT INTO Orders (ordernumber, shopID, personsID) VALUES (002, 1, 4)");
            statement.executeUpdate("INSERT INTO Orders (ordernumber, shopID, personsID) VALUES (003, 3, 1)");
            statement.executeUpdate("INSERT INTO Orders (ordernumber, shopID, personsID) VALUES (004, 1, 2)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
