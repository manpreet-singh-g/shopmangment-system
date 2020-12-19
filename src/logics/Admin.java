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
public class Admin {
    
    
    public static ResultSet getAdmin()
    {   ResultSet rs1 =null;
        try    
        {
            
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from admin ");
            rs1 = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getEmployee --> "+e);
        } 
     return rs1;
    }
    public static ResultSet getAdmmin_ON_AdminName(String e_name)
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from admin where `name`=?");
            pstmt.setString(1,e_name);
            rs = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe  getEmployee_ON_EmployeeName() --> "+e);
        } 
     return rs;
    }
}
