// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 1
import java.util.Scanner;

public class Lab_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println(" Enter v0, v1 and t");

double velocity1 = input.nextDouble();
//Starting Velocity
double velocity2 = input.nextDouble();
//Ending Velocity
double time = input.nextDouble();
// time

System.out.print( "Average Acceleration=" + ((velocity2 - velocity1) / time) + "M/s");
	}

}
