
package javaswing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BorderLayout Blayout;
    
    BorderLayoutDemo(){
        initComponant();
        
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Border Layout Demo");
        this.setLocationRelativeTo(null);
        
        c=this.getContentPane();
        Blayout=new BorderLayout(10,5);
        c.setLayout(Blayout);
        
//        Blayout.setHgap(10);
//        Blayout.setVgap(5);
        
        btn1=new JButton("Button1");
        btn2=new JButton("Button2");
        btn3=new JButton("Button3");
        btn4=new JButton("Button4");
        btn5=new JButton("Button5");
        
        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.WEST);
        c.add(btn3,BorderLayout.CENTER);
        c.add(btn4,BorderLayout.EAST);
        c.add(btn5,BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        BorderLayoutDemo test=new BorderLayoutDemo();
    }
    
}
