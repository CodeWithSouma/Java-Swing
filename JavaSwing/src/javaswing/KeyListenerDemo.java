
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KeyListenerDemo extends JFrame implements KeyListener{
    private Container c;
    private JTextField input;
    private JTextArea output;
    private JLabel h1,h2;
    private JScrollPane scroll;
            
    private Font f=new Font("Arial",Font.BOLD+Font.ITALIC,15);

    
    KeyListenerDemo(){
        initComponant();
    }

    private void initComponant() {
         this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setTitle("key listener demo");
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        
        h1=new JLabel("Input Field: ");
        h1.setFont(f);
        h1.setBounds(10,10,100,20);
        c.setLayout(null);
        c.add(h1);
        
        
        input=new JTextField();
        input.setFont(f);
        input.setBackground(Color.yellow);
        input.setBounds(20,40,200,40);
        c.setLayout(null);
        c.add(input);
        
        
        h2=new JLabel("Output Section: ");
        h2.setFont(f);
        h2.setBounds(10,90,200,20);
        c.setLayout(null);
        c.add(h2);

        output=new JTextArea();
        output.setFont(f);
        output.setBackground(Color.yellow);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        scroll=new JScrollPane(output);
        scroll.setBounds(20,130,200,300);
        c.setLayout(null);
        c.add(scroll);
        
        input.addKeyListener(this);
        
    }
    
    
    
    

    @Override
    public void keyTyped(KeyEvent e) {
     output.append("Key typed: "+e.getKeyChar()+"\n");

    }

    @Override
    public void keyPressed(KeyEvent e) {

        output.append("Key pressed: "+e.getKeyChar()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {

        output.append("Key relised: "+e.getKeyChar()+"\n");

    }
    
    public static void main(String[] args) {
        KeyListenerDemo frame=new KeyListenerDemo();
        
    }
    
}
