// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 4
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in); 
{	
	System.out.println("Enter the first string");
	String firstS = input.nextLine();
	
	System.out.println("Enter the second string");
	String secondS = input.nextLine();
	
	//lower case and upper case of the two strings
String	lowercase1 = firstS.toLowerCase();
String  lowercase2 = secondS.toLowerCase();
String  uppercase1 = firstS.toUpperCase();
String  uppercase2 = secondS.toUpperCase();
//there lengths
int length1	= firstS.length();
int length2 = secondS.length();
//substrings in the strings
String sub1 = firstS.substring(1,4);
String sub2 = secondS.substring(1,4);
//to check if they are equal strings
boolean equals = firstS.equalsIgnoreCase(secondS);
	//to print out the lengths of the strings
System.out.println("a) The Length of String One is " + length1);
System.out.println("b) The Length of String two is " + length2);
// to link or concatenate the strings
System.out.println("c) Concatenate of the two strings is " + firstS + secondS);
 //Output true or false if the strings are equal
System.out.println("The two strings have the same set of characters with regards to case: " + equals);
//lower case of string 2 and upper case of string 1 output
System.out.println("e) The upper case of string one is " + uppercase1);
System.out.println("f)The lower case of string two is " + lowercase2);
//output the substring of the first string
System.out.println("g) A substring of string one is " + sub1);}
}

	}
	
