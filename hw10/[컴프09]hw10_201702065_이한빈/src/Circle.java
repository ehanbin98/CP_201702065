public class Circle extends Shape {
	final double Pi = 3.141392;

	public int area() {
		return (int) (this.width * this.width * Pi);
	}
}