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
    private Random rand = new Random();
    private int randInt = rand.nextInt(20);


    
    public Randomize(){
        fruitObjects = new StoreObjects[]{ new Apples(randInt) , new Bananas(randInt) , new Oranges(randInt) };
        soupObjects = new StoreObjects[]{ new TomatoSoup(randInt) , new BroccoliCheddarSoup(randInt) , new ChickenNoodleSoup(randInt) };
        coffeeObjects = new StoreObjects[]{ new FrenchVanillaCoffee(randInt) , new RegularCoffee(randInt) , new SeasonalCoffee(randInt) };
        coolerObjects = new StoreObjects[]{ new CaesarSalad(randInt) , new ChefSalad(randInt) , new HamWrap(randInt), new TurkeyWrap(randInt) , new VeggieWrap(randInt) };
        bakeryObjects = new StoreObjects[]{ new Bagels(randInt) , new Croissants(randInt) , new Donuts(randInt) };
        
        
    }
    
    public StoreObjects[] getFruitInventory()
    {
        return fruitObjects;
    }
    
}
