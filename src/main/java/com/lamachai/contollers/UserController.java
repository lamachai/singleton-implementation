package com.lamachai.contollers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lamachai.database.Connect;
import com.lamachai.models.User;

public class UserController {

    private Connection connection;

    public UserController(){
        try{
            this.connection = Connect.getInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<User> getData() throws SQLException{

        List<User> l = new ArrayList<User>();

        String sql = "SELECT * FROM users";

        PreparedStatement stm = connection.prepareStatement(sql);

        ResultSet result = stm.executeQuery();

        while(result.next()){
            Long id = result.getLong("id");
            String name = result.getString("name");
            String email = result.getString("email");
            User u = new User(id, name, email);
            l.add(u);
        }
        return l;
    }
    
}
