package Lab2;
class Circle {
	private double radius;
	private String color="red";
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea()
	{
		return (22.0/7.0)*radius*radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
}
public class ques1 {

	public static void main(String[] args) {
			Circle circle=new Circle(5);
			System.out.println("The Radius of circle is : "+circle.getRadius());
			System.out.println("The Area of Circle is : "+circle.getArea());
			System.out.println("The Color of Circle is : "+circle.getColor());
	}

}
