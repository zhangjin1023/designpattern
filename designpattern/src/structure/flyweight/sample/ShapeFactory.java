package structure.flyweight.sample;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<String,Shape> pool = new HashMap<>();
	
	public static Shape getCircle(String color){
		Circle circle = (Circle) pool.get(color);
		if (circle == null) {
			circle = new Circle(color);
			pool.put(color, circle);
			System.out.println("create new Circle to pool of color:" + color);
		}
		return circle;
	}

	public static int getPoolSize() {
		return pool.size();
	}

}
