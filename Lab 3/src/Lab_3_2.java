// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Random;
import java.util.Scanner;

public class Lab_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// to get a new random generator
Random genorator = new Random();
// set the highest grade to 100		
final int perfect = 100;
		//declairing int x
	int x;
	//setting x to a rng
	x = genorator.nextInt(perfect);
	
	//if x is an a
	if (x >= 90)
		System.out.println("You got an A : "+ x);// if it is an a
	// if x is a b	
	else if (x >= 80 && x<= 90)
		System.out.println("You got a B : "+ x);
		else if (x >= 70 && x<=80)
			//if x is a c
	System.out.println(" You got a C : "+ x);
		else if (x>=60 && x<=70)
			//if x is a d
	System.out.println("You got a D : " + x);
	else if (x <=59)
// if you get an f
		System.out.println(" You got an F :" + x);
	
	}
}