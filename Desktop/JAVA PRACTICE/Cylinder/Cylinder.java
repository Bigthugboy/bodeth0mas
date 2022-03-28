import java.util.Scanner;

public class Cylinder{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius and length of a cylinder: ");
	double radius = input.nextDouble();
	double length = input.nextDouble();

	double area = radius * radius * Math.PI;
	double volume = area * length;

	System.out.printf("The area is %f%n", area);
	System.out.printf("The volume is %f%n", volume);
}
}  