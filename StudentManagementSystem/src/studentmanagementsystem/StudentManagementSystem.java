
package studentmanagementsystem;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;


public class StudentManagementSystem extends JFrame {
    private Container c;
    
    
    StudentManagementSystem(){
        initComponant();
    }

    
    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JColorChooser Demo");
        this.setSize(710,650);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);
         c.setLayout(null);
        
        
    }
    
    public static void main(String[] args) {
        StudentManagementSystem test=new StudentManagementSystem();
    }

    
}
