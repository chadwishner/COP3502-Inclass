import java.util.Scanner;
public class ConvertingTemperatures {
	public static void main(String [] args) {
		Scanner fahrenheit = new Scanner(System.in);
		System.out.println("Please Enter a temperature in Fahrenheit");
		System.out.println("That is " + (fahrenheit.nextDouble()-32)*(5.0/9) + " degrees Celsius.");
	}
}