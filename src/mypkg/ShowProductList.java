package mypkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ShowProductList {

	private JFrame frmCosmeticProductSystem;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowProductList window = new ShowProductList();
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
	public ShowProductList() {
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
		
		JLabel lblNewLabel = new JLabel("-: PRODUCT LIST :-");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(341, 35, 600, 44);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(198, 112, -151, 2);
		frmCosmeticProductSystem.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 110, 1196, 444);
		frmCosmeticProductSystem.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"SerialNo", "ProductName", "Brand", "ProductType", "AvaibleInSize", "Discription", "Priceses"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DashBoard.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(48, 576, 277, 44);
		frmCosmeticProductSystem.getContentPane().add(btnNewButton);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogout.setBounds(967, 576, 277, 44);
		frmCosmeticProductSystem.getContentPane().add(btnLogout);
		
		JButton btnBack = new JButton("SHOW");
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBC1 j = new JDBC1();
				ResultSet result = j.getTable();
				
				DefaultTableModel model=new DefaultTableModel();
				String[] columnNames = {"SerialNo","ProductName","Brand","ProductType","AvaibleInSize","Discription","Priceses"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						
						model.addRow(new Object[]{
								
								result.getDouble(1),
								result.getString(2),
								result.getString(3),
								result.getString(4),
								result.getString(5),
								result.getString(6),
								result.getString(7),
							
						});
						
						
						
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(503, 576, 277, 44);
		frmCosmeticProductSystem.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img\\pwdUYC.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1283, 663);
		frmCosmeticProductSystem.getContentPane().add(lblNewLabel_1);
	}
}
