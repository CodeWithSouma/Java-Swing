
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MouseListenerDemo extends JFrame implements MouseListener {
    private Container c; 
    private JTextField mouseField;
    private JTextArea output;
    private JLabel label1,label2;
    private JScrollPane scroll;
    Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
    MouseListenerDemo(){
        
        
        initComponant();
    }
    
    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Mouse listener Demo");
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        
        label1=new JLabel("Move the mouse pointer inside this Area: ");
        label1.setBounds(10,10,300,20);
        label1.setFont(f);
        c.setLayout(null);
        c.add(label1);
        
        mouseField=new JTextField();
        mouseField.setBounds(10,40,200,50);
        mouseField.setBackground(Color.yellow);
        mouseField.setFont(f);
        c.setLayout(null);
        c.add(mouseField);
        
        label2=new JLabel("Output Section: ");
        label2.setBounds(10,100,200,20);
        label2.setFont(f);
        c.setLayout(null);
        c.add(label2);
        
        output=new JTextArea();
        output.setFont(f);
        output.setBackground(Color.yellow);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        scroll=new JScrollPane(output);
        scroll .setBounds(10,130,200,300);
        c.setLayout(null);
        c.add(scroll);
        
   
        //add mouse listener in to 
       mouseField.addMouseListener(this);
        
    }
    
    
    
    
    
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        output.append("Mouse clicked.\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {
         output.append("Mouse pressed.\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         output.append("Mouse relised.\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         output.append("Mouse entered.\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
         output.append("Mouse exited.\n");
    }

    
    public static void main(String[] args) {
        MouseListenerDemo test=new MouseListenerDemo();
    }
    
    
    
}
