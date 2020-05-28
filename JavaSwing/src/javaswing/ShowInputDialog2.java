//JOptionPane class showInputDialog() method uses
package javaswing;


import javax.swing.JOptionPane;


public class ShowInputDialog2 {
    public static void main(String[] args) {
        
       String name= JOptionPane.showInputDialog(null,"Enter Your Name: ","This Is Title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, name,"Output",1);
   
    }
   
}
