// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 6
import  java.util.Scanner;
public class StringOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//prompt the user for a string
System.out.print("Enter a String: " ); 
	String answer = input.nextLine();



//get the length of the input
int answerlenth =answer.length();
{//put the string to uppercase
String uppercase =(String) answer.toUpperCase();
	//loop using count as counter 
for(int count = 0;count < answerlenth ; count++){
	//the letter of the string and changing the charicter by the count
	char ch = answer.charAt(count);
	//output the count and letter
	System.out.println("Character #" + count +": " + ch);

}
	}
	}

}
