/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcityresidencecomplex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sanuri Isara
 */
public class DBConnection {
    public static void main(String[] args) {
         try {
           
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodcity","root","");
             Statement stmt=con.createStatement();
           
        } catch (SQLException err) {
               err.printStackTrace();
        }
        
         
    }
     
        
        
    
}
