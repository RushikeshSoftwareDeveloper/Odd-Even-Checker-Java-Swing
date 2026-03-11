package com.EvenOddGame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OddEvenGame extends JFrame implements ActionListener {
	
	private JTextField numberField;
	private JButton checButton;
	private JLabel resultJLabel;
	
	public OddEvenGame() {
		// TODO Auto-generated constructor stub
		
		setTitle("Odd Even Game:");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Enter Number: ");
		
		numberField = new JTextField(10);
		
		checButton = new JButton("Check");
		checButton.addActionListener(this);
		
		resultJLabel= new JLabel("");
		
		add(label);
		add(numberField);
		add(checButton);
		add(resultJLabel);
		
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			
			int num= Integer.parseInt(numberField.getText());
			
			if(num % 2 == 0) {
				
				resultJLabel.setText("Number is Even: ");
			}else {
				resultJLabel.setText("Number is Odd: ");
			}
		}catch(Exception ex) {
			
			resultJLabel.setText("Enter valid number!!");
		}
		
	}
	
	public static void main(String[] args) {
		 new OddEvenGame();
	}

}
