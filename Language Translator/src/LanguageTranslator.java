import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Window.Type;

public class LanguageTranslator {

	private JFrame frmLanguageTranslator;
	private JTextField txtInput;
	JButton btnSearch, btnAdd;
	JLabel lblEnterWord;
	private JLabel lblChines;
	private JTextField txtchinese;
	private JLabel lbltigrinya;
	private JTextField txttigrinya;
	private JLabel lblnepali;
	private JTextField txtnepali;
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LanguageTranslator window = new LanguageTranslator();
					window.frmLanguageTranslator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LanguageTranslator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLanguageTranslator = new JFrame();
		frmLanguageTranslator.setAlwaysOnTop(true);
		frmLanguageTranslator.setTitle("Language Translator");
		frmLanguageTranslator.setBounds(100, 100, 551, 333);
		frmLanguageTranslator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(179, 212, 127, 43);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are adding a chinese word!");
			}
		});
		frmLanguageTranslator.getContentPane().setLayout(null);
		frmLanguageTranslator.getContentPane().add(btnAdd);
		
		JLabel lblEnterWord = new JLabel("English");
		lblEnterWord.setBounds(55, 36, 89, 28);
		frmLanguageTranslator.getContentPane().add(lblEnterWord);
		
		txtInput = new JTextField();
		txtInput.setBounds(147, 36, 176, 28);
		frmLanguageTranslator.getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(335, 30, 99, 140);
		btnSearch.setBackground(Color.DARK_GRAY);
		frmLanguageTranslator.getContentPane().add(btnSearch);
		
		lblChines = new JLabel("Chines");
		lblChines.setBounds(55, 81, 71, 16);
		frmLanguageTranslator.getContentPane().add(lblChines);
		
		txtchinese = new JTextField();
		txtchinese.setBounds(147, 76, 176, 28);
		frmLanguageTranslator.getContentPane().add(txtchinese);
		txtchinese.setColumns(10);
		
		lbltigrinya = new JLabel("Tigrinya");
		lbltigrinya.setBounds(55, 118, 89, 16);
		frmLanguageTranslator.getContentPane().add(lbltigrinya);
		
		txttigrinya = new JTextField();
		txttigrinya.setBounds(147, 112, 176, 28);
		frmLanguageTranslator.getContentPane().add(txttigrinya);
		txttigrinya.setColumns(10);
		
		lblnepali = new JLabel("Nepali");
		lblnepali.setBounds(55, 154, 89, 16);
		frmLanguageTranslator.getContentPane().add(lblnepali);
		
		txtnepali = new JTextField();
		txtnepali.setBounds(147, 146, 176, 28);
		frmLanguageTranslator.getContentPane().add(txtnepali);
		txtnepali.setColumns(10);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(335, 212, 99, 43);
		frmLanguageTranslator.getContentPane().add(btnUpdate);
	}
}
