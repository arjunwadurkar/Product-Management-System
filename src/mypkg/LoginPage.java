package mypkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frmCosmeticProductSystem;
	private JTextField textUsername;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCosmeticProductSystem = new JFrame();
		frmCosmeticProductSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\OIP.jpeg"));
		frmCosmeticProductSystem.setTitle("COSMETIC PRODUCT SYSTEM");
		frmCosmeticProductSystem.getContentPane().setBackground(Color.BLACK);
		frmCosmeticProductSystem.setBounds(-7, 0, 1500, 800);
		frmCosmeticProductSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCosmeticProductSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile No. :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(405, 324, 158, 35);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUsername.setBackground(Color.GRAY);
		textUsername.setBounds(571, 324, 494, 35);
		frmCosmeticProductSystem.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		
		lblNewLabel_2 = new JLabel("Password : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.PINK);
		lblNewLabel_2.setBounds(409, 386, 173, 35);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBackground(Color.GRAY);
		passwordField.setBounds(571, 386, 494, 33);
		frmCosmeticProductSystem.getContentPane().add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String password = passwordField.getText();
				long Mobile = Long.parseLong(textUsername.getText());
				//String username = textUsername.getText();
			//	String LoginPassword= null;
				
				JDBC2 j = new JDBC2();
				ResultSet result = null;
				result = j.getRow(Mobile);
				
				
				
				if((textUsername.getText().trim().isEmpty())||(passwordField.getText().trim().isEmpty())) {
					JOptionPane.showMessageDialog(null,"Please Input Credentials","Login Failure Error",JOptionPane.ERROR_MESSAGE);
				}
				
				//else 
				//else  {
					
				else if(Mobile == 123456789 &&password.equals("admin123")){
						JOptionPane.showMessageDialog(null,"Login Successfully");
						
					DashBoard.main(null);
					}
				else {
					try {
						while (result.next()) {
						 String LoginPassword = result.getString(4);
						// System.out.println(LoginPassword);
							
						
						 
						 
						 
						 if(password.equals(LoginPassword)){
								JOptionPane.showMessageDialog(null,"Login Successfully");
								CosPage.main(null);
							}
							else {
								JOptionPane.showMessageDialog(null,"Input Valid Credentials","Login Failure Error",JOptionPane.ERROR_MESSAGE);
							}
						}
					//	System.out.println(UserName+LoginPassword);
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
						 
				//	}
						
					
						
						
					}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(571, 461, 135, 35);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textUsername.setText(null);
				passwordField.setText(null);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(743, 461, 135, 35);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(930, 461, 135, 35);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Register Now...");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EntryForm.main(null);
			}
		});
		btnNewButton_3.setForeground(Color.GRAY);
		btnNewButton_3.setBackground(Color.PINK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(827, 522, 238, 35);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Forgot Password");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Update_User.main(null);
			}
		});
		btnNewButton_4.setForeground(Color.GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBackground(Color.PINK);
		btnNewButton_4.setBounds(571, 522, 218, 35);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_4);
	
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(-24, 0, 1283, 700);
		lblNewLabel.setIcon(new ImageIcon("img\\R.jpeg"));
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel);
		
	
}}
