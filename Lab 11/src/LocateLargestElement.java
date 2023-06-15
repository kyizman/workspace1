
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 11

import java.util.*;

public class LocateLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// set cont to false
		boolean cont = false;
		do {
			// prompt the user for the rows and coloms and take input
			System.out.println("Please Enter the number of rows then coloms");
			int width = input.nextInt();

			int height = input.nextInt();
			// creat the matrix
			double[][] list = new double[height][width];
			// prompt the user for the numbers for it
			System.out.println("Enter the Numbers in the Array");
			// put the numbers into the matrix
			for (int i = 0; i < height; i++) {
				for (int x = 0; x < width; x++) {
					list[i][x] = input.nextDouble();
				}
			}
			// output the largest with its lable
			System.out.println("The Largest Number is at " + Arrays.toString(locateLargest(list)));

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

	public static int[] locateLargest(double[][] a) {
		// set a new array for the largest numbers cordinates
		int[] largestcord = new int[2];

		// set max to the first number of the matrix
		double max = a[0][0];
		// set the specifications of the original matrix
		int height = a[0].length;
		int width = a.length;
		// loop to check the numbers agains the max
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (max < a[y][x])
				// set the numbers to max if they are bigger and there
				// cordinates
				{
					max = a[y][x];
					largestcord[0] = y;
					largestcord[1] = x;
				}
			}
		}

		return largestcord;
	}
}
