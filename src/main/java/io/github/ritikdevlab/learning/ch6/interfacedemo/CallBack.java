package io.github.ritikdevlab.learning.ch6.interfacedemo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CallBack {
	public static void main(String[] args) {
		boolean result = true;
		while (result == true) {
			Performance p = new Performance();
			Timer t = new Timer(60000, p);
			t.start();
			
			JOptionPane.showMessageDialog(null, "Stop Program?");
			t.stop();
			
			String getAns = IO.readln("Exit program(Yes/No):-").toLowerCase();
			if (getAns.equals("yes")) {
				result = false;
				System.exit(0);
			}
		}
	}
}

class Performance implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		IO.println("The time is " + Instant.ofEpochMilli(e.getWhen()));
		Toolkit.getDefaultToolkit().beep();
	}
}
