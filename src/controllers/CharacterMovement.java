/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Paul
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
public class CharacterMovement implements KeyListener {



    private String animation = "charleft1.png";
    private boolean isWalking;
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        isWalking = true;
        
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            animation = "charright1.png";
            
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            animation = "charleft1.png";
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            animation = "charup1.png";
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            animation = "chardown1.png";
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
        
        
    }
    
    public String getAnimation()
    {
        return animation;
    }
    
    
    

    
}
