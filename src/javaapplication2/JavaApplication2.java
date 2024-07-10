/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.sql.*;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author SUMANTHA
 */
public class JavaApplication2 {

    /**
     * @
     */
    public static Connection getCon() 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fertilizer_management","root","Shetty123@");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
        // TODO code application logic here
    }
    
}
