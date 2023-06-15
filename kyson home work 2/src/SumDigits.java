// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// HW 2
import java.util.Scanner;
import java.lang.System;
public class SumDigits {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//prompt user
			System.out.print("Enter a number up to three digits ");
		//declair x as input
			int	x = input.nextInt();
		//to limit the number to 3 diggits max	
		if (x > 999) 
				System.out.println("The number you have entered is too big.");
			else{
		// to declair three 0 variables
			int y = 0;
			int z = 0;
			int q = 0;
			//get remainder
			y+=x%10;
			//get first two diggits
			
			x/=10;
			//get remainder
			z+=x%10;
//get first number
			x/=10;
			//get remainder
			q+=x%10;
			
			//add all of the remainders together
			
		System.out.println( " The sum of the digits is  " + (y+z+q));
			}
		}
		}
