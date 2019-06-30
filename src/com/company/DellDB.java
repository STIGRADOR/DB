package com.company;

import java.sql.*;

public class DellDB {

    public static void dellDB() throws ClassNotFoundException, SQLException {
        String userName = "dL2L8H5mMg";
        String password = "ZVTjUJD39m";
        String url = "jdbc:mysql://remotemysql.com:3306/dL2L8H5mMg";
        Connection dbconnection = DriverManager.getConnection(url, userName, password);

        Statement statement = dbconnection.createStatement();
            statement.executeUpdate("DROP TABLE Orders");
            statement.executeUpdate("DROP TABLE Shop");
            statement.executeUpdate("DROP TABLE Persons");
            System.out.println("Сходил, дворецкий дверь открыл. Таблицу удалил.");
    }

}
