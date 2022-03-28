import java.util.Scanner;

public class CelsiusConversion { 
	public static void main(String[] args){
	
	Scanner collect = new Scanner(System.in);

	System.out.print("Enter a degree in Celsius: ");
	int celsiusDegree = collect.nextInt();

	double fahrenheit = (9 / 5) * celsiusDegree + 32;

	System.out.printf(" %d Celsius is %.4f Fahrenheit", celsiusDegree, fahrenheit);
}
}  