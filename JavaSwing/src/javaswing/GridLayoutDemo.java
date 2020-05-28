
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayoutDemo extends JFrame  {
    private Container c;
    private GridLayout gridLayout;
    private JButton btn[];
    
    GridLayoutDemo(){
        intiComponant();
    }

    private void intiComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Grid Layout Demo");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        
        c=this.getContentPane();
        c.setBackground(Color.red);
        
        gridLayout=new GridLayout(3,3,5,5);//hgap=5,vgap=5
        c.setLayout(gridLayout);
        
        btn=new JButton[10];
        for (int i = 0; i < 10; i++) {
            btn[i]=new JButton(""+i);
            c.add(btn[i]);            
            
            
        }
        


    }
    
    
    public static void main(String[] args) {
        
        GridLayoutDemo test=new GridLayoutDemo();
        
    }
}
