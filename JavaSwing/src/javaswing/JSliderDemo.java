
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderDemo extends JFrame implements ChangeListener {
    private Container c;
    private JSlider JS;
    private JSlider redSlider;
    JSliderDemo(){
        initComponant();
    }

    private void initComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JSlider Demo");
        this.setSize(400,500);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);

        JS=new JSlider(0,50,0);
        JS.setBounds(30,50,300,50);
        JS.setMinorTickSpacing(1);
        JS.setMajorTickSpacing(5);
       JS.setPaintTicks(true);
        JS.setPaintLabels(true);
        c.setLayout(null);
        c.add(JS);
        
        redSlider=new JSlider(0,255,0);
        redSlider.addChangeListener(this);
        
        JS.addChangeListener(this);
    }
    
    public static void main(String[] args) {
        JSliderDemo test=new JSliderDemo();
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
    
}
