// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 9
import java.util.Scanner;

public class Assininggrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declair the array grades as a double
		double[] grades;
		// declair studentgrades as a double
		double studentgrades;
		// declair cont as false
		boolean cont = false;
		// new scanner
		Scanner input = new Scanner(System.in);
		// start of do while
		do {
			// promt the user for the ammount of students being graded
			System.out.print("Enter the Number of Students : ");
			// set students to the input
			int students = input.nextInt();
			// set the length of array grades as the input
			grades = new double[students];
			// loop to output
			for (int e = 0; e <= students - 1; e++) {
				// prompt the user for for the grades of the students
				System.out.print("Enter grade" + (e + 1) + ": ");
				// set students grades to the input
				studentgrades = input.nextDouble();
				// array setting the grades one by one in the array
				grades[e] = studentgrades;
			}
			// set max to the first grade
			double max = grades[0];
			// loop to get max grade
			for (int i = 1; i < grades.length; i++) {// adapted from the slides
														// change max if that
														// number in the array
														// is bigger than the
														// first one and so on
				if (grades[i] > max)
					// set max grade to new greater number
					max = grades[i];
				// output the max grade
				System.out.println("The Highest Grade is a " + max);
				// test all numbers in the array
				for (int s = 0; s < grades.length; s++)
					// if the grade is an a
					if (grades[s] >= max - 10) {
						// out put that the grade is an a
						System.out.println("Student " + (s + 1) + " Score is " + grades[s] + " is A");
					} // if the grade is an b output b
					else if (grades[s] < max - 10 && grades[s] >= max - 20) {
						System.out.println("Student " + (s + 1) + " Score is " + grades[s] + " is B");
					} // if the grade is a c output c
					else if (grades[s] < max - 20 && grades[s] >= max - 30) {
						System.out.println("Student " + (s + 1) + " Score is " + grades[s] + " is C");
					} // if the grade is a d output d
					else if (grades[s] < max - 30 && grades[s] >= max - 40) {
						System.out.println("Student " + (s + 1) + " Score is " + grades[s] + " is D");
					} else// else it is an f
					{
						System.out.println("Student " + (s + 1) + " Score is " + grades[s] + " is f");
					}

			}
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
}