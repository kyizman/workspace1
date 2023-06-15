// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 7

import java.util.Scanner;
public class PalandromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	boolean cont = false;
	do{
	//output for the user for a number
	 	System.out.println("Enter an number  ");
	//declair numbers an the input
		int numbers = input.nextInt();
		//declair int rev
		
		int rev;
	
	
	
		//use method revers to get the revers of a number
  rev = reverse( numbers);		
  //get if the number is a palandrome
boolean pal = isPalindrome(numbers,rev);
//if it is a palandrome output so
if (pal == true)
	System.out.println(numbers +" is a palandrome");
//if it is not a palandrome output so
else
{	System.out.println(numbers + " is not a palandrome");}



//prompt the users if they would like to re run the program
System.out.println("Would you Like to Run the Program Again? (yes/no)");
//take user input
String answer = input.next();
//if they would like to re run the program changes cont to true
if(answer.equalsIgnoreCase("yes"))
	cont = true;
else//terminates program if no loop is needed
{
	cont = false;
	System.out.println(" Thats all folks.");
}

}while(cont);// resets do wile 
}
		

		// Return the reversal of an integer
		public static int reverse (int numbers){
		//declair reverse as an int
			int reverse = 0;
			//loop to get the revers of a number
			while (numbers!=0){		
				//find the last digit left and will get rid of the last number 
			reverse =reverse*10 + numbers % 10;
			//get the last digit of the original number
			numbers /= 10;
		
					
			}//return the revurse
			return reverse;
		
			
		}
		// Return true if number is a palindrome
		public static boolean isPalindrome(int number, int reverse ){
		//subtract the first number by the secodn if it is zero it is a paland brome if not it is not a palandrome
			int remainder = number - reverse;
			//if palandrome
			if (remainder == 0) {
				 //return true
			return  true ;}
			//if not palandrome
			else
			//return false
			return false;
			
				
			}
	

}

