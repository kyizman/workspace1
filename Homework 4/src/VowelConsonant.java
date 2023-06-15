// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 4
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//prompt the user for a letter		
System.out.println("Enter a letter");
	String letter = input.next();
	letter = letter.toLowerCase();
	//get the first char
	char letterchar = letter.charAt(0);
	//get the acii number
	int ascii = (int) letterchar;
// if the ascii is is for a symbole
	if( ascii >=97 && ascii <= 122)	
	//nested if for the letters
 if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") )
		//output that it is a vowel
		System.out.println(letter + " is a vowel");
	//if it is y since it is sometimes
	else if (letter.equals("y"))
	System.out.println(letter + " is sometimes a vowle");
	else//if the letter is a consanate
		System.out.println(letter + " is a consanate");
	else//if the input is not a letter
		System.out.println(letter + " is invalid");
	}

}