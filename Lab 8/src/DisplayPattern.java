// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 8
import java.util.Scanner;

public class DisplayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cont = false;
		do {
			// prompt user for input and take input
			Scanner input = new Scanner(System.in);
			System.out.println(" Enter a number");
			int num1 = input.nextInt();
			// to output the method
			displayPattern(num1);

			// prompt the users if they would like to re run the program
			System.out.println("Would you Like to Run the Program Again? (yes/no)");
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

	public static void displayPattern(int number) {
		// number of rows

		for (int i = 1; i <= number; i++) {
			// to print space
			for (int a = 1; a <= number - i; a++) {
				System.out.printf("%4s", "");
			}

			// to format the rows
			for (int b = i; b >= 1; b--) {
				System.out.printf("%4d", i);
			}
			System.out.println();
		}

	}
}