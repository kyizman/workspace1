import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args){
	Scanner input = new Scanner(System.in); 
		// TODO Auto-generated method stub
System.out.println("Enter An Three Diggit Intiger");
String number = input.nextLine();//input
String reverse; //declair reverse
 reverse = new StringBuilder(number).reverse().toString();//to set the string to its opposite
 
 if (number.equals(reverse))//if it is a palondrom and printout
 {
	 System.out.print(number + " Is a Palindrome");
	}
 else//if not a palindrome and print out
	 System.out.println(number + " Is Not a Palindrome");


	}

}
