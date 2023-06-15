// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 9
import java.util.*;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new scanner
		Scanner input = new Scanner(System.in);
		// cast list as an int and set it to 5 length
		int[] list = new int[5];
		// loop to get the numbers in the array
		for (int i = 0; i < 5; i++) {
			// get random number
			int number = (int) (1 + Math.random() * 1000);
			// set the random number to a specific spot in the array
			list[i] = number;
		}
		// output original array an lable
		System.out.println("Original array ");
		System.out.println(Arrays.toString(list));
		// output max and lable
		System.out.println("Max : " + arrayMax(list));
		// output min and lable
		System.out.println("Min : " + arraymin(list));
		// output the reversed list and lable
		System.out.println("The List Reversed");
		arrayReverse(list);
		// output the list squared
		System.out.println("The List Squared ");
		arraySquare(list);

	}

	// get the max
	public static int arrayMax(int[] arr) {
		// set max to the first grade
		int max = arr[0];
		// loop to get max grade
		for (int i = 1; i < arr.length; i++) {// adapted from the slides
												// change max if that number in
												// the array is bigger than the
												// first one and so on
			if (arr[i] > max)
				// set max grade to new greater number
				max = arr[i];
			// output the max grade
		}
		return max;

	}

	public static int arraymin(int[] arr) {
		// set min to the first grade
		int min = arr[0];
		// loop to get min grade
		for (int i = 1; i < arr.length; i++) {// adapted from the slides
												// change min if that number in
												// the array is bigger than the
												// first one and so on
			if (arr[i] < min)
				// set min grade to new greater number
				min = arr[i];
			// output the min grade

		}
		// output the minimum
		return min;
	}

	// square the list
	public static void arraySquare(int[] arr) {
		// loop for all array numbers
		for (int i = 0; i < arr.length; i++) {
			// sqare a number in a certin spot of the array
			arr[i] = (int) Math.pow(arr[i], 2);

		}
		// output
		System.out.println(Arrays.toString(arr));
		return;

	}

	public static void arrayReverse(int[] arr) {
		// set count to 0
		int count = 0;
		// loop to loop the ammount of numbers entered
		for (int i = arr.length - 1; i > 0; i--) {
			// cahnge positions of numbers in the array
			arr[count] = arr[i];
			count++;

		}
		// output the reversed string
		System.out.println(Arrays.toString(arr));
		return;
	}
}
