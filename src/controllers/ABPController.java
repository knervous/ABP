package controllers;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import views.*;
import models.*;
import javax.swing.Timer;

/**
 *
 * @author Paul
 */
public class ABPController {

    private AuBonPainPanel abp;
    private Timer gameTimer;
    private Customer student;
    private CharacterMovement charMovement;
    private FoodStations stations;
    private Randomize randomize;
    private MenuPanel menuPanel;

    public ABPController() throws Exception {

        TestFrame testFrame = new TestFrame();
        student = new Customer();
        charMovement = new CharacterMovement();
        stations = new FoodStations();
        abp = new AuBonPainPanel(student, charMovement);
        testFrame.setFocusable(false);
        abp.setFocusable(true);
        randomize = new Randomize();
        
        testFrame.add(abp);

        addKeyListener();
        gameTimer = new Timer(5, new GameTimer());
        gameTimer.start();

        InputStream is;
        Sequencer sequence;
        sequence = MidiSystem.getSequencer();
        sequence.open();
        is = new BufferedInputStream(new FileInputStream(new File("beatit.mid")));
        sequence.setSequence(is);
        sequence.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        sequence.start();
        is.close();

    }

    class GameTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            abp.repaint();

        }
    }

    public static void triggerMenu(StoreObjects[] storeObjects, FoodStations station) {
        //MenuPanel menuPanel = new MenuPanel(storeObjects, station);
    }

    private void addKeyListener() {
        abp.requestFocusInWindow();
        abp.setKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                int oldX = student.x;
                int oldY = student.y;

                if (ke.getKeyCode() == KeyEvent.VK_RIGHT || ke.getKeyCode() == KeyEvent.VK_D) {
                    if (charMovement.getFrame() < 5) {
                        charMovement.setAnimation(student.getAnimation()[0]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() >= 5 && charMovement.getFrame() < 10) {
                        charMovement.setAnimation(student.getAnimation()[1]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() > 9) {
                        charMovement.setFrame(0);
                    }
                    student.x = student.x + 5;
                } else if (ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_A) {

                    if (charMovement.getFrame() < 5) {
                        charMovement.setAnimation(student.getAnimation()[2]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() >= 5 && charMovement.getFrame() < 10) {
                        charMovement.setAnimation(student.getAnimation()[3]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() > 9) {
                        charMovement.setFrame(0);
                    }
                    student.x = student.x - 5;
                } else if (ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_W) {
                    if (charMovement.getFrame() < 5) {
                        charMovement.setAnimation(student.getAnimation()[4]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() >= 5 && charMovement.getFrame() < 10) {
                        charMovement.setAnimation(student.getAnimation()[5]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() > 9) {
                        charMovement.setFrame(0);
                    }
                    student.y = student.y - 5;
                } else if (ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_S) {
                    if (charMovement.getFrame() < 5) {
                        charMovement.setAnimation(student.getAnimation()[6]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() >= 5 && charMovement.getFrame() < 10) {
                        charMovement.setAnimation(student.getAnimation()[7]);
                        charMovement.setFrame(charMovement.getFrame() + 1);
                    } else if (charMovement.getFrame() > 9) {
                        charMovement.setFrame(0);
                    }
                    student.y = student.y + 5;
                }

                if (!charMovement.getAnimation().equals(charMovement.getFacing())) {
                    charMovement.setIsInteracting(false);
                }

                for (Rectangle station : abp.getStations()) {
                    if (student.intersects(station)) {
                        charMovement.setIsInteracting(true);
                        charMovement.setFacing(charMovement.getAnimation());
                        student.x = oldX;
                        student.y = oldY;
                        charMovement.setStationNumber(abp.getStations().indexOf(station));
                    }

                }

                if (ke.getKeyCode() == KeyEvent.VK_SPACE && charMovement.getIsInteracting()) {

                    switch (charMovement.getStationNumber()) {

                        case 0:
                            System.out.println("counter initiated");
//                    FrontCounterStation fC = new FrontCounterStation();
//                    Counter c = new Counter();
//                    try{
//                        ABPController abp = new ABPController(c, fC);
//                    }
//                    catch(Exception e){
//                        e.printStackTrace("luke ");
//                    }
                            break;
                        case 1:
//                            System.out.println("coffee initiated");
                            menuPanel = new MenuPanel(new CoffeeStation(randomize.getCoffeeObjects()));
                            break;
                        case 2:
//                            System.out.println("sign initiated");
                            break;
                        case 3:
//                            System.out.println("trash initiated");
                            break;
                        case 4:
//                            System.out.println("bakery initiated");
                            menuPanel = new MenuPanel(new BreadStation(randomize.getBakeryObjects()));
                            break;
                        case 5:
//                            System.out.println("fruit initiated");
                            menuPanel = new MenuPanel(new FruitStation(randomize.getFruitObjects()));
                            break;
                        case 6:
//                            System.out.println("soup initiated");
                            menuPanel = new MenuPanel(new SoupStation(randomize.getSoupObjects()));
                            break;
                        case 7:
//                            System.out.println("cooler initiated");
                            menuPanel = new MenuPanel(new CoolerStation(randomize.getCoolerObjects()));
                            break;

                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        });

    }
}
