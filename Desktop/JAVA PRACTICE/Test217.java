// This is a program to calculate the product of three integers

import java.util.Scanner;

public class Test217{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in); //Obtains input from the user
	
	System.out.print("Enter the first integer: ");
	int firstInteger = input.nextInt(); // This reads the first integer

	System.out.print("Enter the second integer: ");
	int secondInteger = input.nextInt();

	System.out.print("Enter the third integer: ");
	int thirdInteger = input.nextInt();

	int largest = firstInteger;

	if (secondInteger > firstInteger){
	largest = secondInteger;
}

	if (thirdInteger > secondInteger){
	largest = thirdInteger;
}

	System.out.printf("%d is the Largest of all numbers", largest);

}
}	 