public class Rectangle extends Shape{
	protected Double width,length;
	public Rectangle() {
		this.width=1.0;
		this.length=1.0;		
	}
	public Rectangle(Double width,Double length) {
		this.width=width;
		this.length=length;		
	}
	public Rectangle(Double width,Double length, String color, boolean filled) {
		this.width=width;
		this.length=length;		
		this.color=color;
		this.filled=filled;
	}
	
	@Override
	public String toString(){
		String retorno="A rectangle with width= "+ Double.toString(this.width)+ "  and length= "+Double.toString(this.length)+", which is a subclass of "+super.toString();
		return retorno;		
	}
	public Double getArea() {
		return this.width*this.length;
	}
	public Double getPerimeter() {
		return 2*(this.width+this.length);
	}
	public Double getWidth() {
		return this.width;
	}
	public void setWidth(Double value) {
		this.width = value;
	}
	public Double getLength() {
		return this.length;
	}
	public void setLength(Double value) {
		this.length = value;
	}
}
