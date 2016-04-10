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
public class Donuts extends StoreObjects{
    
    public Donuts(int rand)
    {
        quantity = rand;
        name = "Donut";
        cost = 1.50f;
    }
}
