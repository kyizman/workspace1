// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 8
import java.util.*;
public class Occurrences {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//get new scanner	
		boolean cont= false;
		do{
		Scanner input = new Scanner(System.in);
		
		//prompt user for a string and take input 
		
		System.out.println("Enter A string");
		String answer = input.nextLine();
		
	//prompt user to enter a letter and take the letter as an string	
		System.out.println("Enter a Letter to Look for.");
		String letter =  input.nextLine();
		//convert the letter to a char value
		char lettertochar = letter.charAt(0);
		
		//use the method count to count the letter selected in the string
		int ammount = count(answer,lettertochar);
		//output the ammount of the letter selected
		System.out.println("There are "+ ammount +" "+lettertochar+"'s" + " in your string." );
	
		
		
		
		//prompt the users if they would like to re run the program
		System.out.println("Would you Like to Run the Program Again? (yes/no)");
		//take user input
		String rerun = input.next();
		//if they would like to re run the program changes cont to true
		if(rerun.equalsIgnoreCase("yes"))
			cont = true;
		else//terminates program if no loop is needed
		{
			cont = false;
			System.out.println(" Thats all folks.");
		}

		
	
		
	}while(cont);// resets do wile
	
	
	
	
	
	
}


public static int count(String str, char a)
{
	//declair the counter
int count = 0;
//loop the counter to the length of the string
for (int i=0; i<str.length(); i++)
//increas the counter if the selected letter is at that spot of the string
	if(str.charAt(i) == a )
	count++;

		else
		{}
//return the final ammount of the counter
return count;
}
}

