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

public class FactorialNumber {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorialNumber window = new FactorialNumber();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FactorialNumber() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(143, 178, 183, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(325, 171, 311, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate Factorial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(textField.getText());
				int fact=1;
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				JOptionPane.showMessageDialog(btnNewButton, n+" ! = "+fact);
			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnNewButton.setBounds(254, 292, 254, 25);
		frame.getContentPane().add(btnNewButton);
	}

}
