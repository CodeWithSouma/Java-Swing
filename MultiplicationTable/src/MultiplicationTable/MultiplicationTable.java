package MultiplicationTable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel label, headLabel, headLabel2;
    private Font f;
    private JTextField inputField;
    private JTextArea outputArea;
    private JScrollPane scroll;
    private JButton clear, submit;
    private Cursor cursor;

    MultiplicationTable() {

        initComponant();

    }

    private void initComponant() {
        icon = new ImageIcon("E:\\Java Swing Code\\MultiplicationTable\\src\\image\\mt3.jpg");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(icon.getIconWidth(), 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        c = this.getContentPane();
        c.setBackground(Color.ORANGE);

        this.setIconImage(icon.getImage());
        this.setTitle("Multiplication Table");
        label = new JLabel(icon);
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        c.setLayout(null);
        c.add(label);

        f = new Font("Arial", Font.BOLD, 15);
        headLabel = new JLabel("Enter A Number : ");
        headLabel.setFont(f);
        int h = (icon.getIconHeight() + 25);
        headLabel.setBounds(10, h + 10, 200, 20);
        c.setLayout(null);
        c.add(headLabel);

        inputField = new JTextField();
        //inputField.setBounds(215,h,70,20);
        c.setLayout(null);
        inputField.setBounds(150, h, 70, 40);
        c.add(inputField);
        inputField.setBackground(Color.CYAN);
        inputField.setHorizontalAlignment(JTextField.CENTER);
        inputField.setFont(f);

        headLabel2 = new JLabel("Multiplication Table : ");
        headLabel2.setFont(f);
        headLabel2.setBounds(10, h + 50, 200, 20);
        c.setLayout(null);
        c.add(headLabel2);

        outputArea = new JTextArea();
        outputArea.setFont(f);
        // outputArea.setBounds(10,h+70,240,250);
        outputArea.setBackground(Color.CYAN);
        c.setLayout(null);
        //c.add(outputArea);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        scroll = new JScrollPane(outputArea);
        scroll.setBounds(10, h + 80, 240, 250);
        c.add(scroll);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clear = new JButton("Clear");
        clear.setFont(f);
        clear.setCursor(cursor);
        clear.setBackground(Color.red);
        clear.setForeground(Color.black);
        clear.setBounds(20, h + 340, 90, 40);
        c.setLayout(null);
        c.add(clear);

        submit = new JButton("Submit");
        submit.setFont(f);
        submit.setCursor(cursor);
        submit.setBackground(Color.green);
        submit.setForeground(Color.black);
        submit.setBounds(120, h + 340, 90, 40);
        c.setLayout(null);
        c.add(submit);

        //now we add the listener 
        Listener listener = new Listener();
        inputField.addActionListener(listener);
        submit.addActionListener(listener);
        clear.addActionListener(listener);

    }

    //calculation method declair
    private void calculation(int n) {
        outputArea.setText("");
        int result;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            String r = String.valueOf(result);
            String inc = String.valueOf(i);
            String num = String.valueOf(n);
            outputArea.append(num + " X " + inc + " : " + r + "\n");

        }

    }

    //listener
    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == inputField || e.getSource() == submit) {
                String value = inputField.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did not enter anythings.", "Error Massage", JOptionPane.WARNING_MESSAGE);

                } else if (!value.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "Invalid Input.Please Enter An Integer", "Error Massage", JOptionPane.WARNING_MESSAGE);
                } else {
                    int num = Integer.parseInt(inputField.getText());
                    calculation(num);
                }

            } else if (e.getSource() == clear) {
                outputArea.setText("");
                inputField.setText("");
            }

        }

    }

    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();
    }

}
