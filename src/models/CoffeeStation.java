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
public class CoffeeStation extends Stations{
    protected String name = "Coffee Station";
    protected RegularCoffee regCoffee = new RegularCoffee();
    protected FrenchVanillaCoffee frenchVanillaCoffee = new FrenchVanillaCoffee();
    protected SeasonalCoffee seasonalCoffee = new SeasonalCoffee();
    protected StoreObjects[] coffee = {regCoffee, frenchVanillaCoffee, seasonalCoffee};
    
    public CoffeeStation(){
        this.regCoffee = regCoffee;
        this.frenchVanillaCoffee = frenchVanillaCoffee;
        this.seasonalCoffee = seasonalCoffee;
    }
}
