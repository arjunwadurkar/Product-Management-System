package mypkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTree;

public class CosPage {

	private JFrame frmCosmeticProductSystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CosPage window = new CosPage();
					window.frmCosmeticProductSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CosPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCosmeticProductSystem = new JFrame();
		frmCosmeticProductSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\OIP.jpeg"));
		frmCosmeticProductSystem.setTitle("COSMETIC PRODUCT SYSTEM");
		frmCosmeticProductSystem.setBounds(-7, 0, 1500, 700);
		frmCosmeticProductSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCosmeticProductSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-: PRODUCT DETAILS :-");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(419, 26, 444, 45);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCT NAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(232, 119, 223, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(465, 116, 353, 29);
		frmCosmeticProductSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(288, 400, 907, 100);
		frmCosmeticProductSystem.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String ProductName = textField.getText();
				//double SerialNo = Double.parseDouble(textField.getText());
				String ProductName = textField.getText();
					JDBC1 j = new JDBC1();
					
					ResultSet result = null;
					result = j.getRow(ProductName);
					 
					try {
						while(result.next()) {
							
							textField_1.setText(result.getString(1));
							textField_2.setText(result.getString(4));
							textField_3.setText(result.getString(3));
							textField_4.setText(result.getString(5));
							textField_5.setText(result.getString(7));
							textArea.setText(result.getString(6));
							
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
			}
		});
		btnNewButton.setBounds(850, 114, 210, 31);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("SERIAL NO.:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(55, 183, 223, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("PRODUCT TYPE :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(55, 234, 223, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("BRAND :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(726, 183, 129, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SIZE/VOLUME :");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_4.setBounds(55, 292, 223, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("PRICE RANGE :");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_5.setBounds(55, 344, 223, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("DISCRIPTION :");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_6.setBounds(55, 400, 223, 26);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_6);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(288, 180, 353, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(288, 239, 907, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		textField_3.setBounds(842, 183, 353, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setColumns(10);
		textField_4.setBounds(288, 292, 907, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setColumns(10);
		textField_5.setBounds(288, 344, 907, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_5);
		
		
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(99, 555, 189, 45);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("LOGOUT");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(1004, 555, 189, 45);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("VIEW LIST");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowProductList.main(null);
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(390, 555, 189, 45);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("RESET");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText(null);
				textField.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textArea.setText(null);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3.setBounds(702, 555, 189, 45);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("MY PROFILE");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Update_User.main(null);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_4.setBounds(1073, 0, 210, 29);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_4);
		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("img\\pwdUYC.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1283, 663);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_2);
		
		
	}
}
