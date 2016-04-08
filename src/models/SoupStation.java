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
public class SoupStation extends Stations{
    protected String stationName = "Soup Station";
    protected BroccoliCheddarSoup brocCheddarSoup = new BroccoliCheddarSoup();
    protected ChickenNoodleSoup chickenNoodleSoup = new ChickenNoodleSoup();
    protected TomatoSoup tomatoSoup = new TomatoSoup();
    protected StoreObjects[] soups = {brocCheddarSoup, chickenNoodleSoup, tomatoSoup};
    
    public SoupStation(){
        this.brocCheddarSoup = brocCheddarSoup;
        this.chickenNoodleSoup = chickenNoodleSoup;
        this.tomatoSoup = tomatoSoup;
    }
}
