// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 4
import java.util.Scanner;
public class TestOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number");
	int	number = input.nextInt();
	
	if ( number % 5 == 0 && number % 6 == 0  )
		//output that the number is divisible by five and six
		System.out.println("Is " + number + " divisible by 5 and 6?  true");
		
	else
		//output that the number is not divisible by 5 and 6
		{System.out.println("Is " + number + " divisible by 5 and 6?  false");
		}
		
		
		if(number % 5 == 0 || number % 6 == 0 )
			//output that the number is divisible by 5 or 6
			System.out.println("Is " + number + " divisible by 5 or 6? true");
		
		else
			//output that the number is not divisible by 	
			System.out.println("Is " + number + " divisible by 5 or 6?  false");

		if (number % 5== 0 ^ number % 6 == 0 )
			//out put that the number is divisible by 5 or 6 but not both
			System.out.println("Is " + number + " divisible by 5 or 6,but not both?  true");
	
		else
			//output that the number is divisible by both 5 or 6 or nether
			System.out.println("Is " + number + " divisible by 5 or 6,but not both?  false");
	}

}
