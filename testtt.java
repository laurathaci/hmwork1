package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JTextField field = new JTextField(10);
		JTextField field2 = new JTextField(10);
		
		JLabel label = new JLabel();
		
		JButton button = new JButton("OK");
		panel.add(field);
		panel.add(field2);
		panel.add(button);
		panel.add(label);
		panel.setLayout(new FlowLayout());
		frame.setSize(500,500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		field.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(field.getText());
				int b = Integer.parseInt(field2.getText());
				int c = a+b;
				label.setText("Value is: " + c);
			}
		});
		
	}

}
