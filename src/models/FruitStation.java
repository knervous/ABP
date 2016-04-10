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

    
    public FruitStation(StoreObjects[] inf_station){
        stationName = "Soup Station";
        station = inf_station;
    }


}
