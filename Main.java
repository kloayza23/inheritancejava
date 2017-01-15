public class Main {	
	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape);
		Circle circle=new Circle();
		System.out.println(circle);
		Rectangle rectangle=new Rectangle();
		System.out.println(rectangle);
		Square square=new Square(3.0);
		System.out.println(square);
	}
}
