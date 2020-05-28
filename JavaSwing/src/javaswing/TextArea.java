
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class TextArea extends JFrame {
    Container c;
    JLabel textLabel;
    JTextArea textArea;
    Font font;
    JScrollPane jScrollPane;
    TextArea(){
       initComponant(); 
        
        
        
    }

    private void initComponant() {
        font=new Font("Arial",Font.BOLD,15);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        c=this.getContentPane();
        c.setBackground(Color.yellow);
        this.setTitle("Test application demo.");
        textLabel=new JLabel("This is Text Area.");
        textLabel.setFont(font);
        textLabel.setBounds(10,10,200,20);
        c.setLayout(null);
        c.add(textLabel);
        textArea=new JTextArea("Enter somthing here");
        //textArea.setBounds(10,40,200,300);
//        c.setLayout(null);
//        c.add(textArea);
        textArea.setBackground(Color.CYAN);
        textArea.setForeground(Color.black);
       textArea.setLineWrap(true);
       textArea.setWrapStyleWord(true);
        textArea.setFont(font);
       jScrollPane=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
       jScrollPane.setBounds(10,40,200,300);
       c.setLayout(null);
       c.add(jScrollPane);
       

    }
    
    public static void main(String[] args) {
        TextArea frame=new TextArea();
        
    }
    
    
    
}
