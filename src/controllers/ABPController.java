/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.*;
import models.*;
/**
 *
 * @author Paul
 */
public class ABPController {
    
    
    public ABPController()
    {
        TestFrame testFrame = new TestFrame();
        Student student = new Student();
        CharacterMovement charMovement = new CharacterMovement(student);
        AuBonPainPanel abp = new AuBonPainPanel(student, charMovement);
        charMovement.setStations(abp.getCounter(), abp.getCoffee(), abp.getSign(), abp.getTrash(), abp.getBakery(), abp.getFruit(), abp.getSoup(), abp.getCooler());
        
        testFrame.add(abp);
        while(true)
        {
            abp.repaint();
        }
    }
    
}
