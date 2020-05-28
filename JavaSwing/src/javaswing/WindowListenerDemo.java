
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListenerDemo extends JFrame implements WindowListener{
    private Container c;
    
    
    WindowListenerDemo(){
        initComponant();
    }

    private void initComponant() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,400);
        this.setLocationRelativeTo(null);
        this.setTitle("Window Listener Demo");
        
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        this.addWindowListener(this);
        
        
        
    }
    
    
    public static void main(String[] args) {
        WindowListenerDemo test=new WindowListenerDemo();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window is Oppened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closeing.");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window is closed.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window is iconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window is Diconified.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window is activated.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is dactivated.");
    
    }
    
}
