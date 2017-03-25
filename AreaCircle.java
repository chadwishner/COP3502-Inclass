import java.util.Scanner;
public class AreaCircle {
	public static void main (String [] args) {
		Scanner radius = new Scanner(System.in);
		System.out.println("Please the radius of a circle.");
		System.out.println("The area of the circle is " + Math.PI*(Math.pow(radius.nextDouble(), 2)));
	}
}