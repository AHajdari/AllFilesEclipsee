
public class Rectanglee implements Shape{
	
	private int width;
	private int height;
	

	
	public Rectanglee(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width > 0) {
			this.width = width;
		}
		else {
			this.width = 1;;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height > 0) {
			this.height = height;
		}
		else {
			this.height = 1;
		}
		
	}
	
	public double getArea() {
		return width * height;
	}
	
	
	

}
