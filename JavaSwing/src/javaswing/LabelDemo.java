
package javaswing;

//we can inherit the JFrame class 

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LabelDemo extends JFrame{
    //declair a icon object for set icon
    ImageIcon icon;
    //we need a contaner 
    private Container c1;
    //we need a object of font class
    Font f;
    
    
    
    //we want to declair a lebel
    private JLabel userLabel,passLabel;
    //declair a constructor to create frame
    LabelDemo(){
        initComponant();//we call the initComponant() method
        c1.setBackground(Color.YELLOW);
        
    }
    
    //we declair a method to initifize all the property of JFrame class
    public void initComponant(){
        //at first we have to set visable for the window 
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 150, 450, 350);
        //we have to create icon
        icon=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\phone.png");
        this.setIconImage(icon.getImage());
        
        this.setTitle("Home Page");
        
         //we have to initilize the container
       c1 =this.getContentPane();
       //we have to create font
       f=new Font("Arial",Font.BOLD,14);
       
       
       
       //we want to create jlable
       userLabel=new JLabel();
       //we want to change user label font style
      userLabel.setFont(f);
       userLabel.setText("Enter Your User Name: ");
       //we want to change forground color 
       userLabel.setForeground(Color.red);
       //we want to change background color 
       userLabel.setOpaque(true);
       userLabel.setBackground(Color.LIGHT_GRAY);//only for jlabel we have to use setOpaque 
       //we want to add a tips in user label
       userLabel.setToolTipText("enter your user name");

        //here we add the level in contant pane 
       c1.add(userLabel);
       //default layout null created 
       c1.setLayout(null);
       userLabel.setBounds(50, 20, 250, 50);
       //for initilize passlabel
        passLabel=new JLabel("Enter Your Password: ");
       //passLabel.setText("Enter Your Password: ");
       //we want to change passLabel font
       passLabel.setFont(f);
       
       
       c1.add(passLabel);
       c1.setLayout(null);
       passLabel.setBounds(50, 60, 250, 50);
       
       
       
       
       
    }
 /*   //constructor overloading
   LebelDemo(int h,int w,int f_h,int f_w){
       
       this.initComponant(h,w,f_h,f_w);
        //we have to initilize the container
       
      
   } */
    
  /*  //METHOD OVER LOADING FOR USER INITILIZE 
    public void initComponant(int height,int width,int frame_height,int frame_width){
        this.setBounds(height,width,frame_height,frame_width);
        this.setVisible(true);
        //we dont want to initilize this in this method if we initilize this in this method 
        //for one frame close operation effect every object of this class
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //we have to initilize the container
       c1 =this.getContentPane();
        c1.setBackground(Color.ORANGE);
       
    }
    */
    
    
    
    
    
    //this is main function
    public static void main(String[] args) {
        LabelDemo frame=new LabelDemo();
//        LebelDemo frame2=new LebelDemo(100,50,300,400);
//       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
