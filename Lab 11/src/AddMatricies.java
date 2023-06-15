
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 11

import java.util.Arrays;
import java.util.Scanner;

public class AddMatricies {
	// add corisponding cells in two metrix

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// set cont to false
		boolean cont = false;
		do {
			// prompt the user for the length of the matrics and take input
			System.out.println("Enter the Length of the Matrics");

			int length = input.nextInt();
			// prompt the user for the Heighth of the matric and take there
			// input
			System.out.println("Enter the Highth of the Matrics");

			int height = input.nextInt();

			// create the first array and set the specifications to the users
			// input
			double[][] add = new double[length][height];
			// creat the seccond array and set the specifications to the users
			// input
			double[][] add2 = new double[length][height];
			// prompt the user to input the numbers for the first matrix
			System.out.println("Enter your Numbers for the First Matrix");
			// loop to take in all the numbers entered for the first matrix
			for (int i = 0; i < height; i++) {
				for (int x = 0; x < length; x++) {
					add[i][x] = input.nextDouble();
				}
			}
			// prompt the user for the numbers in the second matrix
			System.out.println("Enter your Numbers for the Second Matrix");
			// loop to take in the numbers for the matrix
			for (int i = 0; i < height; i++) {
				for (int x = 0; x < length; x++) {
					add2[i][x] = input.nextDouble();
				}
			}

			{
				// to put the added numbers into a matrix
				double[][] added = addMatrix(add, add2);
				for (int x = 0; x < height; x++) {
					// print out all lines and the added lines
					System.out.println(Arrays.toString(add[x]) + " + " + Arrays.toString(add2[x]) + " = "
							+ Arrays.toString(added[x]));

				}
			}

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

	public static double[][] addMatrix(double[][] a, double[][] b) {
		// declair length and height
		int length = a.length;
		int height = a[0].length;
		// creat new array to the size of the other two
		double[][] added = new double[height][length];
		// loop to add the numbers in each corisponding cell together
		for (int i = 0; i < height; i++) {
			for (int x = 0; x < a.length; x++) {
				added[i][x] = a[i][x] + b[i][x];
			}

		}
		// return the added numbers
		return added;
	}
}
