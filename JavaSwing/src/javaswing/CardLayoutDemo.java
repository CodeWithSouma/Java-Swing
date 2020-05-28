
package javaswing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CardLayoutDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton btn[];
    private CardLayout cardLayout;
   
    CardLayoutDemo(){
      intiComponant();  
    }

    private void intiComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Grid Layout Demo");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        
        c=this.getContentPane();
         c.setBackground(Color.LIGHT_GRAY);
         
         cardLayout=new CardLayout(20,20);
         c.setLayout(cardLayout);
         
         btn=new JButton[10];
         for (int i = 0; i < 10; i++) {
            
             btn[i]=new JButton(""+i);
             c.add(btn[i],""+i);//this string help us to identify this button uniquely
             
        }
         
         
        //Listener add with all button 
         for (int i = 0; i < 10; i++) {
          
            btn[i].addActionListener(this);
            
        }

    }
    
    
    
    
    
    public static void main(String[] args) {
        CardLayoutDemo test=new CardLayoutDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        cardLayout.next(c);//we have to  pass  container because we set cardlayout in container
      //show method help you to show you uniqe button
      
       // cardLayout.show(c, "5");//when i press the  button then can see button 5 every time //op will be 5
        
       //cardLayout.first(c);//it show first button//here  op will be 0
       //cardLayout.last(c);//it show last button//here op will be 9
    }
    
    
}
