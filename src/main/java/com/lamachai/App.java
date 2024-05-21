package com.lamachai;

import java.sql.SQLException;
import java.util.List;

import com.lamachai.contollers.UserController;
import com.lamachai.database.Connect;
import com.lamachai.models.User;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        UserController u = new UserController();

        List<User> l = u.getData();

        for (User us: l){
            System.out.println(us);
        }
    }
}
