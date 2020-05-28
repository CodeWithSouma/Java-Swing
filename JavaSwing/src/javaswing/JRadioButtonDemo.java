
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
 


public class JRadioButtonDemo extends JFrame {
   private Container c;
   private JLabel label,label2;
   private JRadioButton rb1,rb2,rb3;
   private ButtonGroup gender;
  
   JRadioButtonDemo(){
       
       intiComponant();
        
       
    }

    private void intiComponant() {

        this.setVisible(true);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setTitle("JRadio Button Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        label=new JLabel("This are radio button : ");
        label.setBounds(10,10,200,20);
        label.setForeground(Color.red);
        c.setLayout(null);
        c.add(label);
        
        label2=new JLabel("Gender: ");
        label2.setBounds(10,50,150,20);
       // c.setLayout(null);
        c.add(label2);
        
        rb1=new JRadioButton("Male");
        rb1.setBounds(70, 41, 70, 40);
        rb1.setBackground(Color.LIGHT_GRAY);
       // c.setLayout(null);
        c.add(rb1);
        
        rb2=new JRadioButton("Female");
        rb2.setBounds(135, 41, 70, 40);
        rb2.setBackground(Color.LIGHT_GRAY);
        //c.setLayout(null);
        c.add(rb2);
        
        rb3=new JRadioButton("Other");
        rb3.setBounds(205, 41, 70, 40);
        rb3.setBackground(Color.LIGHT_GRAY);
       // c.setLayout(null);
        c.add(rb3);
        
        ///by default first button select
        rb1.setSelected(true);
        ///by default desable rb3
        //rb3.setEnabled(false);
        
        
        //now we create a button group
        gender=new ButtonGroup();
        gender.add(rb1);
        gender.add(rb2);
        gender.add(rb3);
                      
        Listener listener=new Listener();
        
        rb1.addActionListener(listener);
        rb2.addActionListener(listener);
        rb3.addActionListener(listener);
        
    }
    
    
    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==rb1){
                System.out.println("gender: "+rb1.getText());
            }
            else if(e.getSource()==rb2){
                System.out.println("gender: "+rb2.getText());
            }
            else if(e.getSource()==rb3){
                System.out.println("gender: "+rb3.getText());
                
            }

        }
    
        
    
    
}
    
    public static void main(String[] args) {
        //we have to create an object of jradiobuttondemo class
        JRadioButtonDemo frame=new JRadioButtonDemo();
        
        
        
        
    }
    
    
}
