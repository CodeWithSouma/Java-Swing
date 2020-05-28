
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JComboBoxDemo extends JFrame {
   private Container c;
   private JLabel head,head2;
   private JLabel op;
   private JComboBox course;
   private String[] proLang={"c","c++","java","python","java script","html","css"}; 
   private JButton submit;
    
    Font f=new Font("Arial",Font.BOLD+Font.ITALIC,15);
    JComboBoxDemo(){
        
        initComponant();
        
        
    }

    private void initComponant() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setTitle("JCombo Box Demo");
        
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        
        head=new JLabel("Chose any of this course: ");
        head.setBounds(10, 20, 200, 20);
        head.setFont(f);
        c.setLayout(null);
        c.add(head);
        
        //now we create a combobox
        course=new JComboBox(proLang);
        course.setBounds(20, 50, 80, 20);
        c.setLayout(null);
        c.add(course);
        
         //now we want to create combobox editable
        course.setEditable(true);
        
        //now we want to add a button 
        submit=new JButton("Submit");
        submit.setFont(f);
        submit.setBounds(120,50,100,20);
        c.setLayout(null);
        c.add(submit);
        
       
        
        //some method of combobox
        System.out.println("Total item: "+course.getItemCount());
      //  course.setSelectedIndex(2);//by default it select java
        course.setSelectedItem("java");//by default it select java
        System.out.println("selected item: "+course.getSelectedItem());//it return java
        System.out.println("Selected item's index no: "+course.getSelectedIndex());//it return 2
        //now we want to add item php
        course.addItem("php");//add php
        //now we want to delete php
        //course.removeItem("php");//it remove php
        course.removeItemAt(7);//it also remove php
        //if you want remove all item
        //course.removeAllItems();
        
        
        //we have to create a label
        head2=new JLabel("You have selected: ");
        head2.setFont(f);
        head2.setBounds(20,90,210,20);
        c.setLayout(null);
        c.add(head2);
        
        //we have to create op label to show output
        op=new JLabel("You didn't select anythings.");
        op.setBounds(160,90,200,20);
        op.setFont(f);
        c.setLayout(null);
        c.add(op);
        
        //we have to add listener to this combobox
        Listener listener=new Listener();
        course.addActionListener(listener);
        submit.addActionListener(listener);
    }
    
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if( e.getSource()==course || e.getSource()==submit){
               // System.out.println( course.getSelectedItem());
                op.setText((String) course.getSelectedItem());
            }
            

        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        JComboBoxDemo frame=new JComboBoxDemo();
        
        
        
    }
    
    
    
}
