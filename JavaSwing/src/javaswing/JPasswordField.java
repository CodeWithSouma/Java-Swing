
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JPasswordField;

public class JPasswordField extends JFrame {
    private Container c;
    private JLabel nameLabel,passLabel;
    private JTextField nameField;
    private javax.swing.JPasswordField passField;//We have to must use JPassword field location
    private Font f=new Font("Arial",Font.BOLD,18);
    ///we create a object of ation listener class
     Listener listener=new Listener();
    
    
    JPasswordField(){
        initComponant();
        
        
    }
    
    
    private void initComponant(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 550);
        this.setTitle("Test Application");
        this.setLocationRelativeTo(null);
        c=this.getContentPane();
        c.setBackground(Color.orange);
        nameLabel=new JLabel("Enter Your Name: ");
        nameLabel.setBounds(10,10,200,20);
        c.setLayout(null);
        c.add(nameLabel);
        
        nameField=new JTextField("Enter your name: ");
        nameField.setBounds(10, 30, 200, 30);
        c.setLayout(null);
        c.add(nameField);
       
        
        passLabel=new JLabel("Enter your password: ");
        passLabel.setBounds(10,80,200,20);
        c.setLayout(null);
        c.add(passLabel);
       
        passField=new javax.swing.JPasswordField();
        passField.setFont(f);
        passField.setForeground(Color.red);
        //passField.setBackground(Color.blue);
        passField.setBounds(10, 100, 200, 30);
        passField.setEchoChar('*');
        c.add(passField);
        
        
        
        
    
         //now we have to add this listener to our nameField
         nameField.addActionListener(listener);
         passField.addActionListener(listener);
        
        
        
        passLabel=new JLabel("Enter your password:");
        passLabel.setBounds(10, 80, 200, 20);
        c.setLayout(null);
        c.add(passLabel);
        
        
        
        
        
      
    }
    
    
    
    
    
    
    //we have to inherit the actionlistener interface
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
          if(e.getSource()==nameField)  {
              
              String s;
              s=nameField.getText();
              if(s.isEmpty()||s.equals("Enter your name: ")){
                  JOptionPane.showMessageDialog(null, "Please Enter your name.");
                  
                  
              }
              else{
                  JOptionPane.showMessageDialog(null, "hello "+s+" how are you??");
                  
                  
              }
              
              
              
          }
          else if(e.getSource()==passField){
              String pass=null;
              pass=passField.getText();
              if(pass.isEmpty()){
                  JOptionPane.showMessageDialog(null, "you did not enter anything.");
              }
              else{
                  JOptionPane.showMessageDialog(null, "your password: "+pass);
              }
          }
          
            
            
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
      JPasswordField frame=new JPasswordField();
      frame.setResizable(false);
        
        
    }
    
}
