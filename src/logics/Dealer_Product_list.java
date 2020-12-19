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
public class Dealer_Product_list {
   
    public static ResultSet getDealerProductList()
    {   ResultSet rs1 =null;
        try    
        {
            
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from dealer ");
            rs1 = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe Dealer_Product_list from getproductlist() --> "+e);
        } 
     return rs1;
    }
    
    
    public static ResultSet getDealer_ON_ProductName(String pr_name)
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from dealer where `dealer_poducts`=?");
            pstmt.setString(1,pr_name);
            rs = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe Dealer_Product_list from getDealer_ON_ProductName() --> "+e);
        } 
     return rs;
    }
}
