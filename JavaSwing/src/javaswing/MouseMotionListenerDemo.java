
package javaswing;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MouseMotionListenerDemo extends JFrame implements MouseMotionListener {
     Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
    private Container c;
    private JTextArea ta1,ta2;
    private JScrollPane scroll;
    
    MouseMotionListenerDemo(){
        initComponant();
        
        
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(510,300);
        this.setResizable(false);
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        ta1=new JTextArea();
        ta1.setBounds(10,10,200,240);
        ta1.setFont(f);
        ta1.setToolTipText("Input Consol You can Move and drag your mouse pointer as input.");
        ta1.setBackground(Color.orange);
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
        c.setLayout(null);
        c.add(ta1);
        
        
        
        ta2=new JTextArea();
        scroll=new JScrollPane(ta2);
        scroll.setBounds(230,80,250,100);
        ta2.setToolTipText("Output Consol");
        ta2.setFont(f);
        ta2.setBackground(Color.yellow);
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
        c.setLayout(null);
        c.add(scroll);
        
        //this is for add mouse motion listener in textArea1
        ta1.addMouseMotionListener(this);
        
    }
    

    @Override
    public void mouseDragged(MouseEvent e) {
        ta2.setText("Mouse Dragged: "+e.getX()+", "+e.getY());
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        ta2.setText("Mouse Moved: "+e.getX()+", "+e.getY());

    }
    
    
    public static void main(String[] args) {
        MouseMotionListenerDemo test=new MouseMotionListenerDemo();
    }
    
    
    
    
}
