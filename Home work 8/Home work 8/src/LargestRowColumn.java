// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 8

import java.util.*;

public class LargestRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean cont = false;
		do {

			Scanner input = new Scanner(System.in);
			// set the dimentions of the array to 4 by 4
			int[][] search = new int[4][4];
			// two for loops to allow for random ammount of onens and zeros
			// to get the y cordanates
			for (int i = 0; i < 4; i++) {// for the x cordanates
				for (int x = 0; x < 4; x++) {
					// to put random 1 or 0 in the space at that time
					search[i][x] = (int) (Math.random() * 2);
				}

				// to output the orginal array
				for (int b = 0; b < 4; b++) {
					System.out.println(Arrays.toString(search[b]));
				}
				// output the biggest row with lable
				System.out.println("The Max Row is Row " + Maxrow(search));
				// output the biggest collumn with lable
				System.out.println("The Max Coulumn is Coulumn " + MaxColom(search));
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

	// to get the max row
	public static int Maxrow(int[][] x) {
		// to declair array added,the intager add, and the maxcordanate
		int[] added = new int[x.length];
		int add = 0;
		int maxcord = 0;
		// loop for the y cordanate
		for (int i = 0; i < x[0].length; i++) {// set add to 0 reset
			add = 0;
			// loop for the x cordanate
			for (int y = 0; y < x.length; y++) {// ading all of the numbers in
												// the row then puting it into a
												// spot on the array
				{
					add = add + x[i][y];
					added[i] = add;
				}
				// setting max to the first number in the array
				int max = added[0];

				// loop to check all the numbers in the array against max for
				// the biggest number
				for (int p = 0; p < x.length; p++)
					if (added[p] > max) {
						max = added[p];
						maxcord = p;
					}
			}

		}
		// return maxcord to the program
		return maxcord;

	}

	// to get the max coloumn
	public static int MaxColom(int[][] y) {
		// set array added add and maxcord to int
		int[] added = new int[y.length];
		int add = 0;
		int maxcord = 0;
		// loop for the y value
		for (int i = 0; i < y[0].length; i++) {// reset add
			add = 0;
			// loop for the x value
			for (int z = 0; z < y.length; z++) {// add all the numbers in the
												// colounm
				{
					add = add + y[z][i];
					// put the numbers into an array
					added[i] = add;
				}
				// set max to the first value in the array
				int max = added[0];
				// a loop to check the numbers agains the max to check for the
				// biggest number
				for (int p = 0; p < y.length; p++)
					if (added[p] > max) {
						max = added[p];
						maxcord = p;
					}
			}

		}
		// return the buiggest number
		return maxcord;
	}

}
