
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame {
    Container c;
    JLabel headingLabel;
    NewFrame(){
        
        initComponant();
        
    }

    private void initComponant() {

       this.setVisible(true);
       this.setSize(400,500);
       this.setLocationRelativeTo(null);
       this.setTitle("This is a new frame.");
       c=this.getContentPane();
       c.setBackground(Color.red);
       headingLabel=new JLabel("Hello This is a new Frame.");
       headingLabel.setBounds(50,50,200,40);
       c.setLayout(null);
       c.add(headingLabel);

       
    }
    
}
