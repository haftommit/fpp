import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Testme {

	private JFrame frameLT;
	private JTextField textField;
	JComboBox<String> cmbCourse = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testme window = new Testme();
					window.frameLT.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Testme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLT = new JFrame();
		frameLT.setTitle("Language Translator");
		frameLT.setBounds(100, 100, 450, 300);
		frameLT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLT.getContentPane().setLayout(null);
		
		JButton btnFrom = new JButton("From:");
		btnFrom.setBounds(6, 23, 82, 29);
		frameLT.getContentPane().add(btnFrom);
		
		

     
		
		JButton btnTranslate = new JButton("Translate");
		btnTranslate.setBounds(351, 23, 93, 29);
		frameLT.getContentPane().add(btnTranslate);
		
		textField = new JTextField();
		textField.setBounds(193, 22, 156, 28);
		frameLT.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnMaintain = new JButton("Maintain");
		btnMaintain.setBounds(327, 243, 117, 29);
		frameLT.getContentPane().add(btnMaintain);
		
		JComboBox cboxlist = new JComboBox();
		cboxlist.setBounds(72, 24, 123, 27);
		
		
		
        cboxlist.addItem("English");

        cboxlist.addItem("Chinese");
        cboxlist.addItem("Tigrinya");
        cboxlist.addItem("Nepali");
        
        
		frameLT.getContentPane().add(cboxlist);
	}

}
