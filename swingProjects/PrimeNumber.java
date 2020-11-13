package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PrimeNumber {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumber window = new PrimeNumber();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PrimeNumber() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 433, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(49, 70, 151, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(212, 69, 101, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Determine Prime or Not");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n= Integer.parseInt(textField.getText());
				int flag=0;
				if(n==0 || n==1)
				{
					textField_1.setText(n+" is Not a Prime Number");
				}
				else {
					for(int i=2;i<n;i++)
					{
						if(n%i==0) {
							textField_1.setText(n+" is Not a Prime Number");
							 flag=1;
							break;
						}
					}
					if(flag!=1) {
						textField_1.setText(n+" is a Prime Number");
					}
				}
			}
		});
		btnNewButton.setBounds(12, 134, 391, 25);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(12, 186, 391, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(162, 221, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}
