
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TableDemo extends JFrame {
    private Container c;
    private JLabel label;
    private Font f;
    private JScrollPane scroll;
    private JTable table;
    private String[]col={"ID","Name","GPA"};
    private String[][]row={
            {"101","Soumadip Dey","3.94"},
            {"102","Babu Dey","2.44"},
            {"103","Soumik Nandi","3.44"},
            {"104","Arijit Das","4.14"},
            {"105","Sumit Das","3.14"},
            {"106","Sourav Sarkar","4.14"},
            {"101","Soumadip Dey","3.94"},
            {"102","Babu Dey","2.44"},
            {"103","Soumik Nandi","3.44"},
            {"104","Arijit Das","4.14"},
            {"105","Sumit Das","3.14"},
            {"106","Sourav Sarkar","4.14"},
            {"101","Soumadip Dey","3.94"},
            {"102","Babu Dey","2.44"},
            {"103","Soumik Nandi","3.44"},
            {"104","Arijit Das","4.14"},
            {"105","Sumit Das","3.14"},
            {"106","Sourav Sarkar","4.14"},
        
    };
    
    TableDemo(){
        intiComponant();
    
}

    private void intiComponant() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JColorChooser Demo");
        this.setSize(710,450);
        c=this.getContentPane();
        c.setBackground(Color.cyan);
        this.setLocationRelativeTo(null);
         c.setLayout(null);
         
         f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
         
         label=new JLabel("Student Details");
         label.setBounds(250,20,200,50);
         label.setFont(f);
         c.add(label);
         
         table=new JTable(row,col);
         //table.setEnabled(false);
         table.setSelectionBackground(Color.yellow);
         scroll=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         scroll.setBounds(50,80,600,150);
         c.add(scroll);
         
         
         
         
         
         
         
         
    }
    
    
    public static void main(String[] args) {
        TableDemo test=new TableDemo();
    }
    
}
