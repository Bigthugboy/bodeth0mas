 //Calculating the squares of two integers, including their squares and differences
import java.util.Scanner;

public class Test215{
	public static void main(String[] args){
	
	Scanner grab = new Scanner(System.in); //Obtains input from the user
	
	System.out.print("Enter the first integer: ");
	int firstInteger = grab.nextInt(); // This reads the first integer

	System.out.print("Enter the second integer: ");
	int secondInteger = grab.nextInt();

	int firstSquare = firstInteger * firstInteger;
	int secondSquare = secondInteger * secondInteger;

	System.out.printf("The square of your first and second integers are %d and %d%n", firstSquare, secondSquare);

	int squareSum = firstSquare + secondSquare;
	int squareDifference = firstSquare - secondSquare;

	System.out.printf("The sum of the squares is %d%n", squareSum);
	System.out.printf("The difference of the squares is %d%n", squareDifference);

}
}	 