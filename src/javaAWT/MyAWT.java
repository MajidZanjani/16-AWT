package javaAWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.io.Closeable;

public class MyAWT {
	
	static class MyAWTExample extends Frame {
		
		TextField msg;
		TextField yourName;
		
		public MyAWTExample() {
			
			Frame frame = new Frame();
			frame.setBounds(200, 200, 290, 200);
			frame.setLayout(null);
			
			Label label = new Label("Enter your name:");
			label.setBounds(20, 50, 100, 20);
			frame.add(label);
			
			yourName = new TextField();
			yourName.setBounds(120, 50, 150, 20);
			frame.add(yourName);

			msg = new TextField();
			msg.setBounds(20, 120, 250, 20);
			
			frame.add(msg);
			
			Button button = new Button("Click Me!");
			button.setBounds(30, 80, 220, 20);
			frame.add(button);
			
			MyActionListener actionListener = new MyActionListener(this);
			button.addActionListener(actionListener);			
			
			frame.setVisible(true);
			
		}
	}

	public static void main(String[] args) {

		new MyAWTExample();

	}

}
