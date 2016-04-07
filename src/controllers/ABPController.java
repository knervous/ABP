///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controllers;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.Sequencer;
//import views.*;
//import models.*;
///**
// *
// * @author Paul
// */
//public class ABPController {
//    
//    
//    public ABPController() throws Exception
//    {
//        TestFrame testFrame = new TestFrame();
//        Customer student = new Customer();
//        CharacterMovement charMovement = new CharacterMovement(student);
//        AuBonPainPanel abp = new AuBonPainPanel(student, charMovement);
//        charMovement.setStations(abp.getCounter(), abp.getCoffee(), abp.getSign(), abp.getTrash(), abp.getBakery(), abp.getFruit(), abp.getSoup(), abp.getCooler());
//        testFrame.add(abp);
//        
////        InputStream is;
////        Sequencer sequence;
////        sequence = MidiSystem.getSequencer();
////        sequence.open();
////        is = new BufferedInputStream(new FileInputStream(new File("beatit.mid")));
////        sequence.setSequence(is);
////        sequence.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
////        sequence.start();
////        is.close();
//        while(true)
//        {
//            abp.repaint();
//        }
//    }
//    
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import views.*;
import models.*;
/**
 *
 * @author Paul
 */
public class ABPController {
   
    public ABPController() throws Exception
    {
        TestFrame testFrame = new TestFrame();
        Customer student = new Customer();
        CharacterMovement charMovement = new CharacterMovement(student);
        AuBonPainPanel abp = new AuBonPainPanel(student, charMovement);
        charMovement.setStations(abp.getCounter(), abp.getCoffee(), abp.getSign(), abp.getTrash(), abp.getBakery(), abp.getFruit(), abp.getSoup(), abp.getCooler());
        testFrame.add(abp);
        
//        InputStream is;
//        Sequencer sequence;
//        sequence = MidiSystem.getSequencer();
//        sequence.open();
//        is = new BufferedInputStream(new FileInputStream(new File("beatit.mid")));
//        sequence.setSequence(is);
//        sequence.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
//        sequence.start();
//        is.close();
        while(true)
        {
            abp.repaint();
        }
    }
    
}
