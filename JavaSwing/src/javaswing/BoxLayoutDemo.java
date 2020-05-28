
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BoxLayoutDemo extends JFrame  {
    private Container c;
    private JButton btn[];
    private BoxLayout boxLayout;
    BoxLayoutDemo(){
        intiComponant();
    }

    private void intiComponant() {
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400, 500);
      this.setTitle("Box Lyout Demo");
      this.setLocationRelativeTo(null);
      
      c=this.getContentPane();
      c.setBackground(Color.CYAN);
      boxLayout=new BoxLayout(c,BoxLayout.Y_AXIS);
      c.setLayout(boxLayout);
      
      btn=new JButton[10];
        for (int i = 0; i < 10; i++) {
            btn[i]=new JButton("Button"+i);
            c.add(btn[i]);
            c.add(Box.createVerticalStrut(10));//this method create gap 10 pixel 
            
        }
    }
    
    
    public static void main(String[] args) {
        BoxLayoutDemo test =new BoxLayoutDemo();
    }
    
}
