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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.awt.*;

public class CharacterMovement implements KeyListener {

    private Student student;
    private int frame = 0;
    private String animation = "left1.png";
    private String stationFound = "";
    private ArrayList<Rectangle> stations = new ArrayList<>();
    private int oldX;
    private int oldY;

    public CharacterMovement(Student inf_Student) {
        student = inf_Student;

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        oldX = student.x;
        oldY = student.y;
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT || ke.getKeyCode() == KeyEvent.VK_D) {
            if (frame < 5) {
                animation = student.getAnimation()[0];
                frame++;
            } else if (frame >= 5 && frame < 10) {
                animation = student.getAnimation()[1];
                frame++;
            } else if (frame > 9) {
                frame = 0;
            }
            student.x = student.x + 5;
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_A) {

            if (frame < 5) {
                animation = student.getAnimation()[2];
                frame++;
            } else if (frame >= 5 && frame < 10) {
                animation = student.getAnimation()[3];
                frame++;
            } else if (frame > 9) {
                frame = 0;
            }
            student.x = student.x - 5;
        } else if (ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_W) {
            if (frame < 5) {
                animation = student.getAnimation()[4];
                frame++;
            } else if (frame >= 5 && frame < 10) {
                animation = student.getAnimation()[5];
                frame++;
            } else if (frame > 9) {
                frame = 0;
            }
            student.y = student.y - 5;
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_S) {
            if (frame < 5) {
                animation = student.getAnimation()[6];
                frame++;
            } else if (frame >= 5 && frame < 10) {
                animation = student.getAnimation()[7];
                frame++;
            } else if (frame > 9) {
                frame = 0;
            }
            student.y = student.y + 5;
        }

        intersects();

        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            if (stationFound.equalsIgnoreCase("coffee") && 
                Math.abs(student.getCenterX() - stations.get(1).getCenterX()) < 200 && 
                Math.abs(student.getCenterY() - stations.get(1).getCenterY()) < 75) 
            {
                System.out.println("coffee initiated");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public String getAnimation() {
        return animation;
    }

    public void setStations(Rectangle counter, Rectangle coffee, Rectangle sign,
            Rectangle trash, Rectangle bakery, Rectangle fruit, Rectangle soup,
            Rectangle cooler) {
        stations.add(counter);
        stations.add(coffee);
        stations.add(sign);
        stations.add(trash);
        stations.add(bakery);
        stations.add(fruit);
        stations.add(soup);
        stations.add(cooler);
    }

    private void intersects() {
        if (student.intersects(stations.get(0))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "counter";
            System.out.println("counter found");
        }
        if (student.intersects(stations.get(1))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "coffee";
            System.out.println("coffee found");
        }
        if (student.intersects(stations.get(2))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "sign";
            System.out.println("sign found");
        }
        if (student.intersects(stations.get(3))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "trash";
            System.out.println("trash found");
        }
        if (student.intersects(stations.get(4))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "bakery";
            System.out.println("bakery found");
        }
        if (student.intersects(stations.get(5))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "fruit";
            System.out.println("fruit found");
        }
        if (student.intersects(stations.get(6))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "soup";
            System.out.println("soup found");
        }
        if (student.intersects(stations.get(7))) {
            student.x = oldX;
            student.y = oldY;
            stationFound = "cooler";
            System.out.println("cooler found");
        }
    }

}
