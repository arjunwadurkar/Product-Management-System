package mypkg;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBoard {

	private JFrame frmCosmeticProjectSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
					window.frmCosmeticProjectSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCosmeticProjectSystem = new JFrame();
		frmCosmeticProjectSystem.setTitle("COSMETIC PROJECT SYSTEM");
		frmCosmeticProjectSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\OIP.jpeg"));
		frmCosmeticProjectSystem.setBounds(-7, 0, 1500, 700);
		frmCosmeticProjectSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCosmeticProjectSystem.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADD PRODUCT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddProduct.main(null);
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(151, 69, 397, 52);
		frmCosmeticProjectSystem.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE/DELETE PRODUCT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateProduct.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(151, 152, 397, 52);
		frmCosmeticProjectSystem.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SHOW PRODUCT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CosPage.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBounds(151, 235, 397, 52);
		frmCosmeticProjectSystem.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRODUCT LIST");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ShowProductList.main(null);
			}
			
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.setBounds(151, 316, 397, 52);
		frmCosmeticProjectSystem.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("BACK  ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage.main(null);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.setBounds(151, 402, 397, 52);
		frmCosmeticProjectSystem.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("LOGOUT");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage.main(null);
				
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4_1.setBounds(151, 493, 397, 52);
		frmCosmeticProjectSystem.getContentPane().add(btnNewButton_4_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(-12, 0, 1343, 782);
		lblNewLabel.setIcon(new ImageIcon("img\\dashboard.jpeg"));
		frmCosmeticProjectSystem.getContentPane().add(lblNewLabel);
			
	}

}
