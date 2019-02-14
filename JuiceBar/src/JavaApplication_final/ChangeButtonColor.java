/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Hishan Kavishka
 */
public class ChangeButtonColor {
    void setColor(JPanel panel){
        panel.setBackground(new Color(41,53,65));
    }
        void resetColor(JPanel panel){
        panel.setBackground(new Color(41,39,40));
    }
}
