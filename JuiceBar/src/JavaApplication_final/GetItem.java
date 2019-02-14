/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hishan Kavishka
 */
public class GetItem {
    variables b=new variables();
    String print = null;
    String gettot=null;
    Integer value= null;
    Connection con = null;
    String query=null;
    String itemname=null;
    String itemcode=null;
    javax.swing.JTable Table=null;
    
    public GetItem(){
    }
    public void GetItems(String gettot,ResultSet rs,int value,String itemname,Connection con,String itemcode,javax.swing.JTable Table){
        //value=rs.getInt("price");                                                            
        int tot=Integer.parseInt(gettot);
        int total=tot+(1*value);
        print=Integer.toString(total);
        
        //Add Data To Report Table in Database
        Calendar calendar=Calendar.getInstance();
        java.sql.Date startDate=new java.sql.Date(calendar.getTime().getTime());
        query="insert into Report(date,item,quentity,price,bill_num)"+"values('"+startDate+"','"+itemname+"','"+b.quentity+"','"+value+"','b002')";
        PreparedStatement pstquery;
        try {
            pstquery = con.prepareStatement(query);
            pstquery.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GetItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Show Data on Table
        DefaultTableModel model =(DefaultTableModel) Table.getModel();
        model.addRow(new Object[]{itemcode,itemname,b.quentity,value});
        
    }
    public String lbl_set_total() {
        return print;
    }
}
