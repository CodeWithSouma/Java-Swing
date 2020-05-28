
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class TextFieldDemo extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    private Font font;
    
    TextFieldDemo(){
        initComponant();
    }
    
    
    
    
    
    
    private void initComponant() {
        
        font=new Font("Arial",Font.ITALIC+Font.BOLD,14);
        
        
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        tf1=new JTextField("Enter your name");
        tf1.setBounds(10,20,200,30);
        tf1.setFont(font);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.yellow);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        
        
        
        tf2=new JTextField("Enter your Password");
        tf2.setBounds(10,60,200,30);
        tf2.setFont(font);
        tf2.setForeground(Color.red);
        tf2.setBackground(Color.yellow);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
        
        
        
    }

    
    
    
    
    
    
    public static void main(String[] args) {
      TextFieldDemo frame =new TextFieldDemo();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100,100,500,400);
      frame.setTitle("Jtext field Demo");
        
        
        
    }

    
    
}
