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
import java.awt.Toolkit;

public class CalculatorApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CalculatorApp() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sudip Basu\\Downloads\\maths-1 (1).png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter First Number : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(42, 73, 150, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(244, 70, 176, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Second Number :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(42, 119, 182, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(244, 117, 176, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int c=a+b;
				JOptionPane.showMessageDialog(btnNewButton, a+"+"+b+"="+c);
			}
		});
		btnNewButton.setBounds(95, 182, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int c=a-b;
				JOptionPane.showMessageDialog(btnNewButton, a+"-"+b+"="+c);
			}
		});
		btnNewButton_1.setBounds(275, 182, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				int b=Integer.parseInt(textField_1.getText());
				int c=a*b;
				JOptionPane.showMessageDialog(btnNewButton, a+"*"+b+"="+c);
			}
		});
		btnNewButton_2.setBounds(95, 215, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double b=Double.parseDouble(textField_1.getText());
				double c=a/b;
				JOptionPane.showMessageDialog(btnNewButton, a+"/"+b+"="+c);
			}
		});
		btnNewButton_3.setBounds(275, 215, 97, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Calculator ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(156, 13, 204, 29);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
