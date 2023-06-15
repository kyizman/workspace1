// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 4
import java.util.Scanner;
public class Lab_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

//user input
System.out.println("Enter two integers");
double n1 = input.nextDouble();
double n2 = input.nextDouble();
//state if an invalid number is used
if (n1 <1 || n1>5 || n2<1 || n2 >5)
	{System.out.println("Invalid Input");

	}
// To get the users input
else 
System.out.println("To perfom addition of the two numbers Enter 1");
System.out.println("To perform subtraction of the two numbers (number1 - number2) Enter 2");
System.out.println("To preform multiplication of the two numbers (number1*number2) Enter 3");
System.out.println("To perform division of the two numbers (number1/number2) Enter 4 ");
System.out.println("To perform remainder of the two numbers (number1%number2) Enter 5");
int enter = input.nextInt();
	// Perform the selected math
switch (enter){

case 1:System.out.println("The sum of " + n1 +" and " + n2 +" is "+ (n1+n2));
break;
case 2:System.out.println("The diffrence of " + n1 +" and " + n2 +" is " + (n1-n2));
break;
case 3:System.out.println("The product of " + n1 + " and " + n2 + " is " + (n1*n2));
break;
case 4:System.out.println("The quotient of " + n1 + " and " + n2 + " is "+ (double)(n1/n2));
break;
case 5:System.out.println("The remainder of " + n1 + " and " + n2 + " is " +(n1%n2));
break;

	}
	

}
}