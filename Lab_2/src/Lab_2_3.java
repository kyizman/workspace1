
// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 1
import java.util.Scanner;
public class Lab_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scan = new Scanner(System.in); 
		// variable declaration section
	      byte byte_value;
	      short short_value;
	      int int_value;
	      long long_value;
	      float float_value;
	      double double_value;

	   // read input values section
	      System.out.print ("Enter byte value: ");
	      byte_value = scan.nextByte();
	   
	   // print out outputs section
	      System.out.println ("\n");
	      System.out.println ("The byte value is:\t\t" + byte_value);
	      
	   // read input values section
	      System.out.print ("Enter short value: ");
	      short_value = scan.nextShort();
	   
	   // print out outputs section
	      System.out.println ("\n");
	      System.out.println ("The short value is:\t\t" + short_value);

	   // read input values section
	      System.out.print ("Enter int value: ");
	      int_value = scan.nextInt();
	   
	   // print out outputs section
	      System.out.println ("\n");
	      System.out.println ("The int value is:\t\t" + int_value);

	   // read input values section
	      System.out.print ("Enter long value: ");
	      long_value = scan.nextLong();
	   
	   // print out outputs section
	      System.out.println ("\n");
	      System.out.println ("The long value is:\t\t" + long_value);

	   // read input values section
	      System.out.print ("Enter Float value: ");
	      float_value = scan.nextFloat();
	   
	   // print out outputs section
	      System.out.println ("\n");
	      System.out.println ("The Float value is:\t\t" + float_value);
	      
	   // read input values section
	      System.out.print ("Enter double value: ");
	      double_value = scan.nextDouble();
	   
	   // print out outputs section
	      System.out.println ("\n");
	      System.out.println ("The Double value is:\t\t" + double_value);
	      
	}

}
