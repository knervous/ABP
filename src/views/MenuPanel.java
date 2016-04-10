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
    private JLabel cost;
    private JLabel quantity;
    private JLabel actualItem;
    private JLabel actualCost;
    private JLabel actualQuantity;
    private int offset = 2;
    
    private GridBagConstraints layoutConst = new GridBagConstraints();
    private JPanel content = new JPanel();
    
    public MenuPanel(FoodStations station){
        content.setLayout(new GridBagLayout());
        layoutConst.insets = new Insets(10, 10, 10, 10);
        
        stationName = new JLabel(station.getStationName());
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        content.add(stationName, layoutConst);

        item = new JLabel("Item");
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        content.add(stationName, layoutConst);
        
        quantity = new JLabel(station.getStationName());
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        content.add(stationName, layoutConst);
        
        cost = new JLabel(station.getStationName());
        layoutConst.gridx = 2;
        layoutConst.gridy = 1;
        content.add(stationName, layoutConst);
        
        for (int i = 0; i < station.getStationObjects().length; i++){
            actualItem = new JLabel(station.getStationObjects()[i].getName());
            layoutConst.gridx = 0;
            layoutConst.gridy = i + offset;
            content.add(item, layoutConst);
            
            actualQuantity = new JLabel(Integer.toString(station.getStationObjects()[i].getQuantity()));
            layoutConst.gridx = 1;
            layoutConst.gridy = i + offset;
            content.add(quantity, layoutConst);
            
            actualCost = new JLabel("$" + Float.toString(station.getStationObjects()[i].getCost()));
            layoutConst.gridx = 2;
            layoutConst.gridy = i + offset;
            content.add(cost, layoutConst);
//            System.out.println(storeObject.getName());
//            System.out.println(storeObject.getCost());
//            System.out.println(storeObject.getQuantity());
        }
        this.setContentPane(content);
        this.pack();
        this.setTitle(station.getStationName());
        setVisible(true);
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
