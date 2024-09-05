package mypkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Update_User {

	private JFrame frmUpdatedeleteYour;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_User window = new Update_User();
					window.frmUpdatedeleteYour.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Update_User() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdatedeleteYour = new JFrame();
		frmUpdatedeleteYour.getContentPane().setBackground(new Color(128, 128, 128));
		frmUpdatedeleteYour.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\OIP.jpeg"));
		frmUpdatedeleteYour.setTitle("COSMECTIC PRODUCT SYSTEM");
		frmUpdatedeleteYour.setBounds(-7, 0, 1500, 700);
		frmUpdatedeleteYour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdatedeleteYour.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-: UPDATE/DELETE YOUR PROFILE :-");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(356, 52, 571, 51);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOBILE NO.:");
		lblNewLabel_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(292, 148, 173, 29);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(475, 147, 333, 30);
		frmUpdatedeleteYour.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("GET MY INFORMATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long Mobile = Long.parseLong(textField.getText());
				JDBC2 j = new JDBC2();
				
				ResultSet result = null;
				result = j.getRow(Mobile);
				 try {
					while(result.next()) {
						
						textField_1.setText(result.getString(1));
						textField_2.setText(result.getString(2));
						textField_3.setText(result.getString(3));
						textField_4.setText(result.getString(4));
					 }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(473, 198, 335, 29);
		frmUpdatedeleteYour.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("MOBILE NO.:");
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(128, 303, 181, 29);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NAME :");
		lblNewLabel_2_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(128, 343, 181, 29);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("PASSWORD :");
		lblNewLabel_2_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(128, 383, 181, 29);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("RE - PASS :");
		lblNewLabel_2_3.setForeground(new Color(240, 248, 255));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_3.setBounds(128, 423, 181, 29);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel_2_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setBounds(292, 303, 399, 30);
		frmUpdatedeleteYour.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(292, 343, 399, 30);
		frmUpdatedeleteYour.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(292, 383, 399, 30);
		frmUpdatedeleteYour.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(292, 423, 399, 30);
		frmUpdatedeleteYour.getContentPane().add(textField_4);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long Mobile = Long.parseLong(textField_1.getText());
				String Name      = textField_2.getText();
				String UserName= textField_3.getText();
				String LoginPassword= textField_4.getText();
				JDBC2 j = new JDBC2();
				//int status=j.insertUpdate(Mobile,Name,UserName,LoginPassword);
				int status = j.insertUpdate(Mobile, Name, UserName, LoginPassword);
				if (status==1) {
		    		JOptionPane.showMessageDialog(null, "Update Successfully");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "Update Successfully");
		    	}
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.setBounds(130, 507, 150, 29);
		frmUpdatedeleteYour.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC2 j = new JDBC2();
				long Mobile = Long.parseLong(textField_1.getText());
                int status = j.deleteUpdate(Mobile);
				
				if (status==1) {
		    		JOptionPane.showMessageDialog(null, "Delete Successfully");
		    		
		    	}else {
		    		JOptionPane.showMessageDialog(null, "Delete Successfully");
		    	}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_1.setBounds(340, 507, 150, 29);
		frmUpdatedeleteYour.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("RESET");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField.setText(null);
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_2.setBounds(541, 507, 150, 29);
		frmUpdatedeleteYour.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("BACK");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CosPage.main(null);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_3.setBounds(10, 11, 150, 29);
		frmUpdatedeleteYour.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("LOGOUT");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1_4.setBounds(10, 43, 150, 29);
		frmUpdatedeleteYour.getContentPane().add(btnNewButton_1_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("img\\dashboard.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 1283, 663);
		frmUpdatedeleteYour.getContentPane().add(lblNewLabel_3);
	}
}
