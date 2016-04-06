/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import models.*;
import controllers.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AuBonPainPanel extends JPanel {

    private Rectangle counter;
    private Rectangle coffee;
    private Rectangle sign;
    private Rectangle trash;
    private Rectangle bakery;
    private Rectangle fruit;
    private Rectangle soup;
    private Rectangle cooler;
    private JButton exitOutside;
    private JButton exitCompSci;
    private CharacterMovement characterMovement;
    private Student student;
    private int frame = 0;

    private JLabel temp = new JLabel();

    public AuBonPainPanel(Student inf_Student, CharacterMovement inf_charMovement) {
        super();
        student = inf_Student;
        characterMovement = inf_charMovement;
        setSize(800, 600);
        setLayout(null);
        add(temp);
        temp.setBounds(200, 200, 200, 200);
        init();
        placeStations();
        this.addKeyListener(characterMovement);

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

    private void init() {

        counter = new Rectangle();

        coffee = new Rectangle();

        sign = new Rectangle();

        trash = new Rectangle();

        bakery = new Rectangle();

        fruit = new Rectangle();

        soup = new Rectangle();

        cooler = new Rectangle();

    }

    private void placeStations() {
        student.setBounds(700, 400, student.width, student.height);
        counter.setBounds(622, 158, 160, 192);
        coffee.setBounds(201, 513, 309, 40);
        sign.setBounds(86, 355, 50, 45);
        trash.setBounds(59, 492, 114, 62);
        bakery.setBounds(5, 132, 50, 150);
        fruit.setBounds(28, 5, 75, 65);
        soup.setBounds(146, 17, 144, 40);
        cooler.setBounds(318, 26, 310, 30);

    }
    
    public Rectangle getCounter()
    {
        return counter;
    }
    
    public Rectangle getCoffee()
    {
        return coffee;
    }
    
    public Rectangle getSign()
    {
        return sign;
    }
    
    public Rectangle getTrash()
    {
        return trash;
    }
    
    public Rectangle getBakery()
    {
        return bakery;
    }
    
    public Rectangle getFruit()
    {
        return fruit;
    }
    
    public Rectangle getSoup()
    {
        return soup;
    }
    
    public Rectangle getCooler()
    {
        return cooler;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(new ImageIcon("floor.png").getImage(), 0, 0, null);
        g.drawImage(new ImageIcon(characterMovement.getAnimation()).getImage(), student.x, student.y, null);

    }

}
