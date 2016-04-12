/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author greg
 */
public class StoreObjects {
    
    protected String name;
    protected float cost;
    protected int quantity;
    protected boolean paidFor;
    
    public StoreObjects()
    {
        
    
   
    }
    public StoreObjects(String inf_name, float inf_cost, int inf_quantity)
    {
        name = inf_name;
        cost = inf_cost;
        quantity = inf_quantity;
        paidFor = false;
    }
    
   public String getName()
   {
       return name;
   }
   
   public float getCost()
   {
       return cost;
   }
    
   public int getQuantity()
   {
       return quantity;
   }
   
   public void setQuantity(int set)
   {
       quantity = set;
   }
   
   public boolean getPaidFor()
   {
       return paidFor;
   }
   
   public void setPaidFor(boolean set)
   {
       paidFor = set;
   }
}




