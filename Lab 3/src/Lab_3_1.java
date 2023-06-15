// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;
public class Lab_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your grades");
	
int grade1 = input.nextInt();
int grade2 = input.nextInt();
int grade3 = input.nextInt();
int grade4 = input.nextInt();
 int max = grade1;
 int min = grade1;

//to output the inputs and average
System.out.println("Your grades are " + grade1 + "  | " + grade2 +"  |  "  + grade3 +"  |  "  + grade4 + "\n");
System.out.println("The average of the grades is: "  +  ((grade1 + grade2 + grade3 + grade4)/4));

// highest grade is the first one and output
{if (grade1 >= grade2 && grade1>= grade3 && grade1>= grade4)
	System.out.println("Your highest grade is: " + max);
// highest grade is the second and output
	else if (grade2 > grade1 && grade2> grade3 && grade2> grade4)
	{	max = grade2;
	System.out.println("Your highest grade is: "+ max );}
//highest grade is the third and output
	else if (grade3 >= grade2 && grade3>= grade1 && grade3>= grade4)
		{max = grade3; 
		System.out.println("Your highest grade is: " + max);}
//highest grade is the forth and output
	else if (grade4 >= grade2 && grade4>= grade3 && grade4>= grade1)
		{max = grade4;
		System.out.println("Your highest grade is: "+ max);
		}
		
	
//grade2 is lowest and output
{if (grade1>= grade2 && grade2 <= grade3 && grade2 <= grade4)
 	{min = grade2;
	System.out.println(" Your lowest grade is:" + min);}
//grade1 is the lowest and output
	else if ( grade1<=grade2 && grade1 <= grade3 && grade1 <= grade4)
	{min =  grade1;
		System.out.println("Your lowest grade is: " + min);}

	// grade3 is the lowest and output
	else if ( grade3<=grade2 && grade3 <= grade2 && grade3 <= grade4)
		{min = grade3;
		System.out.println("Your lowest grade is: "+ min);}
	
		// grade4 is your lowest and output
		else if ( grade4<=grade2 && grade4 <= grade3 && grade4 <= grade1)
		{			min = grade4;
			System.out.println("Your lowest grade is: " + min);}
	}
}}
}