package io.github.ritikdevlab.learning.Ch4.Construction;
import java.util.Random;
import java.util.random.RandomGenerator;
public class RandomDemo {
	public static void main (String[] args) {
		//1.Returns Java’s default modern random generator
		RandomGenerator generator = RandomGenerator.getDefault();
		
		//2.It chooses from the 0 to 9
		int num = generator.nextInt(10);
		IO.println("The random number is " + num);
		//Now it chooses from the 1 to 10
		int numb = generator.nextInt(10) + 1;
		IO.println("The random number is " + numb);
		/**
		 * L -> Linear Congruential Generator (LCG) (This is an older mathematical random-generation technique.)
		 *64 -> 64-bit state (A larger state gives better randomness quality.)
		 * X128 -> 128-bit xor-based state (This improves randomness further.)
		 * Mix -> Means Java mixes/shuffles the generated bits to improve quality. (This reduces visible patterns.)
		 * Random -> Means it is a random-number generator.
		 */
		//3.Creates a random generator using a specific algorithm.
		RandomGenerator v = RandomGenerator.of("L64X128MixRandom");
		int Num = v.nextInt(100);
		IO.println("The random value is " + Num);

		//4.Converts a modern RandomGenerator into old-style Random
		Random r = Random.from(v);
		IO.println("The random nunber is " + r.nextInt(100));

	}
}