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
public class Bill_stock {
    public static ResultSet getproductlist()
    {
        ResultSet rs=null;
        
     try
        { 
          
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt1 = com.prepareStatement("select `product` from main_stock");
             
              rs = pstmt1.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe Bill_stock getproductlist--> "+e);
        } 
     return rs;
    }
    
}
