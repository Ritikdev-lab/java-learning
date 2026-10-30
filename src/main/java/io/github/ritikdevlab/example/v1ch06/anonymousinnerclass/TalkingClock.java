package io.github.ritikdevlab.example.v1ch06.anonymousinnerclass;

import module java.base;
import module java.desktop;
import javax.swing.Timer;

/**
 * A clock that prints the time in regular interval.
 */
public class TalkingClock {
	public void start(int interval, boolean beep) {
		var listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				IO.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		var timer = new Timer(interval, listener);
		timer.start();	
	}
}
