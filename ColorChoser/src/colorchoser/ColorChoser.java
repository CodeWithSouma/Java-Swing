
package colorchoser;

import java.awt.Container;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class ColorChoser extends JFrame implements ChangeListener{

     private Container c;
    private JSlider red,greenSlider,blueSlider;
    private JLabel redLabel,greenLabel,blueLabel,previewLabel;
    private JTextField redTf,blueTf,greenTf;
    private JPanel panel;
    
    ColorChoser(){
         initComponant();
    }
    
    
     private void initComponant() {
         
         this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("RGB Color");
        this.setSize(800,350);
        c=this.getContentPane();
        this.setLocationRelativeTo(null);
        c.setLayout(null);
        
        redLabel=new JLabel("Red");
        redLabel.setBounds(50,50,80,50);
        c.add(redLabel);
        
        red=new JSlider(0,255,0);
        red.setBounds(90,50,300,50);
        red.setMinorTickSpacing(1);
        red.setMajorTickSpacing(5);
        red.setPaintLabels(true);
        red.setPaintTicks(true);
        c.add(red);
        
        red.addChangeListener(this);
    }
     
     
     @Override
    public void changed(ObservableValue ov, Object t, Object t1) {
       
    }
    
    public static void main(String[] args) {
        
    }

    

   
    
}
