package fun;
import java.util.Scanner;
public class rockpapersizors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	

System.out.println("Rock = 3 | Paper = 2 | Scissors = 1 ");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
	
int	rando = (int) (1 + Math.random()*3); 

if(rando == 1)
System.out.println("Your Opponent Chose Scissors.");
else if(rando == 3)
System.out.println("Your Opponent Chose Rock");
else if (rando == 2)
	System.out.println("Your Opponent Chose paper");
	

if(choice == 1)
	System.out.println("You Chose Scissors." + "\n" );
else if(choice == 2)
	System.out.println("You Chose Paper." + "\n");
else if (choice == 3)
	System.out.println("You Chose Rock" + "\n");
if (rando == choice)
	System.out.println("tie");

else if (rando == 1 && choice ==2  || rando == 2 && choice == 3 || rando == 3 && choice ==1 )
System.out.println("You Loose");	

else 
	System.out.println("YOU WIN");
	
}

}
