
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSpinnerDemo extends JFrame implements ChangeListener {
    private Container c;
    private JSpinner spinner;
    private JLabel label;
    private JLabel op,op1;
   
    
    JSpinnerDemo(){
        intiComponant();
    }

    private void intiComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JSpinner Demo");
        this.setSize(400,500);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);
         c.setLayout(null);
         
        label=new JLabel("JSpinner Demo");
        label.setBounds(10,10,200,30);
        c.add(label);

        SpinnerNumberModel value =new SpinnerNumberModel(10,0,30,1);
        spinner=new JSpinner(value);
        spinner.setBounds(20,50,150,55);
        c.add(spinner);

        op=new JLabel("Output: ");
        op.setBounds(10,110,200,20);
        c.add(op);
        
        op1=new JLabel("10");
        op1.setBounds(60,110,200,20);
        c.add(op1);
        
        spinner.addChangeListener(this);
    }
    
    public static void main(String[] args) {
        JSpinnerDemo test=new JSpinnerDemo();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        op1.setText(spinner.getValue().toString());
    }
    
}
