import java.util.Scanner;
public class MultiplicationTable {
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int enter = input.nextInt();
	System.out.print("*");
	for (int count = 1 ; count < enter ; count++){
		System.out.print( " "+count);
		
		System.out.println();
for(int addnumber = 1 ; addnumber <=enter ;addnumber ++){
			
			System.out.print(addnumber + "\n");
	
		
		}
	}

}
}