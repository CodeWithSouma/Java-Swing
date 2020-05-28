//joption pane 
package javaswing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MessageDialog2 {
    public static void main(String[] args) {
        //image icon class for add image 
        ImageIcon img=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\Images\\phone.png");
        
        JOptionPane.showMessageDialog(null, "Hello Souma You hava enter Wrong Password.", "Warnning", 2,img);
        
        
        
    }
    
}
