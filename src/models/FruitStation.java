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
public class FruitStation extends FoodStations{
    
    
    protected String stationName = "Fruit Station";
    protected Apples apples = new Apples();
    protected Bananas bananas = new Bananas();
    protected Oranges oranges = new Oranges();
    
    public FruitStation(){
        this.apples = apples;
        this.bananas = bananas;
        this.oranges = oranges;
        
    }


}
