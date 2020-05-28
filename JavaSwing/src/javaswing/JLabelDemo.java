
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabelDemo extends JFrame {
    private Container c;
    private JLabel label;
    private ImageIcon icon;
    
    JLabelDemo(){
        intiComponant();
    }

    private void intiComponant() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,400);
        this.setLocationRelativeTo(null);
        this.setTitle("Window Listener Demo");
        this.setResizable(false);
        
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        icon=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\login\\img\\user_1.png");
        
        
        
        
        label=new JLabel("User",icon,JLabel.CENTER);
        label.setBounds(120,60,200,200);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.white);
        c.setLayout(null);
        c.add(label);
        

        
        
    }
    
    
    public static void main(String[] args) {
        JLabelDemo test=new JLabelDemo();
        
    }
    
    
    
}
