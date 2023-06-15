// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;

public class Lab_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
// prompt for the minutes
System.out.println("Enter How Long Your Call Was In Minutes");
// declair x as a double
double x = input.nextDouble();
		// x lss than or equal to 3 
		if( x<=3)
		System.out.println("Call duration: 3 Minutes" + "\n" + "Your call will be $3.99");
		// if you time is greater than 3 muinets
		else if ( x > 3);
		
		double rate =( 3.99 +(x-3)*.45);
		//out put there time and fee
		System.out.println("Call duration: " + x + " Minutes" + "\n");
		System.out.println("Your call will cost : $" + rate );
		
		
			
		
			
	
}
}