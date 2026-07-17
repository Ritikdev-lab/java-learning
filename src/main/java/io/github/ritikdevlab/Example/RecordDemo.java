package io.github.ritikdevlab.Example;
import java.util.Date;

/**
 *This program demonstrates records. 
 */
public class RecordDemo {
	void main(String[] args) {
		var p = new Point(3,4);
		IO.println("Coordinates of p: (" + p.x() + "," + p.y() + ")");

		IO.println("Distance from origin: " + p.distanceFromOrigin());

		//Same computation with static field and method
		IO.println("Distance from origin: " + Point.distance(Point.ORIGIN,p));

		var r = new Range(4,3);
		//A mutable record
		IO.println("r: " + r);

		/**Records are only shallowly immutable.
		 * The record reference fields cannot be reassigned,
		 *  but the objects stored inside them may still be mutable.
		 */
		var pt = new PointInTime(3,4,new Date());
		IO.println("Before: " + pt);
		pt.when().setTime(0);
		IO.println("After: " + pt);
	}
} 
record Point(double x , double y) {
	//A custom constructor
	Point() {
		this(0,0);	
	}
	//A method
	double distanceFromOrigin() {
		return Math.hypot(x, y);
	}
	//A static field and method
	static final Point ORIGIN = new Point();
	static double distance(Point p , Point q) {
		return Math.hypot(p.x - q.x, p.y - q.y);
	}
}
record Range(int from , int to) {
	//A compact constructor
	Range {
		if (from > to) {
			//Swap the bounds
			int temp = from;
			from = to;
			to = temp;
		}
	}
}
record PointInTime(double x , double y , Date when) {}