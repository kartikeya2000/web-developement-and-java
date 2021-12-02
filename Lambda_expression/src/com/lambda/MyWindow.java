package com.lambda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame  frame  = new JFrame("MY WINDOW");
		 frame.setSize(400, 400);
		 frame.setLayout(new FlowLayout());
		
		//Create Button
		
		JButton button = new JButton("Click me");
		
        button.addActionListener(
        		e-> 
           {
				System.out.println("Button Clicked");
				JOptionPane.showMessageDialog(null, "hey button clicked ");
				
				
			}
        );
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
		frame.setVisible(true);
		

	}

} 
