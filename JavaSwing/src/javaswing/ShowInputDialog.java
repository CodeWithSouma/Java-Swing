//JOptionPane class showInputDialog() method uses
package javaswing;

import javax.swing.JOptionPane;

public class ShowInputDialog {
    public static void main(String[] args) {
        //user input using JOptionPane showInputDialog
        String name=JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, ("Hello "+name),"Output Dialog",1);
        
        
        
    }
    
    
}
