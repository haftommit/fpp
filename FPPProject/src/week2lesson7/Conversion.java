package week2lesson7;


import java.awt.Color;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.text.DecimalFormat;


import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;


public class Conversion extends JFrame {

	public static void main ( String [] a){

        Conversion calc = new Conversion();

    }

    private JButton btn1;

    

    private JLabel lbl1;

    private JLabel lbl2;

    private JLabel lbl3;

    private JLabel lbl4;

    private JLabel lbl5;

    private JLabel lbl6;

    private JLabel lbl7;

    private JLabel lbl8;

    

    private JTextField txt1;

    private JTextField txt2;

    private JTextField txt3;

    private JTextField txt4;

    private JTextField txt5;

    private JTextField txt6;

    private JTextField txt7;

    private JTextField txt8;

    

    public Conversion () {

        super();

        setTitle("Mertic Convertion Assistant");

        setLayout(null);

        setSize(430,220);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setBackground(Color.lightGray);

        

        lbl1 = new JLabel("Mile");

        lbl1.setBounds(20, 20, 100, 20);


        

        lbl2 = new JLabel("Pound");

        lbl2.setBounds(20, 50, 100, 20);

        

        lbl3 = new JLabel("Gallon");

        lbl3.setBounds(20, 80, 100, 20);

        

        lbl4 = new JLabel("Fahrenheit");

        lbl4.setBounds(20, 110, 100, 20);

        

        lbl5 = new JLabel("Kilometer");

        lbl5.setBounds(230, 20, 100, 20);

        

        

        

        lbl6 = new JLabel("Kilogram");

        lbl6.setBounds(230, 50, 100, 20);

        

        lbl7 = new JLabel("Liter");

        lbl7.setBounds(230, 80, 100, 20);

        

        lbl8 = new JLabel("Centigrade");

        lbl8.setBounds(230, 110, 100, 20);

        

        txt1 =new JTextField();

        txt1.setBounds(100, 20, 100, 25);

        

        txt2 =new JTextField();

        txt2.setBounds(100, 50, 100, 25);

       

        

        txt3 =new JTextField();

        txt3.setBounds(100, 80, 100, 25);

        

        txt4 =new JTextField();

        txt4.setBounds(100, 110, 100, 25);

        

        txt5 =new JTextField();

        txt5.setBounds(300, 20, 100, 25);

        

        txt6 =new JTextField();

        txt6.setBounds(300, 50, 100, 25);

        

        txt7 =new JTextField();

        txt7.setBounds(300, 80, 100, 25);

        

        txt8 =new JTextField();

        txt8.setBounds(300, 110, 100, 25);

        

        btn1=new JButton("Calculate");

        btn1.setBounds(160, 150, 150, 25);

        

        add(lbl1);

        add(lbl2);

        add(lbl3);

        add(lbl4);

        add(lbl5);

        add(lbl6);

        add(lbl7);

        add(lbl8);
        
        add(txt1);

        add(txt2);

        add(txt3);

        add(txt4);

        add(txt5);

        add(txt6);

        add(txt7);

        add(txt8);

        

        handleEvent event=new handleEvent();

        btn1.addActionListener(event);

        add(btn1);

        
        setVisible(true);

    }

    private class handleEvent implements ActionListener {

        

        @Override

        public void actionPerformed(ActionEvent event){


            double temp=0;

            DecimalFormat df = new DecimalFormat("####.##");

            

            if (!txt1.getText().equals("")) {

                temp = 1.609344 * Double.valueOf(txt1.getText()) ;

                txt5.setText( String.valueOf(df.format(temp)));

            }

            if (!txt2.getText().equals("")) {

                temp = 0.45359237 * Double.valueOf(txt2.getText()) ;

                txt6.setText( String.valueOf(df.format(temp)));

            }

            if (!txt3.getText().equals("")) {

                temp = 3.78541178 * Double.valueOf(txt3.getText()) ;

                txt7.setText( String.valueOf(df.format(temp)));

            }

            if (!txt4.getText().equals("")) {

                temp =  ((Double.valueOf(txt4.getText())  - 32)) * 0.555;

                txt8.setText( String.valueOf(df.format(temp) ));

            }

        }

    }
}