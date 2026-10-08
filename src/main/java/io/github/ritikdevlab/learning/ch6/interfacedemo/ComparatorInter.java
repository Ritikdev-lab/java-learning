package io.github.ritikdevlab.learning.ch6.interfacedemo;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInter {
	public static void main(String[] args) {
		Alphabet al = new Alphabet();
		int compare = al.compare("fire", "water");
		IO.println(compare);

		String[] friends = { "Pintu", "Banita", "Lata", "Paramita" };
		Arrays.sort(friends, new Alphabet());
		IO.println(Arrays.toString(friends));
	}
}

class Alphabet implements Comparator<String> {
	public int compare(String first, String second) {
		return first.length() - second.length();
	}
}