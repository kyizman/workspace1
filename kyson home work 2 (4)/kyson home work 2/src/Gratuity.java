// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// HW 2
import java.util.Scanner;

public class Gratuity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			System.out.print("Input subtotal then gratuity" +"\n");
		//to prompt the user
				double subtotal = input.nextDouble();
				double tip = input.nextDouble();
		//to decalire the variables 
				System.out.println("Subtotal:$" + subtotal);
				System.out.println("gratuity:$" + subtotal * (tip/100));	
			System.out.println("total:$" + (subtotal + (subtotal * (tip/100))));
		// to work out the ammouts in gratuity and in total			
			

	}

}
