public class Rectangle implements Shape {
	private int width;
	private int height;



	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getArea()=" + getArea() + "]";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width > 0) {
			this.width = width;
		}
		this.width = 1;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		}
		this.height = 1;
	}
	
	public double getArea() {
		return height * width;
	}
	
	

}