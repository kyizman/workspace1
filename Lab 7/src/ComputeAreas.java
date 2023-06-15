// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 7


//to get the area of shapes using methods
import java.util.Scanner;
public class ComputeAreas {
public static void main(String[] args){
	//set verable cont to false
boolean cont = false;
//new scanner
Scanner input = new Scanner(System.in);
//do while loop for user re loop
do{
	//promt user for the side of a square and take input
System.out.println("Enter side for a square");
double s = input.nextDouble();
//Get the highth and width of a rectangle and take input
System.out.println("Enter the highth of Your Rectangle");
double lengthr = input.nextDouble();
System.out.println("Enter the Width of Your Rectangle");
double widthr = input.nextDouble();
//get the radius of a circle from the user and prompt
System.out.println("Enter the Radius of Your circle");
double radius = input.nextDouble();
//get the highth and base of the users triangle 
System.out.println("Enter the Hight of Your Triangle");
double height = input.nextDouble();
System.out.println("Enter the Base of Your triangle");
double base =input.nextDouble();
//use method square area
double sqa=squareArea(s);
//use method rectanglearea
double ra = rectanglearea(widthr,lengthr);
//use method circlearea
double ca = circlearea(radius);
//use method trianleArea
double ta = triangleArea (base,height);
//output the side of the square that was input
System.out.println(" Square Side = " + s);
//output the area of a square
System.out.println(" Square Area = " + sqa);
//output the width of a rectagle
System.out.println(" Rectangle Width = " + widthr);
//output rectangle length
System.out.println(" Rectangle Length = " + lengthr);
// output rectangle area
System.out.println(" Rectangle Area = " + ra);
//output the input radius
System.out.println(" Circle Radius = " + radius);
//output the area of a circle and round to 3 decimals
System.out.println(" Circle Area = " + Math.round(ca *1000d)/1000d);
//output the inputed base
System.out.println("Triangle Base = " + base);
//output the input height
System.out.println(" Triangle Height = " + height);
//output the area of a triangle
System.out.println("Triangle Area = " + ta);
//prompt the user if they whant to re run the program
System.out.println("Would you Like to run the Program Again? (yes/no)");
//get the user input for rerun
String answer = input.next();
//if the user whants to redo the porgram
if(answer.equalsIgnoreCase("yes"))
	cont = true;
			//if not end
else
{
	cont = false;
	System.out.println("Have A Great Day.");
}


}while(cont);{ 
}
}
//get the area of a square
public static double squareArea(double s){
 //multiply the side by a side
double	area = s*s;
//return the area of a square
return area;

}
//get the area of a rectangle
public static double rectanglearea(double w,double l){
//multiply the length by the width
double	area = w *l;
//return the area of a rectangle
	return area;
}


//get the area of a circle
public static double circlearea(double r){
	//multiply the radius squared by pie
	double CircleArea = Math.PI *Math.pow(r, 2);
    //return the area of a circle
	return CircleArea;
}



//get the area of a triangle
public static double triangleArea (double b, double h){
	// multiply the base times hight times one half
	double areat = .5 *(h *b);
	//output the area
	return areat;
}
}
