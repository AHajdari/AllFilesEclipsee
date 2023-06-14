public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		super();
		setRadius(radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		this.radius = 1;
	}
	
	public double getArea() {
		return radius * Math.PI;
	}

}