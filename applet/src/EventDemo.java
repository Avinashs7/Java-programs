package com.swing.event_handling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDemo {
	
	JLabel label;
	
	EventDemo () {
		
		JFrame frame = new JFrame("An Event Example");
		
		frame.setLayout(new FlowLayout());
		
		frame.setSize(200, 150);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Press for Magic");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				label.setText("Button was pressed");
			}
		});
		
		frame.add(button);
		
		label = new JLabel("Press");
		
		frame.add(label);
		
		frame.setVisible(true);
	}
}
