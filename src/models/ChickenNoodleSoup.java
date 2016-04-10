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
public class ChickenNoodleSoup extends StoreObjects{
    
    public ChickenNoodleSoup(int rand)
    {
        quantity = rand;
        name = "Chicken Noodle Soup";
        cost = 6.50f;
    }
}
