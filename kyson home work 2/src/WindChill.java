// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// HW 2
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	//new scanner
	System.out.println("Enter The temperture Between -58F to 41");
	
	double temp = input.nextDouble();
	//promt user and assine temp as a double
	
	System.out.println("Enter the Wind Spead (>=2");
	
	double speed = input.nextDouble();
	//to rais speed by the power of .16
	double a = Math.pow(speed, 0.16);
	// math to figure out wind chill
	double windChill = 35.74 + 0.6215 * temp - 35.75 * a + 0.4275* temp * a ;
	// round number
	double roundedWindChill = (double) Math.round(windChill * 100000.0) / 100000.0;
//out put answer
	System.out.println("The wind chill index is" + roundedWindChill);	

	}

}
