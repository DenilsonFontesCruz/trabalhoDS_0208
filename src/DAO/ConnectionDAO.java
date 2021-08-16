/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author defon
 */
public class ConnectionDAO {
    
    public Connection ConnectDB() {
        
        Connection conn = null;
        
        try {
            String UrlBD = "jdbc:mysql://localhost:3306/sistemads0208?user=root&password=1234";
            conn = DriverManager.getConnection(UrlBD);
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error Message: " + err.getMessage());
        }
        
        return conn;
    }
}
