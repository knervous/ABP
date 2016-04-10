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
public class Bagels extends StoreObjects{
    
    public Bagels(int rand)
    {
        quantity = rand;
        name = "Bagle";
        cost = 1.50f;
    }
}
