/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuBonPainPanel extends JPanel {
    
    private JButton counter;
    private ImageIcon counterImage;

    
    public AuBonPainPanel()
    {
        super();
        setSize(800,600);
        setLayout(null);
        
        init();
        placeButtons();
    }
    
    private void init()
    {
        counter = new JButton();
        add(counter);
        counterImage = new ImageIcon("counter.png");
        
        

        counter.setOpaque(false);
        counter.setContentAreaFilled(false);
        counter.setBorderPainted(false);
        counter.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("test");
            }
            
        });
    }
    
    private void placeButtons()
    {
        counter.setBounds(600,300,200,350);
        
    }
    @Override
    protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        g.drawImage(new ImageIcon("floor.png").getImage(), 0, 0, null);
    }
    
}
