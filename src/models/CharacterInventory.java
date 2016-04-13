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
import static jdk.nashorn.internal.objects.NativeArray.map;
public class CharacterInventory {
    
    private ArrayList<StoreObjects> inventoryObjects;
    private Map<String, Integer> map;
    
    public CharacterInventory()
    {
        inventoryObjects = new ArrayList<>();
        inventoryObjects.add(new StoreObjects("Used Napkin",0.0f,1));
        this.map = new HashMap<>();
    }
    
    public ArrayList<StoreObjects> getInventoryObjects()
    {
        return inventoryObjects;
    }
    
    public void addItem(StoreObjects item, double inf_quantity)
    {
        int quantity = (int) inf_quantity;
        map.put(item.getName(), quantity);
        for(int i = 0; i<quantity; i++)
        {
            inventoryObjects.add(item);
        }
    }
    
    public Map<String, Integer> getMap()
    {
        return map;
    }
    
    public void updateInventory()
    {
        
    }
    
}
