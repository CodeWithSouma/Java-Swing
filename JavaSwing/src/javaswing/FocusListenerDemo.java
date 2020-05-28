
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class FocusListenerDemo extends JFrame implements FocusListener {
    Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
    private Container c;
    private JTextArea textArea;
    private JButton button;
    private JScrollPane scroll;
    
    
    FocusListenerDemo(){
        initComponant();
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Focus listener ");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        
        button=new JButton("Button");
        button.setBounds(20,50,100,40);
        button.setFont(f);
        c.setLayout(null);
        c.add(button);
        
        
        textArea=new JTextArea();
        textArea.setFont(f);
        scroll=new JScrollPane(textArea);
        scroll.setBounds(130,10,240,300);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.LIGHT_GRAY);
        c.setLayout(null);
        c.add(scroll);
        
    
        button.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        textArea.append("Focus Gained.\n");
    }

    @Override
    public void focusLost(FocusEvent e) {
        textArea.append("Focus Losted.\n");

    }
    
    public static void main(String[] args) {
        FocusListenerDemo test=new FocusListenerDemo();
                
    }
 
}
