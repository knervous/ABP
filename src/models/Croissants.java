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
public class Croissants extends StoreObjects{
    
    public Croissants(int rand)
    {
        quantity = rand;
        name = "Croissant";
        cost = 1.50f;
    }
}
