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
public class Stock {
    public static ResultSet getStock()
    {   ResultSet rs1 =null;
        try    
        {
            
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from stock ");
            rs1 = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getStock() --> "+e);
        } 
     return rs1;
    }
    public static ResultSet getStockList()//for combobox
    {
        ResultSet rs=null;
        
     try
        { 
          
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt1 = com.prepareStatement("select `product` from stock");
             
              rs = pstmt1.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getStockList() --> "+e);
        } 
     return rs;
    }
    public static ResultSet getStock_ON_StockName(String l_name)
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from stock where `product`=?");
            pstmt.setString(1,l_name);
            rs = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe   -->  getStock_ON_StockName()"+e);
        } 
   
     return rs;
    }
}
