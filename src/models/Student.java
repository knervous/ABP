/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Paul
 */
import java.awt.*;
public class Student extends Rectangle{
    
    private String name;
    private String gender;
    private String[] animation;
    
    public Student()
    {
        animation = new String [] {"right1.png" , "right2.png" , "left1.png" , "left2.png" , "up1.png" , "up2.png" , "down1.png" , "down2.png"};
    }
    
    
    public String[] getAnimation()
    {
        return animation;
    }
}
