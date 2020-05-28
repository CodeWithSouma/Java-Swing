package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionDemo extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private JTextField userName, pass;
    private Font f;

    //we need a constructor
    ActionDemo() {

        initComponant();

    }

    private void initComponant() {
        //in this portion we create the jframe
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);

        //in this portion we styling the jframe
        c = this.getContentPane();
        c.setBackground(Color.DARK_GRAY);

        //here we create a font and add this font with text field
        f = new Font("Arial", Font.BOLD, 15);

        //for user name section
        //here we create and two label and textField
        userLabel = new JLabel("Enter your user name: ");
        userLabel.setFont(f);
        userLabel.setBounds(10, 10, 200, 20);
        userLabel.setForeground(Color.white);
        c.setLayout(null);
        c.add(userLabel);
        //here we create a text field 
        userName = new JTextField("Enter your name");
        userName.setBounds(10, 35, 200, 40);
        userName.setBackground(Color.WHITE);
        c.add(userName);
        /* userName.addActionListener(new ActionListener(){
         
             
         @Override
         public void actionPerformed(ActionEvent e){
             String s;
             s=userName.getText();
             
             if(s.isEmpty()){
                 JOptionPane.showMessageDialog(null,"you did not enter Anything.");
             
             }
             
             else if (s!=null){
                  JOptionPane.showMessageDialog(null, "your name: "+s);
                 
             }
             
         }
         
         
         
         });*/

        ///for password section
        passLabel = new JLabel("Enter you password: ");
        passLabel.setFont(f);
        passLabel.setBounds(10, 85, 200, 20);
        passLabel.setForeground(Color.white);
        c.setLayout(null);
        c.add(passLabel);

        //here we create a textfield
        pass = new JTextField("Enter your password");
        pass.setBounds(10, 105, 200, 40);
        pass.setBackground(Color.white);
        c.setLayout(null);
        c.add(pass);

        /*pass.addActionListener(new ActionListener (){
         
         
         @Override
         public void actionPerformed(ActionEvent e){
             
            String s;
            s=pass.getText();
            if(s.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"You did not enter anythings.");

            }
            else{
                
                                
                JOptionPane.showMessageDialog(null,"your password is: "+s);
                
                
            }
             
         }    
             
             
             
         
         });*/
        //diffrent waya to add action listener 
        Handler handler = new Handler();

        userName.addActionListener(handler);
        pass.addActionListener(handler);

    }

    //we declair handeler class and implements actionlistener class
    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == userName) {

                String s;
                s = userName.getText();

                if (s.isEmpty()||s.equals("Enter your name")) {
                    JOptionPane.showMessageDialog(null, "you did not enter Anything.");

                } else if (s != null) {
                    JOptionPane.showMessageDialog(null, "your name: " + s);

                }

            } else if (e.getSource() == pass) {

                String s;
                s = pass.getText();
                if (s.isEmpty()||s.equals("Enter your password")) {

                    JOptionPane.showMessageDialog(null, "You did not enter anythings.");

                } else {

                    JOptionPane.showMessageDialog(null, "your password is: " + s);

                }

            }

        }

    }

    public static void main(String[] args) {
        ActionDemo frame = new ActionDemo();
        frame.setResizable(false);
    }

}
