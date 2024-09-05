package mypkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import mypkg.JDBC1;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;

public class UpdateProduct {

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
					UpdateProduct window = new UpdateProduct();
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
	public UpdateProduct() {
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
		
		JLabel lblNewLabel = new JLabel("-: UPDATE/DELETE PRODUCT INFORMATION :-");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(298, 30, 686, 56);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SERIAL NO.:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(22, 216, 193, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(238, 215, 457, 35);
		frmCosmeticProductSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
	
		JLabel lblNewLabel_1_1 = new JLabel("PRODUCT NAME :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(145, 128, 219, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(399, 127, 470, 36);
		frmCosmeticProductSystem.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("BRAND :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(733, 216, 136, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(841, 216, 389, 35);
		frmCosmeticProductSystem.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("PRODUCT TYPE :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_3.setBounds(22, 278, 218, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SIZE/VOLUME :");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_4.setBounds(22, 340, 206, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("PRICE RANGE :");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_5.setBounds(22, 391, 206, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("DISCRIPTION :");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_6.setBounds(22, 448, 206, 29);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1_6);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(238, 277, 992, 36);
		frmCosmeticProductSystem.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(238, 339, 992, 36);
		frmCosmeticProductSystem.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(238, 390, 992, 36);
		frmCosmeticProductSystem.getContentPane().add(textField_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setBounds(238, 437, 992, 102);
		frmCosmeticProductSystem.getContentPane().add(textArea);
		
		/*	JButton btnNewButton = new JButton("GET DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				JDBC1 j= new JDBC1();
								
				double SerialNo = Double.parseDouble(textField.getText());
			
				ResultSet result = null;
				result = j.getRow(SerialNo);
				
				try {
					 while(result.next());
						textField_1.setText(result.getString(2));
						textField_2.setText(result.getString(3));
						textField_3.setText(result.getString(4));
						textField_4.setText(result.getString(5));
						textField_5.setText(result.getString(7));
						textArea.setText(result.getString(6));
						
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(895, 126, 202, 33);
		frame.getContentPane().add(btnNewButton);*/
		
		/*JButton btnNewButton_1 = new JButton("SAVE CHANGE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	          double SerialNo = Double.parseDouble(textField.getText());
				
				String ProductName=textField_1.getText();
				String Brand= textField_2.getText();
			    String ProductType =textField_3.getText();
		    	String AvaibleInSize =textField_4.getText();
		    	String prices = textField_5.getText();
		    	String Discription=textArea.getText();
				
				JDBC1 j=new JDBC1();
		    	int status=j.insertUpdate(SerialNo, ProductName, Brand, ProductType, AvaibleInSize, prices, Discription);
		    	
		    	
		    	if (status==1) {
		    		JOptionPane.showMessageDialog(null, "data added");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "problem in data added");
		    	}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(217, 569, 202, 43);
		frame.getContentPane().add(btnNewButton_1);*/
		
		JButton btnNewButton_1_1 = new JButton("BACK");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DashBoard.main(null);
				
			}
		});
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(647, 569, 187, 43);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("RESET");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textArea.setText(null);
			}
		});
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(846, 569, 187, 43);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("LOGOUT");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
				
			}
		});
		btnNewButton_1_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(1043, 569, 187, 43);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_3);
		
		
		
	/*	JButton btnNewButton_1_1_1 = new JButton("DELETE");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBC1 j= new JDBC1();
				
				double SerialNo = Double.parseDouble(textField.getText());
				
				int status =j.deleteUpdate(SerialNo);
				

		    	if (status==1) {
		    		JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "Problem in data Delete");
		    	}
				
				
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(441, 569, 187, 43);
		frame.getContentPane().add(btnNewButton_1_1_1);*/
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//double SerialNo=Double.parseDouble(textField_1.getText());
				String ProductName = textField_1.getText();
					JDBC1 j = new JDBC1();
					
					ResultSet result = null;
					result = j.getRow(ProductName);
					 
					try {
						while(result.next()) {
							
							textField.setText(result.getString(1));
							textField_2.setText(result.getString(3));
							textField_3.setText(result.getString(4));
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(883, 129, 202, 30);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SAVE CHANGE");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double SerialNo = Double.parseDouble(textField.getText());
				String ProductName= textField_1.getText();
				String Brand      = textField_2.getText();
				String ProductType= textField_3.getText();
				String AvaibleInSize= textField_4.getText();
				String priceses   = textField_5.getText();
				String Discription = textArea.getText();
				
				JDBC1 j = new JDBC1();
				int status=j.insertUpdate(SerialNo,ProductName,Brand,ProductType,AvaibleInSize,priceses,Discription);
					
				if (status==1) {
		    		JOptionPane.showMessageDialog(null, "data added");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "problem in data added");
		    	}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(240, 569, 187, 43);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_4 = new JButton("DELETE");
		btnNewButton_1_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBC1 j= new  JDBC1();
				double SerialNo = Double.parseDouble(textField.getText());
				
				int status = j.deleteUpdate(SerialNo);
				
				if (status==1) {
		    		JOptionPane.showMessageDialog(null, "data added");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "problem in data added");
		    	}
				
				
				
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_4.setBounds(450, 569, 187, 43);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("img\\pwdUYC.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1283, 663);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_2);
		
		
		
	}
}
