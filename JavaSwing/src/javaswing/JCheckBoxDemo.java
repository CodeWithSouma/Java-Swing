
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JCheckBoxDemo extends JFrame  {
  private  Container c;
   private JLabel head,label;
   private JCheckBox cb1,cb2,cb3;
   private JTextArea op;
   private JScrollPane scroll;
   private ButtonGroup food;
    Font f=new Font("Arial",Font.BOLD+Font.ITALIC,15);

    public JCheckBoxDemo() {
        initComponant();
        
        
    }

    private void initComponant() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setTitle("JCheck Box Demo.");
         c = this.getContentPane();
         c.setBackground(Color.cyan);
          head=new JLabel("JCheckBox Demo:");
          head.setFont(f);
          head.setBounds(10,10,140,20);
          c.setLayout(null);
          c.add(head);
          label=new JLabel("What is your favorit food: ");
          label.setBounds(10,30,250,20);
          label.setFont(f);
          c.setLayout(null);
          c.add(label);
    
          cb1=new JCheckBox("Chiken");
          cb1.setBounds(10,50,80,20);
          cb1.setFont(f);
          cb1.setBackground(Color.cyan);
          c.setLayout(null);
          c.add(cb1);
          
          cb2=new JCheckBox("Motton");
          cb2.setBounds(90,50,80,20);
          cb2.setFont(f);
          cb2.setBackground(Color.cyan);
          c.setLayout(null);
          c.add(cb2);
          
          cb3=new JCheckBox("Fish");
          cb3.setBounds(170,50,80,20);
          cb3.setFont(f);
          cb3.setBackground(Color.cyan);
          c.setLayout(null);
          c.add(cb3);
          
          op=new JTextArea("You have not selected anythings.");
          op.setFont(f);
          op.setLineWrap(true);
          op.setWrapStyleWord(true);
          op.setBackground(Color.YELLOW);
          scroll=new JScrollPane(op);
          scroll.setBounds(10,80,200,300);
          c.setLayout(null);
          c.add(scroll);
          
         // cb1.setSelected(true);
          food=new ButtonGroup();
          food.add(cb1);
          food.add(cb2);
          food.add(cb3);
          
          //action listener
          
        /* Listener listener=new Listener();
          cb1.addActionListener(listener);
          cb2.addActionListener(listener);
          cb3.addActionListener(listener);
          */ 
        
        //item listener
        Listener listener=new Listener();
        cb1.addItemListener(listener);
        cb2.addItemListener(listener);
        cb3.addItemListener(listener);
        
    }
   /* 
   //action listener 
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           if(e.getSource()==cb1){
                op.setText("Your favorite Food is: ");
                op.append("Chicken ");
                
            }
            if(e.getSource()==cb2){
               op.setText("Your favorite Food is: ");
               op.append("Motton "); 
            }
            if(e.getSource()==cb3){
                op.setText("Your favorite Food is: ");
                op.append("Fish "); 
            }
            
            

        }
        
    }
    */
    
    
    //itemlistener
    private class Listener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            
             if(e.getSource()==cb1){
                op.setText("Your favorite Food is: ");
                op.append("Chicken ");
                
            }
            if(e.getSource()==cb2){
               op.setText("Your favorite Food is: ");
               op.append("Motton "); 
            }
            if(e.getSource()==cb3){
                op.setText("Your favorite Food is: ");
                op.append("Fish "); 
            }
            

        }
        
    }
    
    
    public static void main(String[] args) {
        JCheckBoxDemo frame=new JCheckBoxDemo();
        
    }
    
    
    
    
    
}
