
package javaswing;

import javax.swing.JFrame;


public class FrameDemo {
    
    public static void main(String[] args) {
       JFrame frame=new JFrame(); //object created
       frame.setVisible(true);
       //for  close operation perform
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //to initilize frame size
//       frame.setSize(400,300);
       
       //we want to show this frame in center
       //frame.setLocationRelativeTo(null);
        //another waya to show this frame to center 
//        frame.setLocation(200,100);
        
//another waya you have to use setBounds method perform combine of setSize and setLocation method
        // at first two parameter use to left and right position and
//        then you give next two parameter for window size
        frame.setBounds(200, 100, 400, 300);
        
        frame.setTitle("Frame Demo");
        
        //if dont want to permission to user to resize the frame
        frame.setResizable(false);
        
        
        
    }
    
}
