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

/**
 *
 * @author ankur
 */
public class Labour {
    public static int getLastLabourID()
    {   int id=0;
            try
                {Connection com = logics.DB_Work.myDBInstance();
                 PreparedStatement pstmt = com.prepareStatement("select * from labour");
                    ResultSet rs=pstmt.executeQuery();
                    while(rs.next())
                    {
                        id=rs.getInt("id");
                    }
                }
            catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null, "ERROR in detLastRootID() --> "+e);
                 }
            return id ;
        }
    public static ResultSet getLabour()
    {   ResultSet rs1 =null;
        try    
        {
            
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from labour ");
            rs1 = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getEmployee --> "+e);
        } 
     return rs1;
    }
public static ResultSet getLabourList()//for combobox
    {
        ResultSet rs=null;
        
     try
        { 
          
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt1 = com.prepareStatement("select `name` from labour");
             
              rs = pstmt1.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe getEmployeelist() --> "+e);
        } 
     return rs;
    }
public static ResultSet getLabour_ON_LabourName(String l_name)
    {
        ResultSet rs =null;
        try    
        {
            Connection com = logics.DB_Work.myDBInstance();
            PreparedStatement pstmt = com.prepareStatement("select * from labour where `name`=?");
            pstmt.setString(1,l_name);
            rs = pstmt.executeQuery();  
        }
        catch(Exception e)
        {
            System.out.println("erroe  getEmployee_ON_EmployeeName() --> "+e);
        } 
     return rs;
    }

}
