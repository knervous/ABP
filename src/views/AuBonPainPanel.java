/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
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

public class AuBonPainPanel extends JPanel implements KeyListener {
    
    private JButton counter;
    private JButton coffee;
    private JButton sign;
    private JButton trash;
    private JButton bakery;
    private JButton fruit;
    private JButton soup;
    private JButton cooler;
    private JButton exitOutside;
    private JButton exitCompSci;
    private CharacterMovement charMovement;
    private Rectangle player = new Rectangle();
    private String animation = "charleft1.png";
    
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
        this.addKeyListener(this);
                
//        this.addMouseMotionListener(new MouseAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e)
//            {
//                System.out.println(e.getPoint());
//                temp.setText(e.getPoint().toString());
//            }
//        });
        this.setFocusable(true);
    }
    
    private void init()
    {
        charMovement = new CharacterMovement();
        
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
        player.setBounds(300,300,50,50);
        counter.setBounds(639,163,40,150);
        coffee.setBounds(221,513,289,40);
        sign.setBounds(86,355,50,45);
        trash.setBounds(59,492,114,62);
        bakery.setBounds(5,132,50,150);
        fruit.setBounds(28,5,90,90);
        soup.setBounds(146,17,144,83);
        cooler.setBounds(318,26,310,76);
        
        
    }
    
    
    
    
    @Override
    protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        
        g.drawImage(new ImageIcon("floor.png").getImage(), 0, 0, null);
        g.drawImage(new ImageIcon(animation).getImage(), player.x, player.y, null);
        

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }


    
    @Override
    public void keyPressed(KeyEvent ke) {
        
        
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            animation = "charright1.png";
            player.x = player.x + 5;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            animation = "charleft1.png";
            player.x = player.x - 5;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            animation = "charup1.png";
            player.y = player.y - 5;
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            animation = "chardown1.png";
            player.y = player.y +5;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
        
        
    }
    
}
