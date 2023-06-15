
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 8

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cont = false;
		do{
		Scanner input = new Scanner(System.in);
//creat new array sort
		double[][] sort = new double[3][3];
//prompt the user to enter the numbers for the matrix
		System.out.println("Enter the Numbers for the 3 by 3 Matrix");
		//to enter the numbers into the array
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++)

			{
				sort[i][x] = input.nextDouble();
			}

		}
		//to print out the original
		System.out.println("The Original");
		for (int y = 0; y < 3; y++) {
			System.out.println(Arrays.toString(sort[y]));
		}
		//the new array
		double[][] sorted = sortColumns(sort);
		//space
		System.out.println();
		System.out.println();
		//lable for the sorted array
		System.out.println("Sorted");
		for (int j = 0; j < 3; j++) {
////ouput the sorted array
			System.out.println(Arrays.toString(sorted[j]));
		}
	
		// prompt the users if they would like to re run the program
					System.out.println("Would you Like to Run the Program Again? (yes/no)");
					// take user input

					String rerun = input.next();
					// if they would like to re run the program changes cont to true
					if (rerun.equalsIgnoreCase("yes"))
						cont = true;

					// terminates program if no loop is needed
					else {
						cont = false;
						System.out.println(" Have A Great Day!");
					}

				} while (cont);// resets do wile
}
	public static double[][] sortColumns(double[][] m) {
		// willi helped me solve
														// this
		double[][] sorted = new double[m[0].length][m.length];

		// to put the first array into the second
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sorted[i][j] = m[i][j];
			}
		}

		for (int j = 0; j < sorted[0].length; j++) {

			for (int i = 0; i < sorted.length - 1; i++) {
				// too set current min
				double Min = sorted[i][j];
				int minIndex = i;
				// to get the min
				for (int row = i + 1; row < sorted.length; row++) {
					// if min i greater than the number it becomes the new min
					if (Min > sorted[row][j]) {
						Min = sorted[row][j];
						minIndex = row;
					}
				}

				if (minIndex != i) {
					sorted[minIndex][j] = sorted[i][j];
					sorted[i][j] = Min;
				}

			}
		}
		return sorted;
	}

}

