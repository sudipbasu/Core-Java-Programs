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
import java.awt.Toolkit;
import java.awt.Color;

public class PercentageCalculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PercentageCalculator window = new PercentageCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PercentageCalculator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\Java Programs\\Java Programs\\src\\swingProjects\\icons8-percentage-64.png"));
		frame.setBounds(100, 100, 648, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Exam Full Marks :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(185, 78, 245, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(185, 119, 219, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Score :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(211, 160, 219, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(181, 189, 223, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPercentage = new JLabel("Percentage :");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPercentage.setBounds(234, 224, 168, 22);
		frame.getContentPane().add(lblPercentage);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(185, 259, 219, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Substraction :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(233, 294, 144, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(185, 323, 219, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int total = Integer.parseInt(textField.getText());
				int score = Integer.parseInt(textField_1.getText());
				double percentage = (score*100)/total;
				int substraction = (total-score);
				textField_2.setText(Double.toString(percentage));
				textField_3.setText(Integer.toString(substraction));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(223, 369, 154, 25);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("Exam Percentage Calculator");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setBounds(149, 13, 405, 27);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
