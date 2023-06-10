package Tugas;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener{
    private JButton jumlah;
    private JTextField textField1;
    private JTextField textField2;

    private int nilai1 = 0;
    private int nilai2 = 0;
    private int hasil = 0;

    public HelloWorldForm3() {
        jumlah = new JButton("Jumlah");
        jumlah.addActionListener(this);
        textField1 = new JTextField();
        textField2 = new JTextField();

        setTitle("Penjumlahan");
        setLayout(new GridLayout(3, 1));
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(textField1);
        add(textField2);
        add(jumlah);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!textField1.getText().equals("") && !textField1.getText().equals("")){
            nilai1 = Integer.parseInt(textField1.getText());
            nilai2 = Integer.parseInt(textField2.getText());
        }
            hasil = nilai1 + nilai2;

        JOptionPane.showMessageDialog(this, "Hasil penjumlahan adalah " + hasil);
    }
}
