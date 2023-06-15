// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 6

import java.util.Scanner;
public class Mytriangle {
public static void main(String[] args){
	//declair cont as false
	boolean cont = false;
	//new scanner
	Scanner input = new Scanner(System.in);
//start of do while loop
	do
{	
	//dclair area as 0
	double area = 0;
	//prompt for the first side of a trangle and take input
	System.out.println("Enter the first side of your triangle");
double	firsts = input.nextDouble();
//prompt for the second side of a triangle and take input
System.out.println("Enter the second side of your triangle");
double seconds = input.nextDouble();
// prompt for the user to enter a third side and take the input
System.out.println("Enter the third side of your triangle");
double thirds = input.nextDouble();
//declair that this use of the isvalid method is asighned to valid
boolean valid = isValid(firsts,seconds,thirds);

//if valid is true
if(valid == true)
{
	//to get the area of a triangle with another programs method and asighn it to area
	area = TestMyTriangle.area(firsts, seconds, thirds);
	//output a valid triangle
System.out.println("The area of the triangle is : " + area);
}
//if it is not a valid triangle
else
{
	//prompt the user to enter a new trianle
	System.out.println("please enter a valid ritangle");
continue;
}


//prompt the users if they would like to re run the program
System.out.println("Would you Like to Run the Program Again? (yes/no)");
//take user input

String answer = input.next();
//if they would like to re run the program changes cont to true
if(answer.equalsIgnoreCase("yes"))
	cont = true;

//terminates program if no loop is needed
else
{
	cont = false;
	System.out.println(" Thats all folks.");
}

}while(cont);// resets do wile 

}
		

/** Return true if the sum of any two sides is
* greater than the third side. */
public static boolean isValid( double side1, double side2, double side3){
//to add two sides together
double added = side1 +side2;
//if the added sides area bigger than the third
if(added > side3)
	return true;
//if the added sides are not buger than the third
else
	return false;
}
}
