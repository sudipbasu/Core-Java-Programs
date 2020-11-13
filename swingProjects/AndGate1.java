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
import javax.swing.JEditorPane;
import java.awt.Toolkit;

public class AndGate1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AndGate1 window = new AndGate1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AndGate1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sudip Basu\\Downloads\\449-4496522_transparent-check-mark-icon-png-check-icon-png.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1st Input : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(82, 76, 103, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(209, 74, 160, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Input : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(82, 120, 103, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 118, 160, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Output");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a= Integer.parseInt(textField.getText());
				int b= Integer.parseInt(textField_1.getText());
				
				if(a==0 && b==0)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Output : 0");
				}
				else if(a==0 && b==1)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Output : 0");
				}
				else if(a==1 && b==0)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Output : 0");
				}
				else if(a==1 && b==1)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Output : 1");
				}
				
				else
				{
					JOptionPane.showMessageDialog(frame, "Only Binary Digits are acceptable",
				               "Error!", JOptionPane.ERROR_MESSAGE);
				}
				}});



		btnNewButton.setBounds(158, 176, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("AND Gate ");
		lblNewLabel_2.setFont(new
				Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(35, 13, 135, 25);
		frame.getContentPane().add(lblNewLabel_2);
	}
}

