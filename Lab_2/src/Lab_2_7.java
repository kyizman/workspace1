// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 1
import java.util.Scanner;

public class Lab_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	//get input
System.out.println(" Enther the Mass, Final temp, Intital temp");
	//prompt user
	double M = input.nextDouble();
	double Ft = input.nextDouble();
	double It = input.nextDouble();
//Declair variables
System.out.println("Energy Needed=" + (M * (Ft - It) *4184) + "Joules");		
	}
// figure out energy
}
