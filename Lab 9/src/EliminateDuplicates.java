// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 9
import java.util.*;

public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// declair cont as false
		boolean cont = false;

		// start of restarting do while
		do {
			// promt the user for 10 numbers
			System.out.println("Enter Ten Whole Numbers");
			// take the input in 10 diffrent variablse from n1-10
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			int n3 = input.nextInt();
			int n4 = input.nextInt();
			int n5 = input.nextInt();
			int n6 = input.nextInt();
			int n7 = input.nextInt();
			int n8 = input.nextInt();
			int n9 = input.nextInt();
			int n10 = input.nextInt();
			// put variables n1-10 in an array
			int[] numbers = { n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 };
			// output the original string
			System.out.println(Arrays.toString(numbers) + " Is the Original List.");
			// return the non duplicated numbers
			System.out.println(Arrays.toString(eliminateDuplicates(numbers)).replaceAll(" 0,", "")
					+ " are the Uneque Numbers in the List.");

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

	public static int[] eliminateDuplicates(int[] list) {// to declair array
															// uniquearray and
															// set the length to
															// the size of list
		int[] uniquearray = new int[list.length];
		// declair count to 0
		int count = 0;
		// put the array in order least to greatest
		Arrays.sort(list);
		// loop for each part of the array to be tested for doubles
		for (int i = 0; i < list.length - 1; i++)

		{
			// if the number is unique it will be saved in another array
			if (list[i] != list[i + 1]) { // take unique number
				uniquearray[count] = list[i];
				// make count go up by one each time
				count++;
			}
			// else nothing happens
			else {
			}

		}
		// to output the last number
		if (uniquearray[9] == 0)
			uniquearray[9] = list[9];

		// return the unique numbers
		return uniquearray;

	}
}

