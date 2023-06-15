// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 4
import java.util.Scanner;

public class IntersectingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
// declair all variables needed
double x1;
double x2;
double x3;
double x4;
double y1;
double y2;
double y3;
double y4;
//get the input of each x and y value
System.out.println("Enter the first x then the first y .");
x1 = input.nextDouble();
y1 = input.nextDouble();

System.out.println("Enter the second x then the second y.");
x2 = input.nextDouble();
y2 = input.nextDouble();

System.out.println("Enter the third x then the third y.");
x3 = input.nextDouble();
y3 = input.nextDouble();

System.out.println("Enter the fourth x then the fourth y.");
x4 = input.nextDouble();
y4 = input.nextDouble();
//declaring variables for cramers rule
double a = (y1-y2);
double b = -(x1-x2);
double c = (y3-y4);
double d = -(x3-x4);
// finding e and f
double e = ((a) * x1) + (b)*y1 ;
double f = (c)*x3 +(d)*y3;
//finding x and y
double x = ((e*d)-(b*f)) / ((a*d) - (b*c));
double y = ((a*f)-(e*c)) / ((a*d)-(b*c));
//out put intersect point
System.out.println(" The lines intersect at " + Math.round(x * 100000.0) / 100000.0  +"," +  Math.round(y * 100000.0) / 100000.0);
double m1 =(y2-y1)/(x2-x1);
double m2 = (y4-y3)/(x4-x3);
if(m2 == m1){
	System.out.println(" The lines are parallel");
}
else
{		
	System.out.println(" The lines are not parallel");	

	}
	
	

	
}
}