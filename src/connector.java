/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SUMANTHA
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class connector 
{
    public static void main(String args[])
    {
        ConnectDb();
    }

 
      public static Connection ConnectDb() 
    {
        Connection connection = null;
          
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		     connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/fertilizer_management","root","Shetty123@");
			return connection;
		}
		catch (ClassNotFoundException|SQLException e) {
			JOptionPane.showMessageDialog(null,e);
		}
		return connection;
	}

   
    
    }

	


    
    
    
    
    
