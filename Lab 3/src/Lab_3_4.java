// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;

public class Lab_3_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//prompt user for x 
System.out.println("Please enter the x value");
//declair x as next double
double x = input.nextDouble(); 
// promt user for y value
System.out.println("Please enter the y value");
//declair y as next double
double y = input.nextDouble();
// origin
if(x == 0 && y == 0)
	System.out.println("(" + x +"," + y + ")" + " is the origin");
//on the x axis
else if (x > 0 && y == 0)
	System.out.println("(" + x +"," + y + ")" + " is on the x-axis");
// on the y axis
else if (x == 0  && y > 0)
	System.out.println("(" + x +"," + y + ")" + " is on the y-axis");
// in the first quadret
else if ( x > 0 && y> 0)
	System.out.println("(" + x +"," + y + ")" + " is in the first quadrent");
// in the second quadrent
else if ( x < 0 && y > 0)
	System.out.println("(" + x +"," + y + ")" + " is in the second quadrent");
// in the third quadrent
else if ( x < 0 && y < 0 )
	System.out.println("(" + x +"," + y + ")" + " is in the third quadrent");
// in the fourth quadrent
else if ( x > 0 && y <0)
	System.out.println("(" + x +"," + y + ")" + " is in the forth quadrent");
	
	


	}

}
