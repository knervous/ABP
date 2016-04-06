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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AuBonPainPanel extends JPanel {
    
    private JButton counter;
    private JButton coffee;
    private JButton napkins;
    private JButton utensils;
    private JButton sign;
    private JButton trash;
    private JButton bakery;
    private JButton fruit;
    private JButton soup;
    private JButton cooler;
    
    private JLabel temp = new JLabel();
    
    public AuBonPainPanel()
    {
        super();
        setSize(800,600);
        setLayout(null);
        add(temp);
        temp.setBounds(200,200,200,200);
        init();
        placeButtons();
        
                
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e)
            {
                System.out.println(e.getPoint());
                temp.setText(e.getPoint().toString());
            }
        });
        this.setFocusable(true);
    }
    
    private void init()
    {
        counter = new JButton();
        add(counter);
        counter.setOpaque(false);
        counter.setContentAreaFilled(false);
        counter.setBorderPainted(true);
        
        coffee = new JButton();
        add(coffee);
        coffee.setOpaque(false);
        coffee.setContentAreaFilled(false);
        coffee.setBorderPainted(true);
        
        napkins = new JButton();
        add(napkins);
        napkins.setOpaque(false);
        napkins.setContentAreaFilled(false);
        napkins.setBorderPainted(true);
        
        utensils = new JButton();
        add(utensils);
        utensils.setOpaque(false);
        utensils.setContentAreaFilled(false);
        utensils.setBorderPainted(true);
        
        sign = new JButton();
        add(sign);
        sign.setOpaque(false);
        sign.setContentAreaFilled(false);
        sign.setBorderPainted(true);
        
        trash = new JButton();
        add(trash);
        trash.setOpaque(false);
        trash.setContentAreaFilled(false);
        trash.setBorderPainted(true);
        
        bakery = new JButton();
        add(bakery);
        bakery.setOpaque(false);
        bakery.setContentAreaFilled(false);
        bakery.setBorderPainted(true);
        
        fruit = new JButton();
        add(fruit);
        fruit.setOpaque(false);
        fruit.setContentAreaFilled(false);
        fruit.setBorderPainted(true);
        
        soup = new JButton();
        add(soup);
        soup.setOpaque(false);
        soup.setContentAreaFilled(false);
        soup.setBorderPainted(true);
        
        cooler = new JButton();
        add(cooler);
        cooler.setOpaque(false);
        cooler.setContentAreaFilled(false);
        cooler.setBorderPainted(true);
        
    }
    
    private void placeButtons()
    {
        counter.setBounds(639,163,40,150);
        coffee.setBounds(392,491,92,50);
        napkins.setBounds(311,516,50,30);
        utensils.setBounds(244,500,40,50);
        
        
    }
    @Override
    protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        g.drawImage(new ImageIcon("floor.png").getImage(), 0, 0, null);

    }
    
}
