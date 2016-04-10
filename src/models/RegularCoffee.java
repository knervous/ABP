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
public class RegularCoffee extends StoreObjects{
    
    public RegularCoffee(int rand)
    {
        quantity = rand;
        name = "Regular Coffee";
        cost = 2.50f;
    }
}
