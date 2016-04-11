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
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

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
    private SpinnerNumberModel spinModel1 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel spinModel2 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel spinModel3 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel spinModel4 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel spinModel5 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel spinModel6 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel spinModel7 = new SpinnerNumberModel(0.0, 0.0, 100.0, 1.0);
    private SpinnerNumberModel[] spinModelArray = {spinModel1, spinModel2, spinModel3,
    spinModel4, spinModel5, spinModel6, spinModel7};
    private JSpinner quantSpin;
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
        content.add(item, layoutConst);
        
        quantity = new JLabel("Quantity");
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        content.add(quantity, layoutConst);
        
        cost = new JLabel("Cost");
        layoutConst.gridx = 2;
        layoutConst.gridy = 1;
        content.add(cost, layoutConst);
                   
        for (int i = 0; i < station.getStationObjects().length; i++){
            
            actualItem = new JLabel(station.getStationObjects()[i].getName());
            layoutConst.gridx = 0;
            layoutConst.gridy = i + offset;
            content.add(actualItem, layoutConst);
            
            actualQuantity = new JLabel(Integer.toString(station.getStationObjects()[i].getQuantity()));
            layoutConst.gridx = 1;
            layoutConst.gridy = i + offset;
            content.add(actualQuantity, layoutConst);
            
            actualCost = new JLabel("$" + Float.toString(station.getStationObjects()[i].getCost()));
            layoutConst.gridx = 2;
            layoutConst.gridy = i + offset;
            content.add(actualCost, layoutConst);
            
            quantSpin = new JSpinner(spinModelArray[i]);
            layoutConst.gridx = 3;
            layoutConst.gridy = i + offset;
            content.add(quantSpin, layoutConst);
        }
//            System.out.println(storeObject.getName());
//            System.out.println(storeObject.getCost());
//            System.out.println(storeObject.getQuantity());
        
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
