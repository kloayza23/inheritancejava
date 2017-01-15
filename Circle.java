public class Circle extends Shape {
	private Double radius=1.0;	
	public Circle(Double radius) {
		this.radius=radius;
	}
	public Circle() {
		this.radius=1.0;
	}
	public Circle(Double radius, String color, boolean filled) {
		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}
	@Override
	public String toString(){
		String retorno="A Circle with radius = " + Double.toString(this.radius) + ", which is a subclass of "+super.toString();
		return retorno;		
	}
	public Double getRadius() {
		return this.radius;
	}
	public void setRadius(Double value) {
		this.radius = value;
	}
}
