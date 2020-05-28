//showConfirmDialog method
package javaswing;

import javax.swing.JOptionPane;


public class ShowConfirmDialog {
    public static void main(String[] args) {
       String Name= JOptionPane.showInputDialog(null, "Enter your name: ","User Input Dialog",3);
        int op=JOptionPane.showConfirmDialog(null, "Do you want to show your name:","Confermation Dialog",JOptionPane.YES_NO_OPTION);//it return an integer value
            
        if(op==0){
            JOptionPane.showMessageDialog(null,Name+" Wellcome To GUI Programming Using Java Swing. ","Output",1);
        }
       else
        {
            System.exit(0);
        }
    
}
}