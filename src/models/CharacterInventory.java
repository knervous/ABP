/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Paul
 */
import java.util.*;
public class CharacterInventory {
    
    private ArrayList<StoreObjects> inventoryObjects;
    
    
    public CharacterInventory()
    {
        inventoryObjects = new ArrayList<>();
        inventoryObjects.add(new StoreObjects("Used Napkin",0.0f,1));
    }
    
    public ArrayList<StoreObjects> getInventoryObjects()
    {
        return inventoryObjects;
    }
    
    public void addItem(StoreObjects item, double inf_quantity)
    {
        int quantity = (int) inf_quantity;
        
        for(int i = 0; i<quantity; i++)
        {
            inventoryObjects.add(item);
        }
    }
    
    public void updateInventory()
    {
        
    }
    
}
