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
public class BreadStation extends FoodStations{
    protected String stationName = "Bread Station";
    protected Bagels bagels = new Bagels();
    protected Croissants croissants = new Croissants();
    protected Donuts donuts = new Donuts();
    protected StoreObjects[] breads = {bagels, croissants, donuts};
    
//    public BreadStation(){
//        this.bagels = bagels;
//        this.croissants = croissants;
//        this.donuts = donuts;
//    }
}
