// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;

public class PerimeterTriangle {

	{
Scanner input = new Scanner(System.in);
//get user input
System.out.println("Enter the first side" + "\n");
double s1 = input.nextDouble();
System.out.println("Enter the second side" + "\n");
double s2 = input.nextDouble();
System.out.println("Enter the third side" +"\n");
double s3 = input.nextDouble();
//get 2 sides added together for each
double sum1 = s1 + s2;
double sum2 = s1 + s3;
double sum3 = s2 + s3;
//the sides added together are bigger than the third side
if(s1 < sum3 && s2 < sum2 && s3 < sum1)
	{System.out.println("This is a valad triangle");
System.out.println("The Perimiter: " + (s1+s2+s2));
	}
else//the sides added together are smaller than the third side
System.out.println("Is not a valid triangle");

	}

}
