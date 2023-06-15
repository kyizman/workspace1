import java.util.*;

public class IdenticalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// declair the firstarray and secondarray as ints
		int[] firstarray;
		int[] secondarray;
		// declair cont as false
		boolean cont = false;
		// start the do while to allow the user to redo the program
		do {
			// prompt the user to put the ammount of numbers they are going to
			// input
			System.out.println("How many Numbers are you Compairing per List?");
			// take user inut and declair it as first size
			int firstsize = input.nextInt();
			// set the size of the arrays as the users input
			firstarray = new int[firstsize];
			secondarray = new int[firstsize];
			// prompt the user to put the numbers for the first list
			System.out.println("Enter the " + firstsize + " Numbers for the First List");
			// use the loop to get each number in the diffrent cells of the
			// array
			for (int i = 0; i < firstsize; i++) {
				// prompt the user to input a number
				System.out.print("Enter a Number: ");
				// take input
				int firstentered = input.nextInt();

				// set the input as a spacific cell of the array starting with 0
				firstarray[i] = firstentered;
			}
			// prompt the user to enter a certain amount of inputs
			System.out.println("Enter the " + firstsize + " Numbers for the Second List");
			// loop to take the input and put it into a diffrent cell of the
			// array
			for (int x = 0; x < firstsize; x++) {
				// prompt the user to enter a number
				System.out.print("Enter a number: ");
				//// take input and declair second enter
				int secondentered = input.nextInt();
				// set the cell at x in the loop to the entered ammount
				secondarray[x] = secondentered;
			}
			// return a true or false if the lists are the same
			boolean samenumbers = equals(firstarray, secondarray);
			// loop to out put the cells in the array from 0
			for (int i = 0; i < firstsize; i++) {
				// out put the numbers in order with a line after
				System.out.print(firstarray[i] + " | ");

			}
			// printout a space to put the next print statement under this one
			System.out.println("");
			// loop to get the numbers in array two in the order they where
			// input
			for (int x = 0; x < firstsize; x++)
			{
				// to print out the inputs in order as they where entered
				System.out.print(secondarray[x] + " | ");
			}
			// to put the answer to if it is identical or not on the line after
			// the inputs
			System.out.println("");
			// if the method returns true
			if (samenumbers == true) {
				// output that they are identical
				System.out.println("The Two Lists are Identical.");
			} else {
				// output that the numbers are not identical
				System.out.println("The two Lists are not Identical.");
			}
			// prompt the users if they would like to re run the program
			System.out.println("Would you Like to Run the Program Again? (yes/no)");
			// set input to rerun
			String rerun = input.next();
			// ifthey type yes make cont true
			if (rerun.equalsIgnoreCase("yes"))
				cont = true;
			// if they type no cont will equal false
			else {

				cont = false;
				// sout have a good day
				System.out.println("Have a Good Day!");
			}
			// to reset if cont = true
		} while (cont);
	}

	// to check if the lists are equal
	public static boolean equals(int[] list1, int[] list2) {
		// set trufals = false
		boolean trufals = false;
		// loop for each spot in both arrays
		for (int i = 0; i < list1.length; i++)
			// check if they are equal
			if (list1[i] == list2[i]) {
				// if they are equal make truefals true
				trufals = true;
			}

			else {
				// if trufals is false if they arnt equal
				trufals = false;

				break;
			}
		// return the true or false
		return trufals;
	}
}
