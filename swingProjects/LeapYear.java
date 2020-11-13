package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class LeapYear {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeapYear window = new LeapYear();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LeapYear() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Year : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(106, 60, 107, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(225, 59, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int year= Integer.parseInt(textField.getText());
				if(year%4==0)
				{
					textField_1.setText(year+" is Leap Year");
				}
				else {
					textField_1.setText(year+" is not Leap Year");
				}
				
			}
		});
		btnNewButton.setBounds(163, 137, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(Color.WHITE);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(131, 201, 178, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
