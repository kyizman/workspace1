
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 1
import java.util.Scanner;

public class Lab_2_2 {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Input The first value:");
		// prompt user for first value
		double value1 = Input.nextDouble();
		//declair first imput value
		System.out.println("Input the second value");
		//promt user
		double value2 = Input.nextDouble();
		// declair second input value
		
		System.out.println("R Value =" + value1 + "\n" + "T value = " + value2 + "\n");
		// To get the value and lable the inital numbers
		
		System.out.println("Sum:" + (value1 + value2 + "\n" + "Product:" + value1 * value2 + "\n"));
		// To get the sum and product of the two values and lable
		
		System.out.println("Diffrence A-B:" + (value1 - value2) + "\n" + "Diffrence B-A:" + (value2 - value1) + "\n");
		// Lable and aquire the diffrence of both sets of values

	}

}