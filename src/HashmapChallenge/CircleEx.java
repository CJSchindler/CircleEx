package HashmapChallenge;
//// Lauren and Arif

import java.util.ArrayList;

public class CircleEx {

	public static void main(String[] args) {
		Circle earth = new Circle(5, "blue");
		Circle mercury = new Circle(1, "yellow");
		Circle jupiter = new Circle (10, "Gray");
		Circle sun = new Circle (20, "Orange");
		
		ArrayList <Circle> planets = new ArrayList<>();
		planets.add(earth); 
		planets.add(mercury);
		planets.add(sun);
		planets.add(jupiter);
		
		double max = 0;
		for (int i = 0; i < planets.size(); i ++) {
			
				if (planets.get(i).getRadius() > max) {
					max = planets.get(i).getRadius();
					System.out.println(max);
				}
		}
		
		System.out.println("The largest circle has a radius of " + max);
	}	
}