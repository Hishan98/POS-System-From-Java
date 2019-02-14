/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hishan Kavishka
 */
public class GetTableData {
    ResultSet rs=null;
    javax.swing.JTable Table= null;
    
    public void gatitem(ResultSet rs,javax.swing.JTable Table){
        Table.setModel(DbUtils.resultSetToTableModel(rs));
    }
}
