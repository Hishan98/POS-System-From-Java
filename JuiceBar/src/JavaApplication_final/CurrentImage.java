/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Hishan Kavishka
 */
public class CurrentImage {
    int snumber;
    current_user x=new current_user();
    int current=x.current(snumber);
    Connection con = null;
    SQlConnection a= new SQlConnection();
    
    ResultSet rs;
    
    
    ResultSet currentimg(ResultSet rs){
        try{

            con = a.connect();
            Statement st=con.createStatement();
            String sql="SELECT * FROM login WHERE `sno`='"+current+"'";
            rs=st.executeQuery(sql);
            
            // = rs.getBytes("Image");
            
                  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Cannot Load Your current image ,Maybe You Don't Insert an Image previously ");
        }
        return rs;
    }
}
