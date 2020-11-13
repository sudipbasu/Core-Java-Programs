package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Toolkit;

public class Greatest3nos {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Greatest3nos window = new Greatest3nos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Greatest3nos() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sudip Basu\\Downloads\\check-icon-check-mark-computer-icons-green-tick-png-clip-art.png"));
		frame.setBounds(100, 100, 740, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter 1st Number : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(178, 152, 143, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(344, 150, 202, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 2nd Number :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(178, 209, 143, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(344, 207, 202, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter 3rd Number :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(178, 259, 143, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(344, 257, 202, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate Greatest Number");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n1=Integer.parseInt(textField.getText());
				int n2=Integer.parseInt(textField_1.getText());
				int n3=Integer.parseInt(textField_2.getText());
				if(n1>n2 && n1>n2)
				{
					JOptionPane.showMessageDialog(btnNewButton, n1+" is Greatest");
				}
				else if(n2>n1 && n2>n3)
				{
					JOptionPane.showMessageDialog(btnNewButton, n2+" is Greatest");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, n3+" is Greatest");
				}
			}
		});
		btnNewButton.setBounds(231, 333, 290, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Calculate Greatest Among 3 Numbers");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setBounds(142, 27, 446, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(625, 384, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}
