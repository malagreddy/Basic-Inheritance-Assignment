//Main class to call the draw function 
public class MainShape {
	public static void main(String[] args) {
		Shape shape[] = new Shape[3];
		// store child objects into an array
		shape[0] = new Triangle();
		shape[1] = new Polygon();
		shape[2] = new Circle();

		shape[0].draw();
		shape[1].draw();
		shape[2].draw();
	}

}
