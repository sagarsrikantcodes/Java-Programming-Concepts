import java.util.Scanner;
import javafx.geometry.Point2D;

public class TestPoint2D{
	public static void main(String[] args) {
		// User Inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point1's x-, y- coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter point2's x-, y- coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1, y1);
		// Return the string representation of point p1 
		System.out.println("p1 is " + p1.toString());
		
		Point2D p2 = new Point2D(x2, y2);
		// Return the string representation of point p2 
		System.out.println("p2 is " + p2.toString());	
		
		// Compute the distance between the points p1 and p2 
		double distanceBetweenPoints = p1.distance(p2);
		System.out.println("The distance between p1 and p2 is " + distanceBetweenPoints);
		
		// Compute the midpoint by invoking a method midpoint 
		System.out.println("The midpoint between p1 and p2 is ");
		System.out.println(p1.midpoint(p2));
			
	}
}

