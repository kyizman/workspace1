// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please Enter a Number");

double x = input.nextDouble();
if (x == 0) 
	System.out.println(x +" Your Number is Zero");
//looks for your number is equal to zero
else if (x > 0)//looks for if your number is positve
	System.out.println(x + " Your number is Positive");
else if (x < 0)//looks to see if your number is negative
	System.out.println(x + " Your number is negative");

}

}
