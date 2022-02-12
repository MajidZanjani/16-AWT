package javaAWT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javaAWT.MyFirstAWT.MyAWTExample;

public class MyActionListener implements ActionListener {

	MyAWTExample objecMyAWT;
	
	public MyActionListener(MyAWTExample myAWTExample) {
		this.objecMyAWT = myAWTExample;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		objecMyAWT.msg.setText("Welcome " + objecMyAWT.yourName.getText() + "!");
	}
	
}
