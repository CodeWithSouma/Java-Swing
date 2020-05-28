
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JpassDemo extends JFrame {
    private Container c;
    private JLabel passLabel,userLabel;
    private JTextField userField,passField;
    ImageIcon icon;
    private javax.swing.JPasswordField passField1=new javax.swing.JPasswordField();
    
    
    
    JpassDemo(){
        
        initComponant();
        
        
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 400);
        this.setLocationRelativeTo(null);
        c=this.getContentPane();
        c.setBackground(Color.ORANGE);
        userLabel=new JLabel("Enter Your Name: ");
        userLabel.setBounds(10,10,200,10);
        c.setLayout(null);
        c.add(userLabel);
        userField=new JTextField("Enter your Name: ");
        userField.setBounds(10,30,200,20);
        c.setLayout(null);
        c.add(userField);
        passLabel=new JLabel("Enter your password: ");
        passLabel.setBounds(10,60,200,20);
        c.setLayout(null);
        c.add(passLabel);
        passField=new JTextField("Enter your password:");
        passField.setBounds(10,90,200,20);
        c.setLayout(null);
        c.add(passField);
        //now we add listener to this jtextfield
        Listener listener=new Listener();
        userField.addActionListener(listener);
        passField.addActionListener(listener);
        
        //here we create a passField 
//        passField1.setTitle("enter your password");
        passField1.setBounds(10,110,200,20);
        
        c.add(passField1);
        
        
        
        
        //add icon for this frame
        icon=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\github.png");
        this.setIconImage(icon.getImage());
        //now we want to add title 
        this.setTitle("Test Application Demo.");
        
        
        
        
        
    }
    
    
    //now we want to declair a class listener
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==userField){
            
            String s;
            s=userField.getText();
            if(s.isEmpty()||s.equals("Enter your Name: ")){
                JOptionPane.showMessageDialog(null,"You did not enter anything.");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Hello "+s);
            }
            
            
        }
        else{
            
            String s;
            s=passField.getText();
            if(s.isEmpty()||s.equals("Enter your password:")){
                
               JOptionPane.showMessageDialog(null,"You did not enter anything."); 
                
            }
            else{
                
                JOptionPane.showMessageDialog(null,"Password: "+s);
            }
            
            
            
            
        }
        
        
        }
        
    }
    
    
    public static void main(String[] args) {
        
        JpassDemo frame=new JpassDemo();
        //frame.setResizable(false);
        
        
    }
    
    
}
