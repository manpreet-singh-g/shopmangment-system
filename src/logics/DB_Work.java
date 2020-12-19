/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logics;

import java.sql.Connection;
import java.sql.DriverManager;
import static logics.Data_ip.ip;

/**
 *
 * @author ankur
 */
public class DB_Work
{
    static int counter_in_logic=0;
    static Connection con=null;
    public static String ip;

    static public Connection myDBInstance()
    {
        if(con==null)
        {
            try 
            {
              Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "");
              //con = DriverManager.getConnection("jdbc:mysql:/"+ip+":3306/stock", "root", "");
              counter_in_logic++;
              System.out.println("obj num. --> "+counter_in_logic);
            }
            catch (Exception e) 
            {
                System.out.println("Error in --> myDBInstance() : "+e);
            }
        }
        System.out.println("obj num. --> "+counter_in_logic);
        return con;
    }
}
