package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB{
    protected void createDB() throws ClassNotFoundException, SQLException {
        String userName = "dL2L8H5mMg";
        String password = "ZVTjUJD39m";
        String url = "jdbc:mysql://remotemysql.com:3306/dL2L8H5mMg";
        Connection dbConnection = DriverManager.getConnection(url, userName, password);

        Statement statement = dbConnection.createStatement();
            statement.executeUpdate("CREATE TABLE Shop(id int not null auto_increment, price varchar(30), product varchar(15), PRIMARY KEY (id));");
            statement.executeUpdate("CREATE TABLE Persons(id int not null auto_increment, name varchar(30) not null, primary key (id))");
            statement.executeUpdate("CREATE TABLE Orders(id int not null auto_increment, ordernumber int, shopID int, personsID int, " +
                    "date_time datetime default current_timestamp, foreign key (shopID) references Shop(id), foreign key (personsID) references Persons(id), primary key (id))");
            System.out.println("Сходил, дворецкий дверь открыл. Таблицу создал.");
    }
}
