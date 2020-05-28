
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


public class JToggleButtonDemo extends JFrame implements ActionListener {
    private Container c;
    private JLabel label1,label2;
    private Font f;
    private JToggleButton tb1;
    private ImageIcon icon;
    
    JToggleButtonDemo(){
       initComponant();
        
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JToggle Button Demo");
        this.setSize(400,500);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
       label1=new JLabel("JToggle Button Demo");
       label1.setFont(f);
       c.setLayout(null);
       label1.setBounds(10,10,300,30);
       c.add(label1);
       
       icon=new ImageIcon("E:\\Java Swing Code\\JavaSwing\\src\\javaswing\\Images\\folder.png");
      Image img=icon.getImage();
      Image newImg=img.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
      icon=new ImageIcon(newImg);
       tb1=new JToggleButton(icon);
       tb1.setBounds(50,50,90,90);
       tb1.setFont(f);
       c.add(tb1);
    
       label2=new JLabel("");
       label2.setBounds(10,150,300,30);
       label2.setFont(f);
       c.add(label2);
       
       tb1.addActionListener(this);
    
    }
    
    
    public static void main(String[] args) {
        JToggleButtonDemo test=new JToggleButtonDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb1.isSelected()){
            label2.setText("Toggle Button is preassed.");
        }
        else{
            label2.setText("");
        }
        

    }

   
    
}
