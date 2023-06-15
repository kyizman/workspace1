// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 1
import java.util.Scanner;

public class Lab_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//scanner

System.out.println("Enter Pennies" );
//prompt user for ammount of coins and assigning variables 
	int Pennies = input.nextInt();
	
	System.out.println("Enter Nickles");
	//prompt user for nickles
	int Nickles = input.nextInt(); 
	// set next input as nickles
	System.out.println("Enter Dimes");
	//prompt user for dimes
	int Dimes = input.nextInt(); 
	//next input is dimes
	System.out.println("Enter Quaters");
	//prompt for quarters
	int Quarters = input.nextInt();
	//next input = quarters
	 int P = Pennies;
	 int N = Nickles;
	 int D = Dimes;
	 int Q = Quarters;
	 //Changing the value name for clenlyness
	int Answer = ((P + (N * 5) + (D * 10) + (Q * 25)));
	// the math to get the whole thing
	int total =(Answer/100);
	//to get thedollars
	int remainder = (Answer % 100);
// to get the cents
	System.out.println("Total =" + total + " Dollars and " + remainder + " Cents");
	
	
			 
	
		
	}
	


}
