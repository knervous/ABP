/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import models.*;

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
    
    public MenuPanel(FoodStations station){
        content.setLayout(new GridBagLayout());
        layoutConst.insets = new Insets(10, 10, 10, 10);
        
        stationName = new JLabel(station.getStationName());
        System.out.println("STATION NAME: "+station.getStationName());
        for (int i = 0; i < station.getStationObjects().length; i++){
            
        }
    }
    
    public MenuPanel(TrashStation trashStation)
    {
        
    }
    
    public MenuPanel(FrontCounterStation counterStation)
    {
        
    }
    
    public MenuPanel(SignStation signStation)
    {
        
    }
}
