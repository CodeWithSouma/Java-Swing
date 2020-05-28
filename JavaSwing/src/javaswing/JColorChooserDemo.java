
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;


public class JColorChooserDemo extends JFrame implements ActionListener {
    private Container c;
    private JButton btn;
    
    JColorChooserDemo(){
        initComponant();
    }

    private void initComponant() {
        
         this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JColorChooser Demo");
        this.setSize(400,450);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);
         c.setLayout(null);
         
         btn=new JButton("Choose a Color");
         btn.setBounds(50,50,180,40);
         c.setLayout(null);
         c.add(btn);
         
         
         btn.addActionListener(this);
    }
    
    
    
    public static void main(String[] args) {
        JColorChooserDemo test=new JColorChooserDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
           Color color=JColorChooser.showDialog(null, "select a color", Color.yellow);
           c.setBackground(color);
           
           
        }

    }
    
}
