// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 5
import java.util.* ;
public class ASCII_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//scanner
Scanner input = new Scanner(System.in);
//Prompt user for ASCII number
System.out.print("Enter The ASCII Number: ");
int answer = input.nextInt();
//to get the ascii number turning the int caricter to a char 
 String ascii = Character.toString((char) answer);
//print out letter for the ascii number
System.out.println("The charicter for ASCII code " + answer + " is " + ascii);

}
}