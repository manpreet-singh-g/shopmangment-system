/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logics;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ankur
 */
public class Data_ip {
     public static String ip;
    
    private static Connection con = null;
    public static Connection Connect()  {
        if(con == null)
        {
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
            }
            catch(Exception e)
            {
                System.out.println("error in DataBaseConnect "+e);
            }
        }
        return con;
    }
    
}
