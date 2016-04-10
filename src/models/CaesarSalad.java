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
public class CaesarSalad extends StoreObjects{
    
    public CaesarSalad(int rand)
    {
        quantity = rand;
        name = "Caesar Salad";
        cost = 3.50f;
    }
}
