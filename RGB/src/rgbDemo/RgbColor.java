
package rgbDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;


public class RgbColor extends JFrame implements javax.swing.event.ChangeListener {
    
    private Container c;
    private JSlider redSlider,greenSlider,blueSlider;
    private JLabel redLabel,greenLabel,blueLabel,previewLabel;
    private JTextField redTf,blueTf,greenTf;
    private JPanel panel;
    
    RgbColor(){
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
        
        redSlider=new JSlider(0,255,0);
        redSlider.setBounds(90,50,300,50);
        c.add(redSlider);
        
        redTf=new JTextField();
        redTf.setBounds(400,50,80,40);
        redTf.setHorizontalAlignment(JTextField.CENTER);
        c.add(redTf);
        
        greenLabel=new JLabel("Green");
        greenLabel.setBounds(50,110,80,50);
        c.add(greenLabel);
        
        greenSlider=new JSlider(0,255,0);
        greenSlider.setBounds(90,110,300,50);
        c.add(greenSlider);
        
        greenTf=new JTextField();
        greenTf.setBounds(400,110,80,40);
        greenTf.setHorizontalAlignment(JTextField.CENTER);
        c.add(greenTf);
        
        blueLabel=new JLabel("Blue");
        blueLabel.setBounds(50,170,80,50);
        c.add(blueLabel);
        
        blueSlider=new JSlider(0,255,0);
        blueSlider.setBounds(90,170,300,50);
        c.add(blueSlider);
        
        blueTf=new JTextField();
        blueTf.setBounds(400,170,80,40);
        blueTf.setHorizontalAlignment(JTextField.CENTER);
        c.add(blueTf);
        
        
        panel=new JPanel();
        panel.setBounds(550,50,200,160);
        panel.setBackground(Color.white);
        c.add(panel);
        
        previewLabel=new JLabel("Preview");
        previewLabel.setBounds(630,200,100,50);
        c.add(previewLabel);
        
        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);
        
    }
    
   
    @Override
    public void stateChanged(ChangeEvent e) {
        int redValue=redSlider.getValue();
        int greenValue=greenSlider.getValue();
        int blueValue=blueSlider.getValue();
        redTf.setText(""+redValue);
        greenTf.setText(""+greenValue);
        blueTf.setText(""+blueValue);
        Color color=new Color(redValue,greenValue,blueValue);
        panel.setBackground(color);
        
    }

    public static void main(String[] args) {
          RgbColor test=new RgbColor();
      }

   

   
    
}
