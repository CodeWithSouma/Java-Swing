package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame implements KeyListener  {

    private JTextArea textArea;
    private JScrollPane scroll;
    private JLabel h1, vowel, a, e, i, o, u;
    private Container c;
    private Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
    private int totalVowel = 0;
    private int letterA = 0;
    private int letterE = 0;
    private int letterI = 0;
    private int letterO = 0;
    private int letterU = 0;

    
    VowelCounter() {

        initComponant();
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Vowel Counter");
        c = this.getContentPane();
        c.setBackground(Color.CYAN);

        h1 = new JLabel("Enter The Text: ");
        h1.setBounds(10, 10, 200, 20);
        h1.setFont(f);
        c.setLayout(null);
        c.add(h1);

        textArea = new JTextArea();
        textArea.setFont(f);
        scroll = new JScrollPane(textArea);
        scroll.setBounds(10, 40, 470, 200);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        c.setLayout(null);
        c.add(scroll);

        //now we want to add keylistener to our textArea
        textArea.addKeyListener(this);

        vowel = new JLabel();
        vowel.setBounds(90, 260, 200, 20);
        vowel.setFont(f);
        c.setLayout(null);
        c.add(vowel);
        a = new JLabel("Number of A present: ");
        a.setBounds(90, 290, 200, 20);
        a.setFont(f);
        c.setLayout(null);
        c.add(a);
        e = new JLabel("Number of E present: ");
        e.setBounds(90, 320, 200, 20);
        e.setFont(f);
        c.setLayout(null);
        c.add(e);
        i = new JLabel("Number of I present: ");
        i.setBounds(90, 350, 200, 20);
        i.setFont(f);
        c.setLayout(null);
        c.add(i);
        o = new JLabel("Number of O present: ");
        o.setBounds(90, 380, 200, 20);
        o.setFont(f);
        c.setLayout(null);
        c.add(o);
        u = new JLabel("Number of U present: ");
        u.setBounds(90, 410, 200, 20);
        u.setFont(f);
        c.setLayout(null);
        c.add(u);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == textArea) {
            System.out.println(e.getKeyCode());
            if (KeyEvent.VK_A == e.getKeyCode()) {

                totalVowel++;
                letterA++;

            }
            if (KeyEvent.VK_E == e.getKeyCode()) {

                totalVowel++;
                letterE++;
            }
            if (KeyEvent.VK_I == e.getKeyCode()) {

                totalVowel++;
                letterI++;
            }
            if (KeyEvent.VK_O == e.getKeyCode()) {

                totalVowel++;
                letterO++;
            }
            if (KeyEvent.VK_U == e.getKeyCode()) {

                totalVowel++;
                letterU++;
            }
            
           //backspace working tricks
          
         
                   
           
            /*System.out.println(last);
            if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                
            if (KeyEvent.VK_A == last) {

                totalVowel--;
                letterA--;

            }
            if (KeyEvent.VK_E == last) {

                totalVowel--;
                letterE--;
            }
            if (KeyEvent.VK_I == last) {

                totalVowel--;
                letterI--;
            }
            if (KeyEvent.VK_O == last) {

                totalVowel--;
                letterO--;
            }
            if (KeyEvent.VK_U == last) {

                totalVowel--;
                letterU--;
            }
            
            }*/
            
            
            
            vowel.setText(" Total number of vowel: " + totalVowel);
            a.setText(" Total number of A: " + letterA);
            this.e.setText(" Total number of E: " + letterE);
            this.i.setText(" Total number of I: " + letterI);
            o.setText(" Total number of O: " + letterO);
            u.setText(" Total number of U: " + letterU);

            
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        
    }

    public static void main(String[] args) {
        VowelCounter test = new VowelCounter();
    }

}
