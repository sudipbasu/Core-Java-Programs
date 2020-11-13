package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JRadioButton;

public class StudentResult {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResult window = new StudentResult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentResult() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 784, 502);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1st Subject Marks :");
		lblNewLabel.setBounds(122, 116, 123, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Subject Marks :");
		lblNewLabel_1.setBounds(122, 162, 123, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3rd Subject Marks :");
		lblNewLabel_2.setBounds(122, 205, 123, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(316, 113, 243, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 159, 243, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(316, 202, 243, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sum and Average");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int sub1=Integer.parseInt(textField.getText());
				int sub2=Integer.parseInt(textField_1.getText());
				int sub3=Integer.parseInt(textField_2.getText());
				int sum=sub1+sub2+sub3;
				double avg=1;
				 avg=(sum/300);
				System.out.println("Total Marks:"+sum);
				System.out.println("Average Marks:"+avg);
				JOptionPane.showMessageDialog(btnNewButton, "Total Marks:"+sum);
				
				JOptionPane.showMessageDialog(btnNewButton, "Average:"+avg);
			}
		});
		btnNewButton.setBounds(294, 386, 171, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
