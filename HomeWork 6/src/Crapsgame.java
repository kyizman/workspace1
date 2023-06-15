// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 6
import java.util.Scanner;

public class Crapsgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//new scanner
		Scanner input = new Scanner(System.in);
		// declair variables
		boolean cont = false;
		int firstroll;
		int secondroll;
		int add;
		int number = 0;
		int r1 = 0;
		int r2 = 0;
//start of do while to reloop the program
		do {
//prompt the user if they whant to start the program
			System.out.println("Would you like to play a game of craps (yes/no)");
			// to take the input
			String answer = input.next();
			//run program if yes
			if (answer.equals("yes")) {
				//to roll the dice two times using the rolldice method
				firstroll = RollDice();
				secondroll = RollDice();
//add the two rolled dice
				add = firstroll + secondroll;
//output the rolls and the added value
				System.out.println("You rolled " + firstroll + " + " + secondroll + " = " + add);
				// output the added number as your point
				System.out.println("Your point is " + add);
				//if add is 7 or 11
				if (add == 7 || add == 11)
				{
//output you win
					System.out.println("YOU WIN");
				}
				// if add is 2,3 or 12
				else if (add == 2 || add == 3 || add == 12)
				{
//output you loose
					System.out.println("YOU LOSE");

				}
				//if add is not any of the specifyed numbers
				else
//loop that continues untill the input is found or 7 is found
					while (number != 7 || number != add)

					{
						//roll two dice with the roll dice method
						r1 = RollDice();
						r2 = RollDice();
						// add the values of the two dice
						number = r1 + r2;
//if your number is equal to 7 
						if (number == 7)
						{
//output the two rolls and add
							System.out.println("You rolled " + r1 + " + " + r2 + " = " + number);
							//output the orignal point
							System.out.println("Your point is " + add);
							//output that you lose
							System.out.println("YOU LOSE");
							//end loop
							break;
						}
//if number is equal to the point
						else if (number == add)
						{
							//output the numbers for the rolls and the added number
							System.out.println("You rolled " + r1 + " + " + r2 + " = " + number);
							// output the original point
							System.out.println("Your point is " + add);
							//output that you win
							System.out.println("YOU WIN");
							//end loop
							break;
						} 
						// if nether of the other options is relevent
						else
							//output the rolls and added number
							System.out.println("You rolled " + r1 + " + " + r2 + " = " + number);
						//output the original point and continue the loop
						System.out.println("Your point is " + add);
					}

			}
//if they choose to not play the game in the begining
			else {
				System.out.println("Move along then your taking up space at the table");

			}
			// prompt the users if they would like to re run the program
			System.out.println("Would you Like to Run the Program Again? (yes/no)");
			// take user input

			String rerun = input.next();
			// if they would like to re run the program changes cont to true
			if (rerun.equalsIgnoreCase("yes"))
				cont = true;

			// terminates program if no loop is needed
			else {
				cont = false;
				System.out.println(" Thank You For Playing!");
			}

		} 
		while (cont);// resets do wile

	}
//method to roll a 6 sided dice
	public static int RollDice() 
	{
//get a random number between 1 and 6
		int random = (int) (1 + Math.random() * 6);
//return the number
		return random;
	}

}
