//another waya to create jframe

package javaswing;

import javax.swing.JFrame;


public class Frame {
    //we declair a constructor to create a frame
    Frame(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 200, 400, 450);
        frame.setTitle("This a Title");
        
    }
    
    
    
    
    public static void main(String[] args) {
      /*  JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
//        frame.setSize(500, 300);
//        //user define position 
//        frame.setLocation(100,150);//to shift 100px from x axis and to shift to bottom  150px
//        frame.setLocationRelativeTo(null);//for position ing center
//        
        
        //thise two setSize and setLocation method combine using setBounds method
        frame.setBounds(100, 150, 400, 300);*/
      
      
//      second  waya to create jframe using inheritence 
// at first you have to inherite the JFrame class now all the property of jframe is now 
//this class property you can declair this class object to create a frame
    

//third waya to create jframe  you can create this frame in this class constructor
        Frame frame=new Frame();


        
        
        
        
        
    }
    
    
}
