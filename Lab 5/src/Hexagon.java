// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 5
import java.util.*;

public class Hexagon {
public static void main(String args[]){
//Scanner
	Scanner input = new Scanner(System.in);
	//prompt user for radius and take input
System.out.print("Enter The Radius: ");
double r = input.nextDouble();	
//to figure out side ammount
double	s =(2*r)*(Math.sin(Math.PI/6));
	//to figure out the area
	double area = (6*Math.pow(s, 2)/(4*Math.tan(Math.PI/6)));
	//to round the answer to two decimals
double rounded = (double) Math.round(area *100)/100;
//out put the rounded answer and labale
System.out.println("The area is " + rounded);
}
}
