ere// This is a program to compare Integers with value 100

import java.util.Scanner;

public class Test216{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in); //Obtains input from the user
	
	System.out.print("Enter any integer: ");
	int anyInteger = input.nextInt(); // This reads the first integer

	int inputSquare = anyInteger * anyInteger;
	int totalSum = anyInteger + inputSquare;

	int standard = 100;

	if (inputSquare > standard){
	System.out.printf("%d is greater than %d%n", totalSum, standard);
}

	if (totalSum == standard){
	System.out.printf("%d is equal to %d%n", totalSum, standard);
}

	if (totalSum != standard){
	System.out.printf("%d is not equal to %d%n", totalSum, standard);
}

	if (totalSum < standard){
	System.out.printf("%d is less than %d%n", totalSum, standard);
}

}
}	 