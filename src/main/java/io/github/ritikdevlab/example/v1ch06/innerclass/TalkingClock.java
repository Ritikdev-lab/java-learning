package io.github.ritikdevlab.example.v1ch06.innerclass;

import module java.base;
import module java.desktop;
import javax.swing.Timer;

/**
 * A clock that prints the time in regular intervals.
 */
public class TalkingClock {
	private int interval;
	private boolean beep;
	
	/**
	 * Constructs a talking clock.
	 * 
	 * @param interval the interval between message (in millisecond)
	 * @param beep true if the clock should beep
	 */
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * Starts the clock.
	 */
	public void start() {
		var listener = new TimePrinter();
		var timer = new Timer(interval, listener);
		timer.start();
	}
	
	public class TimePrinter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			IO.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}
