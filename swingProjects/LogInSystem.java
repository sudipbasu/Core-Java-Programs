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
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Window.Type;

public class LogInSystem {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInSystem window = new LogInSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LogInSystem() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 525, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(67, 96, 86, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(215, 96, 222, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(67, 157, 104, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String email = textField.getText();
				String password = passwordField.getText();
				if(email.equals("admin@admin.com") && password.equals("admin"))
				{
					System.out.println("EMAIL : "+email+"\tPASSWORD : "+password);
					JOptionPane.showMessageDialog(btnNewButton, "WELCOME  "+email+"  ;)");
				}
				else if(email.equals("admin1@admin.com") && password.equals("admin1"))
				{
					System.out.println("EMAIL : "+email+"\tPASSWORD : "+password);
					JOptionPane.showMessageDialog(btnNewButton, "WELCOME  "+email+"  ;)");
				}
				else
				{
					System.err.println("Error !");
					JOptionPane.showMessageDialog(btnNewButton, "INVALID USER");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(202, 247, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(215, 157, 222, 22);
		frame.getContentPane().add(passwordField);
	}
}
