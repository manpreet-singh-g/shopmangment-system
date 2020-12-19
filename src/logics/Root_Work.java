/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ankur
 */
public class Root_Work {
    public static int getLastRootID()
    {
        {   int id=0;
            try
                {Connection com = logics.DB_Work.myDBInstance();
                 PreparedStatement pstmt = com.prepareStatement("select * from dealer");
                    ResultSet rs=pstmt.executeQuery();
                    while(rs.next())
                    {
                        id=rs.getInt("dealer_id");
                    }
                }
            catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null, "ERROR in detLastRootID() --> "+e);
                 }
            return id ;
        }
    }
    
}
