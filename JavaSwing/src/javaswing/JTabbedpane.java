
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class JTabbedpane extends JFrame{
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1,panel2,panel3;
    private ImageIcon icon1,icon2,icon3;
    
    JTabbedpane(){
        initComponant();
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTabbdPane Demo");
        this.setSize(400,450);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);
         c.setLayout(null);

        // tp=new JTabbedPane(JTabbedPane.BOTTOM);
         tp=new JTabbedPane();
         tp.setBounds(50,50,300,300);
        // tp.setTabPlacement(JTabbedPane.BOTTOM);
         c.add(tp);
         
         icon1=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\icon\\home.png");
         Image img=icon1.getImage();
         Image newImg=img.getScaledInstance(12, 12, Image.SCALE_SMOOTH);
         icon1=new ImageIcon(newImg);
         
         
         
         panel1=new JPanel();
         tp.addTab("home",icon1, panel1);
         
         
         icon2=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\icon\\help.png");
         img=icon2.getImage();
          newImg=img.getScaledInstance(12, 12, Image.SCALE_SMOOTH);
         icon2=new ImageIcon(newImg);
         
         panel2=new JPanel();
         tp.addTab("Help",icon2, panel2);
         
         
         icon3=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\icon\\edit.png");
         img=icon3.getImage();
          newImg=img.getScaledInstance(12, 12, Image.SCALE_SMOOTH);
         icon3=new ImageIcon(newImg);
         
         panel3=new JPanel();
         tp.addTab("Edit",icon3, panel3);
         
         panel1.setBackground(Color.red);
         panel2.setBackground(Color.blue);
         panel3.setBackground(Color.orange);
         
         
    }
    
    public static void main(String[] args) {
        JTabbedpane test=new JTabbedpane();
        
    }
    
}
