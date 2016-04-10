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
public class TomatoSoup extends StoreObjects{
    
    public TomatoSoup(int rand)
    {
        quantity = rand;
        name = "Tomato Soup";
        cost = 6.00f;
    }
}
