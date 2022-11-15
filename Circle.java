package jaw371_lab9_;

public class Circle{
		double radius;
		String color;

public Circle(){

	radius=5.0;
	color="Green";
}

public Circle(double radius) {

	this.radius = radius;
}

public Circle(double radius, String color) {
	this.radius = radius;
	this.color = color;
/**
 * 	}
 * @return the radius of the circle
 */
public double getRadius() {
return radius;
}
/**
 * 
 * @return the color of the circle
 */
public String getColor() {
	return color;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public void setColor(String color) {
this.color = color;
}

public double getArea(){
	double area= 3.14* radius*radius;
	return area;
	}
}

