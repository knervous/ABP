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
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner.DefaultEditor;
import java.awt.*;

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
    private JButton grabItems = new JButton();
    private JSpinner quantSpin;
    private FoodStations infStation;
    private ArrayList<JSpinner> allSpinners = new ArrayList<JSpinner>();
    private int offset = 2;
    private GridBagConstraints layoutConst = new GridBagConstraints();
    private JPanel content = new JPanel();
    
    
    public void populateFoodMenu(FoodStations station){
        infStation = station;
        content.removeAll();
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
        
        int i = 0;
                   
        while (i < station.getStationObjects().length){
            
            actualItem = new JLabel(station.getStationObjects()[i].getName());
            layoutConst.gridx = 0;
            layoutConst.gridy = i + offset;
            content.add(actualItem, layoutConst);
            
            actualQuantity = new JLabel(Integer.toString(station.getStationObjects()[i].getQuantity()));
            layoutConst.gridx = 1;
            layoutConst.gridy = i + offset;
            content.add(actualQuantity, layoutConst);
            
            actualCost = new JLabel(String.format("$%.2f",station.getStationObjects()[i].getCost()));
            layoutConst.gridx = 2;
            layoutConst.gridy = i + offset;
            content.add(actualCost, layoutConst);
            
            quantSpin = new JSpinner(new SpinnerNumberModel(0.0, 0.0, station.getStationObjects()[i].getQuantity(), 1.0));
            layoutConst.gridx = 3;
            layoutConst.gridy = i + offset;
            content.add(quantSpin, layoutConst);
            
            i++;
            allSpinners.add(quantSpin);
            for(JSpinner spinner : allSpinners)
            {
                ((DefaultEditor) spinner.getEditor()).getTextField().setEditable(false);
            }
        }
        grabItems = new JButton("Grab Items");
        layoutConst.gridx = 0;
        layoutConst.gridy = i + offset + 1;
        content.add(grabItems, layoutConst);
        
        this.setContentPane(content);
        this.pack();
        this.setTitle(station.getStationName());
        setVisible(true);
    }
    
    
    public void addItemsToInv(ActionListener al){    
       grabItems.addActionListener(al);
    }
    
    public double getSpinnerValue(int i)
    {
        return (double) allSpinners.get(i).getValue();
    }
    
    public StoreObjects[] getStoreObjects()
    {
        return infStation.getStationObjects();
    }
    
    public void populateTrashMenu(TrashStation trashStation)
    {
        
    }
    
    public void populateCounterMenu(FrontCounterStation counterStation)
    {
        
    }
    
    public void populateSignMenu(SignStation signStation)
    {
        
    }
}
