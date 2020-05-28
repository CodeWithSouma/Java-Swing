
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame2 {
    private ImageIcon icon;//object declair
    JFrame frame=new JFrame();
    //container store the whole ContainPane of the frame
    private Container c;
    //at first we want to create an constructor and a method
    Frame2(){
        initComponants();//this is a method
    }
    
    //this is public method that is call from constructor
    public void initComponants(){
        
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,250,300,350);
        frame.setTitle("This is for Title");
        
        //we want to set icon in our jframe
        icon=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\phone.png");//object created / initialize
        frame.setIconImage(icon.getImage());
        c=frame.getContentPane();
        c.setBackground(Color.red);
        //another waya to change background color of frame
//        frame.getContentPane().setBackground(Color.blue);
       
        
    }
    
    
    //this is main function
    public static void main(String[] args) {
        
        Frame2 frame=new Frame2();
        
        
    }
    
}
