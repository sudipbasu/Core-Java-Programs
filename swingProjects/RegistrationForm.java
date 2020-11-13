package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class RegistrationForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window = new RegistrationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public RegistrationForm() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(58, 75, 66, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(224, 72, 220, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gender :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(58, 147, 83, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(224, 144, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(346, 144, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(58, 208, 83, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(179, 192, 366, 73);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(58, 299, 127, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(224, 297, 220, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				System.out.println("Name:"+name);
				if(rdbtnNewRadioButton.isSelected())
				{
					System.out.println("Gender: Male");
				}
				else if(rdbtnNewRadioButton_1.isSelected())
				{
					System.out.println("Gender: Female");
				}
				String address = textArea.getText();
				System.out.println("Address: "+address);
				String phn=textField_1.getText();
				System.out.println("Phone Number: "+phn);
			}
		});
		btnNewButton.setBounds(224, 369, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
