/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_system;

/**
 *
 * @author Lulu
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class dbcon {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
       
            //sample code to demo the databaase connection and sql statements            
            String connectionURL = "jdbc:derby://localhost:1527/lulu";
            String uName = "lulu";
            String uPass= "lulu";
        
            //ConnectionURL, username and password should be specified in getConnection()       
            
                      
            Connection con = DriverManager.getConnection(connectionURL, uName, uPass);
    }
}
                    
        
        
            
      
             


    

                    

