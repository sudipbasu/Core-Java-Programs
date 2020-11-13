package swingProjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jtoggle {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtoggle window = new Jtoggle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Jtoggle() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1257, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tglbtnNewToggleButton.isSelected())
				{
					
				}
			}
		});
		tglbtnNewToggleButton.setIcon(new ImageIcon("H:\\Java Programs\\Java Programs\\src\\swingProjects\\turn-off-power-switch-hand-light-512.png"));
		tglbtnNewToggleButton.setBounds(64, 13, 330, 496);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("H:\\Java Programs\\Java Programs\\src\\swingProjects\\light-bulb off.jpg"));
		lblNewLabel.setBounds(667, 13, 409, 496);
		frame.getContentPane().add(lblNewLabel);
	}
}
