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
import javax.swing.SwingConstants;

public class LinearSearchSwing {

	private JFrame frame;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearchSwing window = new LinearSearchSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LinearSearchSwing() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Element to Search :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(117, 96, 252, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(187, 125, 77, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag=0;
				int i;
				int arr[]= {5,6,7,8,9,10,45,66,77,45,16,15,25};
				int item = Integer.parseInt(textField.getText());
				for(i=0;i<arr.length;i++)
				{
					if(arr[i]==item)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println(item+" is found in the location "+(i+1));
					JOptionPane.showMessageDialog(btnNewButton, item+" is found in the location "+(i+1));
				}
				else
				{
					System.out.println(item+ "not Found");
					JOptionPane.showMessageDialog(btnNewButton, item+" is not Found");
				}
			}
		});
		btnNewButton.setBounds(170, 189, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}

}
