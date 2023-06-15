// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.println(" please enter your Annual Income");
double annualIncome = input.nextDouble();
//to check your number against each tax bracket and printing out witch one is yours
if (annualIncome <= 50000)
	System.out.println("Your Annual Income: $" + annualIncome +"\n" + "You are in the 5% tax bracket" );

else if (annualIncome > 50000 && annualIncome <= 100000)
	System.out.println("Your Annual Income: $" + annualIncome +"\n" + "You are in the 15% tax bracket" );
else if (annualIncome > 100000 && annualIncome<= 150000)
	System.out.println("Your Annual Income: $" + annualIncome +"\n" + "You are in the 20% tax bracket" );
else if (annualIncome >150000 && annualIncome<= 250000)	
	System.out.println("Your Annual Income: $" + annualIncome +"\n" + "You are in the 30% tax bracket" );
else if (annualIncome > 250000 && annualIncome < 500000)
	System.out.println("Your Annual Income: $" + annualIncome +"\n" + "You are in the 35% tax bracket" );
else if (annualIncome > 500000)
	System.out.println("Your Annual Income: $" + annualIncome +"\n" + "You are in the 50% tax bracket" );
	}

}
