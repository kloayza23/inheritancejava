public class Shape {
	protected String color="Red";
	protected boolean filled=true;
	public Shape() {
		this.color="green";
		this.filled=true;
	}
	public Shape(String color, boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	@Override
	public String toString(){
		String Sfilled="filled";
		if (this.filled){
			Sfilled="filled";
		}
		else{
			Sfilled="Not Filled";
		}
		String retorno="A Shape with color of " + this.color + " and "+Sfilled;
		return retorno;		
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled(){
		return this.filled;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
}
