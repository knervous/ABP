/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import javax.swing.*;

/**
 *
 * @author Paul
 */
public class TestFrame extends JFrame {
    
    public TestFrame()
    {
        super();
        setSize(800,600);
        setVisible(true);
        validate();
        add(new AuBonPainPanel());
    }
    
}
