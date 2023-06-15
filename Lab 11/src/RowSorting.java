
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 11

import java.util.*;

public class RowSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// set cont to false
		boolean cont = false;
		do {
			// prompt user to enter the numbers for a 3x3 matrix
			System.out.println("Enter a 3 by 3 matrix one row at a time");
			// take input
			double n1 = input.nextDouble();
			double n2 = input.nextDouble();
			double n3 = input.nextDouble();
			double n4 = input.nextDouble();
			double n5 = input.nextDouble();
			double n6 = input.nextDouble();
			double n7 = input.nextDouble();
			double n8 = input.nextDouble();
			double n9 = input.nextDouble();

			// put the input into the array
			double[][] sort = { { n1, n2, n3 }, { n4, n5, n6 }, { n7, n8, n9 }, };
			// output the original and sorted matrix
			System.out.println("Original Array : " + Arrays.deepToString(sort));
			System.out.println("Sorted Array : " + Arrays.deepToString(sortRows(sort)));

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

	public static double[][] sortRows(double[][] m)

	{
		// declair the width height and count
		int width = m.length;
		int height = m[0].length;
		int count = 0;

		// put the numbers int individual variables
		double n1 = m[0][0];
		double n2 = m[0][1];
		double n3 = m[0][2];
		double n4 = m[1][0];
		double n5 = m[1][1];
		double n6 = m[1][2];
		double n7 = m[2][0];
		double n8 = m[2][1];
		double n9 = m[2][2];
		// put the variables into a new array
		double[] allnumbers = { n1, n2, n3, n4, n5, n6, n7, n8, n9 };
		// sort the array
		Arrays.sort(allnumbers);
		// put the numbers bac into the original matrix
		for (int i = 0; i < height; i++)

		{
			for (int x = 0; x < width; x++) {
				m[i][x] = allnumbers[count];
				count++;
			}

		}

		// return the matrix
		return m;

	}
}
