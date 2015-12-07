package week2lesson6;
import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JRadioButton;

import javax.swing.JTextArea;

import javax.swing.JTextField;


public class Extra_Credit_1 {

    public static void main(String[] a) {

        Regstration reg = new Regstration();

    }

}



 class Regstration extends JFrame {

    

    private JLabel lblLastName = new JLabel();

    private JLabel lblStreet = new JLabel();

    private JLabel lblState = new JLabel();

    private JLabel lblFirstName = new JLabel();

    private JLabel lblGender = new JLabel();

    private JLabel lblCourse = new JLabel();

    private JLabel lblSession = new JLabel();

    private JLabel lblCity = new JLabel();

    private JLabel lblCountry = new JLabel();

    private JLabel lblMsg = new JLabel();

    

    private JTextField txtFName = new JTextField();

    private JTextField txtLName = new JTextField();

    private JTextField txtStreet = new JTextField();

    private JTextField txtCity = new JTextField();

    private JTextField txtState = new JTextField();

    private JTextField txtCountry = new JTextField();

    private JRadioButton radMeal = new JRadioButton("Male",true);

    private JRadioButton radFemale = new JRadioButton("Female",false);

    private JComboBox<String> cmbCourse = new JComboBox();

    private JCheckBox chkMoring = new JCheckBox();

    private JCheckBox chkAfternoon = new JCheckBox();

    private JCheckBox chkEvening = new JCheckBox();

    private JTextArea txtaMsg = new JTextArea();

    private JButton btnSubmit = new JButton();

    private ButtonGroup group = new ButtonGroup();




    public Regstration () {

        super();

        setLayout( null );

        setSize(new Dimension(518, 418));

        

        lblFirstName.setText("First Name:");

        lblFirstName.setBounds(new Rectangle(105, 25, 90, 15));

        

        lblLastName.setText("Last Name:");

        lblLastName.setBounds(new Rectangle(110, 55, 90, 15));

        lblStreet.setText("Steet:");

        lblStreet.setBounds(new Rectangle(115, 85, 60, 15));

        lblState.setText("State:");

        lblState.setBounds(new Rectangle(115, 135, 60, 15));


          

        lblGender.setText("Gender:");

        lblGender.setBounds(new Rectangle(120, 190, 60, 15));

        lblCourse.setText("Select Course:");

        lblCourse.setBounds(new Rectangle(85, 215, 90, 15));

        lblSession.setText("Suitable Session:");

        lblSession.setBounds(new Rectangle(70, 240, 130, 15));

        lblCity.setText("City:");

        lblCity.setBounds(new Rectangle(115, 110, 60, 15));

        lblCountry.setText("Country:");

        lblCountry.setBounds(new Rectangle(115, 160, 60, 15));

        lblMsg.setText("Message:");

        lblMsg.setBounds(new Rectangle(110, 265, 60, 15));

        

        txtFName.setBounds(new Rectangle(180, 25, 165, 20));

        txtLName.setBounds(new Rectangle(180, 55, 165, 20));

        txtStreet.setBounds(new Rectangle(180, 80, 165, 20));

        txtCity.setBounds(new Rectangle(180, 105, 165, 20));

        txtState.setBounds(new Rectangle(180, 130, 165, 20));

        txtCountry.setBounds(new Rectangle(180, 155, 165, 20));


        radMeal.setBounds(180, 185, 100, 20);

        radFemale.setBounds(new Rectangle(265, 185, 100, 20));

        

        group.add(radMeal);

        group.add(radFemale);


        

        cmbCourse.setBounds(new Rectangle(175, 210, 170, 20));

        cmbCourse.addItem("Java");

        cmbCourse.addItem("C++");

        cmbCourse.addItem("SCI");

        cmbCourse.addItem("FPP");

        cmbCourse.addItem("MPP");

        chkMoring.setText("Moring");

        chkMoring.setBounds(new Rectangle(175, 235, 150, 20));

        chkAfternoon.setText("Afternoon");

        chkAfternoon.setBounds(new Rectangle(250, 235, 150, 20));

        chkEvening.setText("Evening");

        chkEvening.setBounds(new Rectangle(350, 235, 150, 20));

        txtaMsg.setBounds(new Rectangle(175, 260, 235, 65));

        btnSubmit.setText("Submit");

        btnSubmit.setBounds(new Rectangle(175, 345, 155, 30));

        HandleAction event =new HandleAction();

        btnSubmit.addActionListener(event);

        add(btnSubmit);

        add(txtaMsg);

        add(chkEvening);

        add(chkAfternoon);

        add(chkMoring);

        add(cmbCourse);

        add(radFemale);

        add(radMeal);


        add(txtState);

        add(txtCity);

        add(txtStreet);

        add(txtLName);

        add(txtFName);

        add(txtCountry);

        add(lblLastName);

        add(lblCity);

        add(lblSession);

        add(lblCourse);

        add(lblGender);

        add(lblFirstName);

        add(lblState);

        add(lblStreet);

        add(lblCountry);

        add(lblMsg);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }



    private class HandleAction implements ActionListener {

        

        public void actionPerformed(ActionEvent e){

            if (txtFName.getText().equals("")){

                JOptionPane.showMessageDialog(null, "please enter the first name");

                txtFName.requestFocusInWindow();

            }

            else if (txtLName.getText().equals("")){

                JOptionPane.showMessageDialog(null, "please enter the last name");

                txtLName.requestFocusInWindow();

            }

            else if (txtStreet.getText().equals("")){

                JOptionPane.showMessageDialog(null, "please enter the street");

                txtStreet.requestFocusInWindow();

            }

               else if (txtCity.getText().equals("")){

                JOptionPane.showMessageDialog(null, "please enter the city");

                txtCity.requestFocusInWindow();

            }

            else if (txtState.getText().equals("")){

                JOptionPane.showMessageDialog(null, "please enter the state");

                txtState.requestFocusInWindow();

            }

            else if (txtCountry.getText().equals("")){

                JOptionPane.showMessageDialog(null, "please enter the country");

                txtCountry.requestFocusInWindow();

            }

            else if (!radMeal.isSelected() && !radFemale.isSelected())

                JOptionPane.showMessageDialog(null, "please select the gander");

            else if (!chkMoring.isSelected() && !chkAfternoon.isSelected() && !chkEvening.isSelected())

                JOptionPane.showMessageDialog(null, "please select session");

            else

                JOptionPane.showMessageDialog(null, "Successfully Registered");

        }

    }

}