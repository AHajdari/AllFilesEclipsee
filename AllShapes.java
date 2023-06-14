import java.util.ArrayList;
import java.util.List;

public class AllShapes{
	private List <Shape> shapes;

	public AllShapes() {
		shapes = new ArrayList<Shape>();
	}
	
	public void addShape(Shape shape) throws CannotAcceptShapeException {
		if(shapes.size() == 50) throw new CannotAcceptShapeException("Cannot accept more shapes");
		shapes.add(shape);
	}
	
	
	public void removeShape(Shape shape) throws NotContainedException {
		if(!shapes.contains(shape)) throw new NotContainedException("Shape does not exist!");
			shapes.remove(shape);
	}
	
	public void printAllAreas() {
		for(Shape s : shapes) {
			System.out.println(s.getArea());
		}
	}
	
}