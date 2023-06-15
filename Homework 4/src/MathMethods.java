// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 4
import java.util.*;

public class MathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// promt user to imput a negative numbe
		System.out.println("Enter a negative number");
		int neg = input.nextInt();
		// Get the absolute of the input
		int negabs = Math.abs(neg);
		// output the absolute
		System.out.println("The Absolute Value of " + neg + " is " + negabs);

		// Prompt the yuser to enter an angle
		System.out.println("Enter a Floating-Point Number for the Angle");
		double flo = input.nextDouble();
		// to get the cos,sin,and tan in radians then switch it to degrees
		double cos = Math.cos(flo);
		double sin = Math.sin(flo);
		double tan = Math.tan(flo);
		double degreecos = Math.toDegrees(cos);
		double degreesin = Math.toDegrees(sin);
		double degreetan = Math.toDegrees(tan);
		// out put the sin,cos, and tan of the input in degrees
		System.out.println("The Sine of " + flo + " is " + degreesin);
		System.out.println("The Cosine of " + flo + " is " + degreecos);
		System.out.println("The Tangent of " + flo + " is " + degreetan);

		// Prompt the user for a Floating point number
		System.out.println("Enter a Floating-Point Number");
		double house = input.nextDouble();
		// the ceiling of the float number
		double cealing = Math.ceil(house);
		// the floor of the float number
		double floors = Math.floor(house);
		// output the floor and ceiling of the input
		System.out.println("The floor of " + house + " is " + floors);
		System.out.println("The Ceiling value of " + house + " is " + cealing);

		// prompt the user for x
		System.out.println("Enter x or the Base Number(Floating-Point Number)");
		double x = input.nextDouble();
		// prompt the user for y
		System.out.println("Enter Y or the Power (Floating-Point Number)");
		Double y = input.nextDouble();
		// defining power as the x to the power of y
		Double power = Math.pow(x, y);
		// output x to the power of y
		System.out.println(x + " Raised by the power of " + y + " is " + power);

		// prompt the user for an int
		System.out.println("Enter a Whole Number");
		int unsqr = input.nextInt();
		// get the square root with respect to numbers without a square root
		double sqr = (double) Math.sqrt(unsqr);
		// output the square root of the input
		System.out.println("The Square root of " + unsqr + " is " + sqr);
	}

}
