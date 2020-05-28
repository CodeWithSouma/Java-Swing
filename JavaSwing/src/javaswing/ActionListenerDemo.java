
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ActionListenerDemo extends JFrame implements ActionListener{
    private Container c;
    private Font f=new Font("Arial",Font.BOLD+Font.ITALIC,15);
    private JButton red,green,blue,def;
    
    
    ActionListenerDemo(){
        initComponant();
    }

    private void initComponant() {
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        
        red=new JButton("Red");
        red.setFont(f);
        red.setBounds(20,20,90,30);
        c.setLayout(null);
        c.add(red);
        
        green=new JButton("Green");
        green.setFont(f);
        green.setBounds(20,60,90,30);
        c.setLayout(null);
        c.add(green);
        
        
        blue=new JButton("Blue");
        blue.setFont(f);
        blue.setBounds(20,100,90,30);
        c.setLayout(null);
        c.add(blue);
        
        def=new JButton("Default");
        def.setFont(f);
        def.setBounds(20,140,90,30);
        c.setLayout(null);
        c.add(def);
        
       /* 
        //now we want to add action listener
        Listener listener =new Listener();
        red.addActionListener(listener);
        green.addActionListener(listener);
        blue.addActionListener(listener);
        def.addActionListener(listener);
    */
       
       
       //now we want to add action listener process no 3
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        def.addActionListener(this);
       
       
    }
    
    
   /* //we are create a new action listener 
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==red){
                c.setBackground(Color.red);
            }
            else if(e.getSource()==green){
                
                c.setBackground(Color.green);
            }
            else if(e.getSource()==blue){
                c.setBackground(Color.blue);
                
            } 
            else if(e.getSource()==def){
                c.setBackground(Color.cyan);
            }
            
            
                
        }
        
    }
    */
    
   

    @Override
    public void actionPerformed(ActionEvent e) {

         if(e.getSource()==red){
                c.setBackground(Color.red);
            }
            else if(e.getSource()==green){
                
                c.setBackground(Color.green);
            }
            else if(e.getSource()==blue){
                c.setBackground(Color.blue);
                
            }
            else if(e.getSource()==def){
                c.setBackground(Color.cyan);
            }
            


    }
    
    
     public static void main(String[] args) {
        ActionListenerDemo frame=new ActionListenerDemo();
    }
    
}
