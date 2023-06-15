// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 5
import java.util.Scanner;
public class Pentigon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner
Scanner input = new Scanner(System.in);
//Prompt user for radius and format
System.out.println("Enter the radius" + "\n");
double r = input.nextDouble();

// For side
double s = (2 *r)* (Math.sin(Math.PI/5));
//area formula
double area = (5*Math.pow(s,2))/(4* (Math.tan(Math.PI/5)));
//round area
double rounded = (double) Math.round(area*100)/100;

//out put rounded area and statment
System.out.println(" The area of the pentagon is " + rounded);

	}

	}

