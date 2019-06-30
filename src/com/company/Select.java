package com.company;

import java.sql.*;

public class Select {

    protected void SelectOrders() {
        String userName = "dL2L8H5mMg";
        String password = "ZVTjUJD39m";
        String url = "jdbc:mysql://remotemysql.com:3306/dL2L8H5mMg";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Orders.ordernumber, Shop.product, Shop.price, Persons.name FROM Persons\n" +
                    "INNER JOIN Orders ON Persons.id = Orders.personsID\n" +
                    "INNER JOIN Shop ON Shop.id = Orders.shopID\n" +
                    "ORDER BY Orders.ordernumber;");
            while (resultSet.next()){
                System.out.println("|----------------------------------------------------------------------------------------|");
                System.out.print(" Номер заказа: " + resultSet.getString(1) +" |");
                System.out.print(" Название продукта: " + resultSet.getString(2)+" |");
                System.out.print(" Стоимость: " + resultSet.getString(3)+" |");
                System.out.println(" Имя покупателя: " + resultSet.getString(4));
            }
            System.out.println("|----------------------------------------------------------------------------------------|");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
