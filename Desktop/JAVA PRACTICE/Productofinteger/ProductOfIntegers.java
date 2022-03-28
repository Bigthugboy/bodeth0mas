// This is a program to calculate the product of three integers

import java.util.Scanner;

public class ProductOfIntegers{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in); //Obtains input from the user
	
	System.out.print("Enter the first integer: ");
	int x = input.nextInt(); // This reads the first integer

	System.out.print("Enter the second integer: ");
	int y = input.nextInt();

	System.out.print("Enter the third integer: ");
	int z = input.nextInt();

	int result = x * y * z;

	System.out.printf("Product is %d%n", result);
}
}	 