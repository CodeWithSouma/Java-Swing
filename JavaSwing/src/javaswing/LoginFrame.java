package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    Container c;
    Font f = new Font("Asterik Demo", Font.PLAIN, 35);
    JLabel headingLabel, userLabel, passLabel;
    JTextField userField;
    javax.swing.JPasswordField passField;
    JButton login, clear;
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
    
    LoginFrame() {
        
        initComponant();        
        this.setResizable(false);
        
    }
    
    private void initComponant() {
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Login Demo");
        c = this.getContentPane();
        c.setBackground(Color.yellow);
        headingLabel = new JLabel("Login Page");
        headingLabel.setFont(f);
        headingLabel.setBounds(140, 10, 200, 80);
        c.setLayout(null);
        c.add(headingLabel);
        
        userLabel = new JLabel("Enter Your user id: ");
        userLabel.setBounds(10, 80, 200, 50);
        Font f1 = new Font("Asterik Demo", Font.PLAIN, 25);
        userLabel.setFont(f1);
        c.setLayout(null);
        c.add(userLabel);
        
        Font f2 = new Font("Arial", Font.BOLD, 15);
        userField = new JTextField();
        userField.setBounds(10, 120, 200, 50);
        userField.setFont(f2);
        userField.setHorizontalAlignment(JTextField.CENTER);
        c.setLayout(null);
        c.add(userField);
        
        passLabel = new JLabel("Enter your password: ");
        passLabel.setFont(f1);
        passLabel.setBounds(10, 180, 200, 50);
        c.setLayout(null);
        c.add(passLabel);
        
        passField = new javax.swing.JPasswordField();
        passField.setBounds(10, 220, 200, 50);
        passField.setFont(f2);
        passField.setHorizontalAlignment(JTextField.CENTER);
        c.setLayout(null);
        c.add(passField);
        
        login = new JButton("Login");
        login.setFont(f2);
        login.setBounds(10, 300, 100, 50);
        login.setCursor(cursor);
        c.setLayout(null);
        c.add(login);
        
        clear = new JButton("clear");
        clear.setFont(f2);
        clear.setBounds(115, 300, 100, 50);
        clear.setCursor(cursor);
        c.setLayout(null);
        c.add(clear);

        //now we add this listener
        Listener listener = new Listener();
        login.addActionListener(listener);
        clear.addActionListener(listener);
        
    }
    
    private class Listener implements ActionListener  {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == login) {
                String userName, pass;
                userName = userField.getText();
                pass = passField.getText();
                if (userName.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did not Enter anythings.");
                    
                } else {
                   
                    JOptionPane.showMessageDialog(null, "Hurra You have succesfully logedin.");
                    dispose();
                    NewFrame nf=new NewFrame();
                    nf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                }
            } else if (e.getSource() == clear) {
                userField.setText("");
                passField.setText("");
                
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        LoginFrame frame = new LoginFrame();
        
        
    }
}
