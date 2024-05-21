package com.lamachai.database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Connect {

    private static String URL = "jdbc:mysql://localhost:3306/my_new";
    private static String USER = "root";
    private static String PASSWORD = "";


    private static Connection instance;

    //nobody will create instance
    private Connect(){
        super();
    }


    //implementing singleton
    public static Connection getInstance() throws ClassNotFoundException, SQLException{
        if (instance == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            instance = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return instance;
    }
    
}
