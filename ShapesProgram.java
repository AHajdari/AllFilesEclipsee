
public class ShapesProgram {

	public static void main(String[] args) throws NotContainedException, CannotAcceptShapeException {
		// TODO Auto-generated method stub
		
		AllShapes obj = new AllShapes();
		Rectangle rect = new Rectangle(23, 13);
		Rectangle rect2 = new Rectangle(3, 15);
		Circle circ = new Circle(29);
		obj.addShape(rect);
		obj.addShape(rect2);
		try {
		obj.removeShape(circ);
		} catch(Exception e) {System.out.println(e.getMessage());}
		System.out.println(rect);
		obj.printAllAreas();
	}
	
	

}
