package io.github.ritikdevlab.learning.Ch4.Document.program.program2.snippet;
import io.github.ritikdevlab.learning.Ch4.Document.program.program2.Gear;

public class GearExample {
	public static void main(String[] args) {
		// @start region = speed-example

		Gear gear = new Gear(); // @highlight substring = Gear
		gear.Speed(25);// @highlight substring = Speed
		gear.Speed(50);// @replace regex = 50 replacement = "speedValue"

		// @end
	}
}