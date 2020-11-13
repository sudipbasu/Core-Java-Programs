package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 window = new Calculator2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
	}

	
	public Calculator2() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter 2nd Number : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(99, 145, 162, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(296, 91, 129, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 1st Number : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(99, 94, 162, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(296, 145, 129, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(textField.getText());
				int n1 = Integer.parseInt(textField_1.getText());
				int c =n+n1;
				 textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(62, 217, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(textField.getText());
				int n1 = Integer.parseInt(textField_1.getText());
				int c = n - n1;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(62, 283, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(textField.getText());
				int n1 = Integer.parseInt(textField_1.getText());
				int c = n *n1;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(453, 218, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(textField.getText());
				int n1 = Integer.parseInt(textField_1.getText());
				int c = n / n1;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(453, 284, 97, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(296, 338, 129, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Answer :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(99, 342, 97, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Calculator");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(246, 27, 140, 25);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setBounds(100, 100, 631, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
