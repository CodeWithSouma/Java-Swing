
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JpanelDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3;
    private JPanel panel1,panel2;
    JpanelDemo(){
        
        initComponant();
        
    }

    private void initComponant() {
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Pannel Demo");
        c=this.getContentPane();
        c.setBackground(Color.red);
        
        
        panel1=new JPanel();
        panel1.setBounds(5,5,180,450);
        panel1.setBackground(Color.CYAN);
        c.setLayout(null);
        c.add(panel1);
        
        panel2=new JPanel();
        panel2.setBounds(200,5,180,450);
        panel2.setBackground(Color.GREEN);
        c.setLayout(null);
        c.add(panel2);
        
        btn1=new JButton("Button1");
        //btn1.setBounds(10,10,80,30);
        //c.setLayout(null);
        panel1.add(btn1);
        
        btn2=new JButton("Button2");
        //btn2.setBounds(10,50,80,30);
        //c.setLayout(null);
        panel1.add(btn2);
        
        btn3=new JButton("Button3");
       // btn3.setBounds(210,10,80,30);
       // c.setLayout(null);
       panel2.add(btn3);
        
        
        

    }
    
    
    
    public static void main(String[] args) {
        JpanelDemo test=new JpanelDemo();
        
        
    }
}
