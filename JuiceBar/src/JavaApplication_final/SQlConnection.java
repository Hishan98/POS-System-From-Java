/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Hishan Kavishka
 */
public class SQlConnection {
    String sourceURL = null;

    public SQlConnection() {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connection URL.
            //sourceURL = new String("jdbc:mysql://localhost:3306/ITP_Java");
            sourceURL = new String("jdbc:mysql://localhost:3306/juicebar");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Unable to load database driver classes");
        }
    }

    public Connection connect() {
        Connection dbConn = null;

        try {
            dbConn = DriverManager.getConnection(sourceURL, "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Unable to Connect Database");
        }
        return dbConn;
    }

    public void con_close(Connection dbConn) {
        try {
            dbConn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection closing failure");
        }
    }
    
}

    
