package Collection_Generic;

import java.util.Vector;

class Point {
	
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class VectorMain {

	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(3,2));
		v.add(new Point(10,20));
		v.add(new Point(10, 100));
		
		for(int i = 0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
