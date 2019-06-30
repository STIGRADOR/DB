package com.company;

import java.io.IOException;
import java.sql.*;

public class Main{

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");

        DellDB.dellDB();
        CreateDB createDB = new CreateDB();
        createDB.createDB();
        InsertInfo insertInfo = new InsertInfo();
        insertInfo.InsertInfoShop();
        insertInfo.InsertInfoPerson();
        insertInfo.InsertInfoOrders();
        Select select = new Select();
        select.SelectOrders();
	}
}
