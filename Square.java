public class Square extends Rectangle {
	private float x;
	private int radius;
	public Square(Double side) {		
		super(side,side);	
	}
	@Override
	public String toString(){
		String retorno="A Square with side = " + Double.toString(this.length) + ", which  is a subclass of "+super.toString();
		return retorno;		
	}
	@Override
	public Double getArea() {
		return this.length*this.length;
	}
	@Override
	public Double getPerimeter() {
		return 2*(this.length+this.length);
	}
	@Override
	public void setWidth(Double value) {
		this.width = value;
		this.length = value;
	}
	@Override
	public void setLength(Double value) {
		this.width = value;
		this.length = value;
	}
}
