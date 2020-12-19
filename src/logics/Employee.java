/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ankur
 */
public class Employee {
    public static int getLastEmployeeID()
    {   int id=0;
            try
                {Connection com = logics.DB_Work.myDBInstance();
                 PreparedStatement pstmt = com.prepareStatement("select * from employee");
                    ResultSet rs=pstmt.executeQuery();
                    while(rs.next())
                    {
                        id=rs.getInt("id");
                    }
                }
            catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null, "ERROR in getLastEmployeeID() --> "+e);
                 }
            return id ;
        }
    public static ResultSet getEmployee()
    {   ResultSet rs1 =null;
        try    
        {
            
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from employee ");
            rs1 = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getEmployee --> "+e);
        } 
     return rs1;
    }
public static ResultSet getEmployeelist()//for combobox
    {
        ResultSet rs=null;
        
     try
        { 
          
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt1 = com.prepareStatement("select `name` from employee");
             
              rs = pstmt1.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getEmployeelist() --> "+e);
        } 
     return rs;
    }
public static ResultSet getEmployee_ON_EmployeeName(String e_name)
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from employee where `name`=?");
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
