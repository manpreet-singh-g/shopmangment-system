/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ankur
 */
public class Product_list {
    public static ResultSet getproductlist()
    {
        ResultSet rs=null;
        
     try
        { 
          
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt1 = com.prepareStatement("select `Product_name` from product");
             
              rs = pstmt1.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe Product_list getproductlist() --> "+e);
        } 
     return rs;
    }
}

