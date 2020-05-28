
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ButtonDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4;
    private JTextField textField;
    private JLabel textLabel;
    ImageIcon img;
    private Cursor cursor;
    private Font f=new Font("Arial",Font.BOLD+Font.ITALIC,18);
    ButtonDemo(){
        initComponant();
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        c=this.getContentPane();
        c.setBackground(Color.yellow);
        this.setTitle("JButton Demo");
        
        cursor=new Cursor(Cursor.HAND_CURSOR);
        
        textLabel=new JLabel("Comment");
        textLabel.setBounds(100,10,100,20);
        c.setLayout(null);
        c.add(textLabel);
        textField=new JTextField();
        textField.setFont(f);
        textField.setBounds(100,40,212,100);
        textField.setHorizontalAlignment(JTextField.CENTER);
        c.setLayout(null);
        c.add(textField);
        
        
        
        btn1=new JButton("Submit");
        btn1.setFont(f);
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.red);
        btn1.setCursor(cursor);
        btn1.setBounds(100, 150, 100, 50);
        c.setLayout(null);
        c.add(btn1);
        
        btn2=new JButton("Clear");
        btn2.setFont(f);
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.green);
        btn2.setCursor(cursor);
        btn2.setBounds(210, 150, 100, 50);
        c.setLayout(null);
        c.add(btn2);
        
        
       /* img=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\clear.png");
        btn3=new JButton(img);
        btn3.setBounds(100, 200,100, 50);
        c.setLayout(null);
        c.add(btn3);
        img=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\login.png");
        btn4=new JButton(img);
         btn4.setBounds(210, 200,100, 50);
        c.setLayout(null);
        c.add(btn4);*/
       
       //add listener 
       Listener listener=new Listener();
       btn1.addActionListener(listener);
       btn2.addActionListener(listener);
       //textField.addActionListener(listener);
    }
    
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==btn1){
                String s=textField.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You did not write anything."+s);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Your comment is: "+s);
                }
                
            }
            else if(e.getSource()==btn2){
                
                textField.setText("");
 
            }
            

        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        ButtonDemo frame=new ButtonDemo();
        frame.setResizable(false);
        
    }
}
