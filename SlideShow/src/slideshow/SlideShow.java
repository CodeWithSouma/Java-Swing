
package slideshow;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener{
     private Container c;
    private JPanel CenterPanel,header,footer;
    private JButton Next,Previous;
    private JLabel Heading;
    Font f;
    private CardLayout cardLayout;
    private JLabel imgLabel;
    private ImageIcon img;
    private ImageIcon icon;
    
    
    SlideShow(){
        
        initComponant();
        
    }

    private void initComponant() {
        icon=new ImageIcon("E:\\Java Swing Code\\SlideShow\\src\\Img\\slides.png");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1366,786);
        this.setTitle("Slide Show");
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        
        c=this.getContentPane();
        
        header=new JPanel();
        header.setBackground(Color.red);
        c.add(header,BorderLayout.NORTH);
       
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        Heading=new JLabel("Wellcome To SlideShow");
        Heading.setFont(f);
        header.add(Heading);
        
       
        footer=new JPanel();
       
     
        footer.setBackground(Color.YELLOW);
        c.add(footer,BorderLayout.SOUTH);
        f=new Font("Arial",Font.BOLD+Font.ITALIC,10);
        
        Previous=new JButton("Previous");
         Previous.setFont(f);
         footer.add(Previous);
         
       
         
         Next=new JButton("    Next    ");
         Next.setFont(f);
         footer.add(Next);
         
         
        cardLayout=new CardLayout(20,20);
        CenterPanel=new JPanel();
        CenterPanel.setBackground(Color.cyan);
        c.add(CenterPanel,BorderLayout.CENTER);
        CenterPanel.setLayout(cardLayout);
        
        //we have to create array 
//        img=new ImageIcon[10];
//        imgLabel=new JLabel[10];
//        
        
        for (int i = 0; i <= 9 ; i++) {
         img=new ImageIcon("E:\\Java Swing Code\\SlideShow\\src\\Img\\"+(i+1)+".jpeg");
         
        if(i!=9){
           // image resiging
         Image oldImg=img.getImage();
         Image newImg=oldImg.getScaledInstance(1000 ,700 ,Image.SCALE_SMOOTH );
         img=new ImageIcon(newImg);
        }
         imgLabel=new JLabel(img);
         imgLabel.setSize(img.getIconWidth(),img.getIconHeight());
         CenterPanel.add(imgLabel);
            
        }
        
        
         
        
        
        //now we have to add listener in next and previous button
        Next.addActionListener(this);
        Previous.addActionListener(this);
        

    }
    
    
    
    public static void main(String[] args) {
        SlideShow test=new SlideShow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Next){
            cardLayout.next( CenterPanel);
        }
        if(e.getSource()==Previous){
            cardLayout.previous( CenterPanel);
        }

    }
}
