/*06 Write a program that takes radius of a circle as input. 
Read the entered radius using Scanner class.Then calculate and print the 
area and circumference of the circle.
*/
import java.util.*;
class Circle
{
private float area;
private float radius;
private float circumference;
	public void acceptRecord()
	{
		System.out.print("Enter the radius: ");
		Scanner sc= new Scanner(System.in);
	     radius=sc.nextFloat(); 	  
	}
	public void calculateArea()
	{
		area=(22*radius*radius)/7;
	}
	public void calculateCircumference()
	{
		circumference=(2*22*radius)/7;
	}
	public void printRecord()
	{
		System.out.println("Area of Circle is: "+area);
		System.out.println("Circumference of Circle is: "+circumference);
	
	}
}
public class AreaOfCircle {

public static void main(String[] args) {
		Circle c1= new Circle();
		c1.acceptRecord();
		c1.calculateArea();
		c1.calculateCircumference();
		c1.printRecord();
		
	}

}
