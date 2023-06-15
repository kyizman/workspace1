// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 8

import java.util.*;

public class IdenticalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean cont = false;
		do {
			// to set the peramiters of the arrays as set by the assignement
			int[][] list1 = new int[3][3];
			int[][] list2 = new int[3][3];

			// promt the user for the numbers for array one
			System.out.println("Enter the Numbers for the First List (Nine numbers)");
			// loop to put the numbers into the array

			for (int i = 0; i < 3; i++) {
				for (int x = 0; x < 3; x++) {
					list1[i][x] = input.nextInt();
				}
			}
			// Prompt the user for the second list of numbers for the array
			System.out.println("Enter the Numbers for the Second List (Nine Numbers");
			// loop to put the answers into the array
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 3; z++) {
					list2[y][z] = input.nextInt();
				}
			}
			// to get a boolean tru/false if they are equal
			boolean trufals = equals(list1, list2);
			// if they are identical
			if (trufals) {// output that they are identical
				System.out.println("The Two Arrays are Strictly Identical");
			}

			else {
				// output that they arenot identical
				System.out.println("The Two Arrays are not Strictly Identical");
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

	public static boolean equals(int[][] m1, int[][] m2) {
		// set boolean same to true
		boolean same = true;
		for (int i = 0; i < m1[0].length; i++) {

			for (int x = 0; x < m1.length; x++)
				// if the arrays arenot equal make same false
				if (m1[i][x] != m2[i][x]) {
					same = false;
				}
				// else let it keep running
				else if (m1[i][x] == m2[i][x]) {

				}
		}
		// return true or false if it is same or not
		return same;
	}
}
