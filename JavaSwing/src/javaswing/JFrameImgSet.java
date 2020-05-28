
package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JFrameImgSet extends JFrame {
    //we need a object of Image
    private ImageIcon icon;
    //we need a object of Contaner
   private Container c;
    //we need a JLabel 
   JLabel Label1,ImageLabel;
    //we declair a constructor for JFrameImgSet
    JFrameImgSet(){
        initCoponant();
        
        
        
    }

    private void initCoponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setBounds(100, 150, 550, 580);
        //this is for appearing the window in center 
      // this.setLocationRelativeTo(null);
       ///we have to create the object and we have to fetch the image
       icon=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\phone.png");
       this.setIconImage(icon.getImage());
       //we want to set title
       this.setTitle("Phone Book ");
       //we want to change the background color of container 
       //so we have to fetch containt pane to c 
       c=this.getContentPane();
       c.setBackground(Color.orange);
       //if you dont want to resize the window 
       //this.setResizable(false);
       //we want to create a JLabel
       Label1=new JLabel();
       Label1.setText("Hello Soumadip");
      
       //now we have to add thus label in contain pane
       c.add(Label1);
       //at first we have to close default contain pane layout 
       c.setLayout(null);
       Label1.setBounds(10, 20, 180, 20);
       
       //now we want to create an another label to show image
       ImageLabel=new JLabel();
       ImageLabel.setBounds(10,40,icon.getIconHeight(),icon.getIconWidth());
       c.add(ImageLabel);
       ImageLabel.setIcon(icon);
       //or you can pass image in the constructor of ImageLabel
       //ImageLabel=new JLabel(icon);
       
       
       
       
    }
    
    public static void main(String[] args) {
        
        
        JFrameImgSet frame=new JFrameImgSet();
    }
    
    
    
}
