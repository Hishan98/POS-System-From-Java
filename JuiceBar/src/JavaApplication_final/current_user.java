/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hishan Kavishka
 */
public class current_user {
    int current(int snumber){
        try{
                        
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/juicebar","root","");
                        Statement st=con.createStatement();
                        String sqlx="SELECT * FROM `current_user` WHERE `uno` = 1";
                        ResultSet rsx=st.executeQuery(sqlx);
                        if(rsx.next()){
                            snumber=rsx.getInt("sno");
                            
                            
                            
                        }
            
                        
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
        return snumber;
    }
}
