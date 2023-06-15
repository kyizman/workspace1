// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 11
import java.util.Scanner;
public class SumArraysColums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);	
//set cont to false
boolean cont = false;	
do{	
		
	//prompt the user to input  numbers for the matrix and take there inputs	
		System.out.println("Enter a 3 by 4 matrix one row at a time.");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		double n5 = input.nextDouble();
		double n6 = input.nextDouble();
		double n7 = input.nextDouble();
		double n8 = input.nextDouble();
		double n9 = input.nextDouble();
		double n10 = input.nextDouble();
		double n11 = input.nextDouble();
		double n12 = input.nextDouble();
		//set the inputs to array add
	double[][]	add = {
			{n1,n2,n3,n4},
			{n5,n6,n7,n8},
			{n9,n10,n11,n12}
	};	
	{
		//loop to output the added number of the column and the lable
	for(int i = 0; i < 3 ;i++ )
			System.out.println("The sum of column " + i + " " + sumColumn(add, i));
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

} while(cont);// resets do wile
}	

public static double sumColumn(double[][] m, int columnIndex)
{
	//set sum to 0
double sum =0;
	
	//loop to add the colom together
	for(int i = 0; i<4 ;i++)
	
	  sum = sum+ m[columnIndex][i];
	//return the added answer
	return sum;
}
	

}
