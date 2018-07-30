package HashmapChallenge;
public class Circle {
	private double radius;
	private String color;
	
	// constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// another constructor
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	// getter
	public double getRadius() {
		return radius;
	}
	
	// setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// Instances can have methods (Behavior) as well as data  
	public double getArea() {
		// within instance methods, we can access instance variables
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	// A static method belongs to the class rather than the instances (objects)
	public static String getShape() {
		// System.out.println(radius); // <-- Would not work. Cannot use instance field in static method.
		return "Circle";
	}

	// toString determines what the objects will look like
	// when printed directly to the console.
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}