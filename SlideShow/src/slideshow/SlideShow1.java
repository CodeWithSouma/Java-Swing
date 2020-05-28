
package slideshow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SlideShow1 extends JFrame  {
    private Container c;
    private JPanel panel,header,footer;
    private JButton Next,Previous;
    private JLabel Heading;
    Font f;
    
    
    SlideShow1(){
        initComponant();
       
    }
    

   
    
    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,420);
        this.setTitle("Slide Show");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
       
        c=this.getContentPane();
        //c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        Heading=new JLabel("Wellcome To SlideShow");
        Heading.setFont(f);
        //Heading.setBounds(10,15,300,20);
        //c.add(Heading);
        c.add(Heading,BorderLayout.NORTH);
        //now we have to create jpanel
        panel=new JPanel();
        
        panel.setBackground(Color.red);
        panel.setBounds(10, 50, 475, 300);
        //c.add(panel);
        c.add(panel,BorderLayout.CENTER);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,10);
        
        //now we have to create button 
        Next=new JButton("Next");
        Next.setFont(f);
        Next.setBackground(Color.yellow);
       // Next.setBounds(405,360,80,25);
        c.add(Next);
        c.add(Next,BorderLayout.SOUTH);
        Previous=new JButton("Previous");
        Previous.setFont(f);
        Previous.setBackground(Color.green);
        //Previous.setBounds(10,360,80,25);
        Previous.setSize(80,25);
        c.add(Previous);
        c.add(Previous,BorderLayout.SOUTH);

    }
    
    
    public static void main(String[] args) {
        SlideShow1 test=new SlideShow1();
    }
    
}
