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
public class Dealer_name_list {
    public static ResultSet getDealerList() // fn for dealer list in remove dealer for combo box
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from dealer ");
            
            rs = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe Dealer_Product_list from getDealer_ON_ProductName() --> "+e);
        } 
     return rs;
    }
    public static ResultSet getDealer_ON_Dealerid(String dealer_id)//call data in table by id of dealer
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from dealer where `dealer_id`=?");
            pstmt.setString(1,dealer_id);
            rs = pstmt.executeQuery();   
        }
        catch(Exception e)
        {
            System.out.println("erroe Dealer_Product_list from getDealer_ON_ProductName() --> "+e);
        } 
     return rs;
    }
    public static ResultSet getDealername(String pr_name)//in combocox
    {   ResultSet rs =null;
        try    
        {
           Connection com = logics.DB_Work.myDBInstance();
           PreparedStatement pstmt = com.prepareStatement("select `dealer_name_first` from dealer where `dealer_poducts`='" + pr_name + "'");
//           pstmt.setString(1,pr_name);
           rs = pstmt.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println("erroe Dealer_Product_list from getDealername() --> "+e);
        } 
     return rs;
    }
}
