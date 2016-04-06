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

public class CharacterMovement implements KeyListener {

    private Student student;
    private int frame = 0;
    private String animation = "left1.png";

    public CharacterMovement(Student inf_Student) {
        student = inf_Student;

    }


    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

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
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_A) {

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
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_W) {
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
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_S) {
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

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public String getAnimation() {
        return animation;
    }

}
