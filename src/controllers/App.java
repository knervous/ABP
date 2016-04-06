package controllers;
import views.*;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TestFrame testFrame = new TestFrame();
        AuBonPainPanel abp = new AuBonPainPanel();
        testFrame.add(abp);
        while(true)
        {
            abp.repaint();
        }
        
    }
    
}
