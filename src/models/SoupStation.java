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
public class SoupStation extends FoodStations{
    

    protected BroccoliCheddarSoup brocCheddarSoup = new BroccoliCheddarSoup();
    protected ChickenNoodleSoup chickenNoodleSoup = new ChickenNoodleSoup();
    protected TomatoSoup tomatoSoup = new TomatoSoup();
    
    public SoupStation(){

        stationName = "Soup Station";
        station = new StoreObjects[]{brocCheddarSoup, chickenNoodleSoup, tomatoSoup};
    }

}
