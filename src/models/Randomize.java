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

    
    public Randomize(){
        fruitObjects = new StoreObjects[]{ new Apples(rand.nextInt(20)) , new Bananas(rand.nextInt(20)) , new Oranges(rand.nextInt(20)) };
        soupObjects = new StoreObjects[]{ new TomatoSoup(rand.nextInt(20)) , new BroccoliCheddarSoup(rand.nextInt(20)) , new ChickenNoodleSoup(rand.nextInt(20)) };
        coffeeObjects = new StoreObjects[]{ new FrenchVanillaCoffee(rand.nextInt(20)) , new RegularCoffee(rand.nextInt(20)) , new SeasonalCoffee(rand.nextInt(20)) };
        coolerObjects = new StoreObjects[]{ new CaesarSalad(rand.nextInt(20)) , new ChefSalad(rand.nextInt(20)) , new HamWrap(rand.nextInt(20)), new TurkeyWrap(rand.nextInt(20)) , new VeggieWrap(rand.nextInt(20)) };
        bakeryObjects = new StoreObjects[]{ new Bagels(rand.nextInt(20)) , new Croissants(rand.nextInt(20)) , new Donuts(rand.nextInt(20)) };
    }

    /**
     * @return the fruitObjects
     */
    public StoreObjects[] getFruitObjects() {
        return fruitObjects;
    }

    /**
     * @return the soupObjects
     */
    public StoreObjects[] getSoupObjects() {
        return soupObjects;
    }

    /**
     * @return the coffeeObjects
     */
    public StoreObjects[] getCoffeeObjects() {
        return coffeeObjects;
    }

    /**
     * @return the coolerObjects
     */
    public StoreObjects[] getCoolerObjects() {
        return coolerObjects;
    }

    /**
     * @return the bakeryObjects
     */
    public StoreObjects[] getBakeryObjects() {
        return bakeryObjects;
    }
    
}
