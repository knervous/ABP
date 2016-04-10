/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.*;
import java.util.Random;

public class Randomize {
    
    
    private StoreObjects[] fruitObjects;
    private StoreObjects[] soupObjects;
    private StoreObjects[] coffeeObjects;
    private StoreObjects[] coolerObjects;
    private StoreObjects[] bakeryObjects;
    
    public Randomize(){
        Random rand = new Random();
        fruitObjects = new StoreObjects[]{ new Apples(rand.nextInt(20)) , new Bananas(rand.nextInt(20)) , new Oranges(rand.nextInt(20)) };

        
    }
    
    public StoreObjects[] getFruitInventory()
    {
        return fruitObjects;
    }
    
}
