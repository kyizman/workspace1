// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 3
import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your account number");
		int acc = input.nextInt();
		System.out.print(" Do you have Regular or Premium services (R/P)" + "\n ");
		String services = input.next();
		{//if you have regular serveses then prompts for time used
			if (services.equals("R")) {
				System.out.println("Enter the minutes used below");
				int time = input.nextInt();

				if (services.equals("R") && time <= 50)//if the ammount used is less than or equal to 50 

				{
					System.out.println("Account: " + acc);//printout account number
					System.out.println("Regular Servece charge: $10.00");//print out charge
				} else if (services.equals("R") && time > 50) {//if time is greater than 50 for regular
					System.out.println("Account: " + acc);//account
					System.out.println(" Regular Servece charge: $" + Math.round((10.00 + (time - 50.00) * .20)));//output
				}
			} 
			else if (services.equals("P"))//premium
			{//hours in the morning
				System.out.println("Where the calls made between the hours of 6:00 AM - 6:00 PM (yes/no)");
				String prem = input.next();
				System.out.println("If so how many muinets used");
				int morn = input.nextInt();
			//hours at night
				System.out.println(" Where calls made between the hours of 6:00 PM - 6:00 AM (yes/no)");
				String nit = input.next();
				System.out.println("If so how many muinets used");
				int night = input.nextInt();
//if only morn is a yes and less than 75
				if (prem.equals("yes") && nit.equals("n") && morn < 75) {
					System.out.println("Account: " + acc);
					System.out.println(" Premium service charge: $25.00 ");
				}
// if morn is greater than 75
				else if (prem.equals("yes") && nit.equals("n") && morn > 75) {
					System.out.println("Account: " + acc);
					System.out.println("Premium Servece charge: $" + Math.round(25.00 + (morn - 75) * .10));
				}
//night is less than 100
				else if (prem.equals("no") && night <= 100) {
					{
						System.out.println("Account: " + acc);
						System.out.println("Premium Service Charge: $25.00");
					}//night is greater than 100
				} else if (prem.equals("no") && nit.equals("y") && night > 100) {
					System.out.println("Account: " + acc);
				
					System.out.println("Premium Service Charge: $" + Math.round(25.00 + (night - 100) * .05));
			//if both times are used and greater than 75 and 100
				} else if (prem.equals("yes") && nit.equals("y") && morn >= 75 && night >= 100){// both yes and greater than 75 and 100
				
					System.out.println("Account: " + acc);
				double round =(morn - 75.00) * .10 + 25.00	+ (night - 100.00) * .05;
				System.out.println("Premium Service Charge: $" + Math.round(round*100) / 100);
			}//if both times are used but is lower than 75 and 100
			 else if (prem.equals("yes") && nit.equals("y") && morn < 75 && night < 100);
			{
				System.out.println("Account: " + acc);
System.out.println("Premium Service Charge: $25.00 ");
			}
		}
	}
}
}