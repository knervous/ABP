/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author greg
 */
public class MenuPanel extends JFrame{
    private JLabel stationName;
    private JLabel item;
    private JLabel price;
    private JLabel quantity;
    private int menuOffset = 2;
    
    private GridBagConstraints layoutConst = new GridBagConstraints();
    private JPanel content = new JPanel();
    
    public MenuPanel(Object[] storeObjects, Object station){
        content.setLayout(new GridBagLayout());
        layoutConst.insets = new Insets(10, 10, 10, 10);
        
        stationName = new JLabel(station.name);
        
        for (int i = 0; i < storeObjects.length; i++){
            
        }
    }
}
