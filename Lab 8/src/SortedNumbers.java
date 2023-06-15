// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 8
import java.util.Scanner;

public class SortedNumbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// dclair cont as false
		boolean cont = false;
		// start the do while
		do {
			Scanner input = new Scanner(System.in);
			// prompt the user for 5 numbers
			System.out.println("Enter five Numbers");
			// set the input as double
			double number1 = input.nextDouble();

			double number2 = input.nextDouble();

			double number3 = input.nextDouble();

			double number4 = input.nextDouble();

			double number5 = input.nextDouble();
			// output the method
			displaySortedNumbers(number1, number2, number3, number4, number5);

			// prompt the users if they would like to re run the program
			System.out.println("\nWould you Like to Run the Program Again? (yes/no)");
			// take user input
			String rerun = input.next();
			// if they would like to re run the program changes cont to true
			if (rerun.equalsIgnoreCase("yes"))
				cont = true;
			else// terminates program if no loop is needed
			{
				cont = false;
				System.out.println(" Thats all folks.");
			}

		} while (cont);// resets do wile
	}

	public static void displaySortedNumbers(double num1, double num2, double num3, double num4, double num5) {
		// declair the numbers ented as abcde
		double a = num1;
		double b = num2;
		double c = num3;
		double d = num4;
		double e = num5;
		double number;
		// to get the max of all five numbers
		double maxab = Math.max(a, b);
		double maxbc = Math.max(c, b);
		double maxed = Math.max(d, e);
		double maxae = Math.max(a, e);
		double maxbcae = Math.max(maxbc, maxae);
		double maxabed = Math.max(maxab, maxed);
		double firstnumber = Math.max(maxbcae, maxabed);
		// to loop the numbers untill i gets to there number then print out i
		// with a line and spaces
		for (double i = firstnumber; i >= 0; i--) {
			if (i == a || i == b || i == c || i == d || i == e) {
				System.out.print(i + " | ");
			
				
			

		
}
		}
	}
}