package mypkg;

import java.awt.EventQueue
;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import mypkg.JDBC1;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AddProduct {

	private JFrame frmCosmeticProductSystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct window = new AddProduct();
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
	public AddProduct() {
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
		
		JLabel lblNewLabel = new JLabel("SERIAL NO.:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(45, 111, 203, 31);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblProductName = new JLabel("PRODUCT NAME :");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblProductName.setBounds(45, 166, 231, 31);
		frmCosmeticProductSystem.getContentPane().add(lblProductName);
		
		JLabel lblBrand = new JLabel("BRAND :");
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBrand.setBounds(687, 111, 203, 31);
		frmCosmeticProductSystem.getContentPane().add(lblBrand);
		
		JLabel lblProductType = new JLabel("PRODUCT TYPE :");
		lblProductType.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblProductType.setBounds(45, 208, 203, 31);
		frmCosmeticProductSystem.getContentPane().add(lblProductType);
		
		JLabel lblAvaibleInSize = new JLabel("SIZE/VOLUME :");
		lblAvaibleInSize.setForeground(new Color(0, 0, 0));
		lblAvaibleInSize.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAvaibleInSize.setBounds(45, 265, 219, 31);
		frmCosmeticProductSystem.getContentPane().add(lblAvaibleInSize);
		
		JLabel lblPriceses = new JLabel("PRICE RANGE :");
		lblPriceses.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPriceses.setBounds(45, 318, 203, 31);
		frmCosmeticProductSystem.getContentPane().add(lblPriceses);
		
		JLabel lblDiscription = new JLabel("DISCRIPTION :");
		lblDiscription.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDiscription.setBounds(45, 370, 203, 31);
		frmCosmeticProductSystem.getContentPane().add(lblDiscription);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(254, 112, 368, 29);
		frmCosmeticProductSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(258, 167, 922, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(258, 209, 922, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(258, 266, 922, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(258, 319, 922, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(816, 112, 368, 29);
		frmCosmeticProductSystem.getContentPane().add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setBounds(258, 371, 922, 146);
		frmCosmeticProductSystem.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double SerialNo = Double.parseDouble(textField.getText());
				
				String ProductName=textField_1.getText();
				String Brand= textField_6.getText();
			    String ProductType =textField_2.getText();
		    	String AvaibleInSize =textField_3.getText();
		    	String prices = textField_4.getText();
		    	String Discription=textArea.getText();
		    	
		    	
		    	JDBC1 j=new JDBC1();
		    	int status=j.insertdata(SerialNo, ProductName,Brand, ProductType,AvaibleInSize, prices, Discription);
		    	
		    	
		    	if (status==1) {
		    		JOptionPane.showMessageDialog(null, "data added");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "problem in data added");
		    	}
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(264, 542, 203, 43);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DashBoard.main(null);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(510, 542, 203, 43);
		frmCosmeticProductSystem.getContentPane().add(btnBack);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_6.setText(null);
				textArea.setText(null);
			}
		});
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(743, 542, 203, 43);
		frmCosmeticProductSystem.getContentPane().add(btnReset);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogout.setBounds(977, 542, 203, 43);
		frmCosmeticProductSystem.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel_2 = new JLabel("-: ADD PRODUCT INFORMATION :-");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(362, 21, 558, 50);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setIcon(new ImageIcon("img\\pwdUYC.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1293, 663);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1);
		
		
	}
}
