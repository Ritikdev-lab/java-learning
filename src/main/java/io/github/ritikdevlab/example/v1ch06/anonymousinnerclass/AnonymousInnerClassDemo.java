package io.github.ritikdevlab.example.v1ch06.anonymousinnerclass;

import module java.desktop;

/**
 * This program demonstrates anonymous inner classes,
 */
public class AnonymousInnerClassDemo {
	void main() {
		var clock = new TalkingClock();
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
