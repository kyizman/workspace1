
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 8

import java.util.*;

//to gget the ammount of hours that employes work
public class WeeklyHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt the user for the ammount of employes they have and take input
		System.out.println("How Many Employees are Employed for you?");
		int employeenumber = input.nextInt();

		// delair the arrays hourchar,totalhours,compair,andemploye
		double[][] hourchart = new double[employeenumber][7];
		double[] totalhours = new double[employeenumber];
		double[] compair = new double[employeenumber];
		int[] employe = new int[employeenumber];
		for (int i = 0; i < employeenumber; i++) {
			// prompt the user to input the employes hours statrting from sunday
			System.out.println("Enter the Hours Worked Each day by employee " + i + " Starting With Sunday");
			// loop to inout the answers into the array
			for (int x = 0; x < 7; x++)
				hourchart[i][x] = input.nextDouble();

		}
		// loop th add the hours together for each employe
		for (int y = 0; y < employeenumber; y++) {
			double add = 0;
			for (int z = 0; z < 7; z++) {
				add = add + hourchart[y][z];
				totalhours[y] = add;
				// create an identical array to compair to after sorting the
				// origanal array
				compair[y] = add;
			}
		}
		// sort the original array
		Arrays.sort(totalhours);
		// put the employees in decending order
		for (int q = employeenumber - 1; q > 0; q--) {
			for (int w = 0; w < employeenumber; w++) {
				if (compair[q] == totalhours[w]) {
					employe[q] = w;
				}
			}
		}
		// ooutput the lable for the employees and the hours they worked
		System.out.println("|Employee| \t" + " |Hours Worked|");
		System.out.println("___________________________________");
		// output the employe and hours
		for (int v = employeenumber - 1; v >= 0; v--)
			System.out.println(employe[v] + "\t\t" + totalhours[v]);

	}
}
