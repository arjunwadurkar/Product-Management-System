package mypkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import mypkg.JDBC2;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntryForm {

	private JFrame frmCosmeticProductSystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryForm window = new EntryForm();
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
	public EntryForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCosmeticProductSystem = new JFrame();
		frmCosmeticProductSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\OIP.jpeg"));
		frmCosmeticProductSystem.setTitle("COSMETIC PRODUCT SYSTEM");
		frmCosmeticProductSystem.setBounds(400, 80, 500, 500);
		frmCosmeticProductSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCosmeticProductSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("-: ENTER YOUR DETAILS :-");
		lblNewLabel_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(71, 26, 343, 32);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOBILE :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setBounds(10, 147, 134, 25);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NAME :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(240, 248, 255));
		lblNewLabel_3.setBounds(10, 183, 111, 25);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD :");
		lblNewLabel_4.setForeground(new Color(240, 248, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 222, 134, 32);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RE- PASS :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(240, 248, 255));
		lblNewLabel_5.setBounds(10, 265, 134, 25);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 248, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(157, 147, 298, 26);
		frmCosmeticProductSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(240, 248, 255));
		textField_1.setBounds(157, 182, 298, 26);
		frmCosmeticProductSystem.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(240, 248, 255));
		textField_2.setBounds(157, 222, 298, 26);
		frmCosmeticProductSystem.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(240, 248, 255));
		textField_3.setBounds(157, 261, 298, 26);
		frmCosmeticProductSystem.getContentPane().add(textField_3);
		
	/*	JButton btnNewButton = new JButton("SAVE DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                 long Mobile = Long.parseLong(textField.getText());
				 String Name = textField_1.getText();
				 String UserName = textField_2.getText();
				 String LoginPassword = textField_3.getText();
				 System.out.println(Mobile+Name+UserName+LoginPassword);
				
				 JDBC2 j= new JDBC2();
				int status = j.insertData(Mobile, Name, UserName, LoginPassword);
				
				
				 if (status==1) {
			    		JOptionPane.showMessageDialog(null, "data added");
			    		
			    	}else {
			    		JOptionPane.showMessageDialog(null, "problem in data added");
			    	}
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setBounds(20, 321, 445, 32);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);*/
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.setBounds(30, 367, 154, 32);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				
			}
		});
		btnNewButton_2.setBackground(new Color(240, 248, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(292, 367, 163, 32);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton = new JButton("SAVE DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long Moblie = Long.parseLong(textField.getText());
				String Name = textField_1.getText();
				String UserName = textField_2.getText();
				String LoginPassword = textField_3.getText();
				if(UserName.equals(LoginPassword)) {
				JDBC2 j= new JDBC2();
				int status = j.insertData(Moblie, Name, UserName, LoginPassword);
				
				if (status==4) {
		    		JOptionPane.showMessageDialog(null, "data added");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "problem in data added");
		    	}}
				
			}
		});
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(30, 316, 425, 32);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(157, 410, 126, 23);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_3);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("img\\dashboard.jpeg"));
		lblNewLabel.setBounds(-84, -38, 640, 818);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel);
		
	
		
		
	
		
		
		
	}
}
