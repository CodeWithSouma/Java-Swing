
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayoutDemo extends JFrame {
     private Container c;
    //private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private JButton btn[];
    private FlowLayout flowLayout;
    
    
    FlowLayoutDemo(){
        initComponant();
    }

    private void initComponant() {
       this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Flow Layout Demo");
        this.setLocationRelativeTo(null);
        
        c=this.getContentPane();
        c.setBackground(Color.red);
        flowLayout=new FlowLayout();
        c.setLayout(flowLayout);
        
       /* btn1=new JButton("Button1");
        btn2=new JButton("Button2");
        btn3=new JButton("Button3");
        btn4=new JButton("Button4");
        btn5=new JButton("Button5");
        btn6=new JButton("Button6");
        btn7=new JButton("Button7");
        btn8=new JButton("Button8");
        btn9=new JButton("Button9");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);*/
       
       btn=new JButton[9];
        
        for (int i = 0; i < 9; i++) {
            btn[i]=new JButton("Button"+i);
            c.add(btn[i]);
            
        }
        
    }
    
    public static void main(String[] args) {
        FlowLayoutDemo test=new FlowLayoutDemo();
    }
}
