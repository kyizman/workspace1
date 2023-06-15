// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 7


//use methods to get the min max and average of user input
import java.util.Scanner;
public class MinMaxAvg {

	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
//set cont to false
		boolean cont = false;
		//do wile loop for user loop
	do{
		//get user input for three intagers
		System.out.println("Enter Three Numbers");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		//use the method minresult for the minimum value
		int minresult = min(x,y,z);
		//use the method maxresult to get the max value
		int maxresult = max(x,y,z);
		//use method avg for the average value of the three
		double average = avg( x, y, z);
		//output the max ,minimum,and average of the three numbers
		System.out.println("Max value: " + maxresult);
		System.out.println("Min value: " + minresult);
		System.out.println("Average value: " + average);
	//prompt the users if they would like to re run the program
		System.out.println("Would you Like to Run the Program Again? (yes/no)");
		//take user input
		String answer = input.next();
		//if they would like to re run the program changes cont to true
		if(answer.equalsIgnoreCase("yes"))
			cont = true;
		else//terminates program if no loop is needed
		{
			cont = false;
			System.out.println(" Thats all folks.");
		}
		
	}while(cont);// resets do wile 
}
//gets minimum value
	public static int min(int x, int y, int z) {
		//if x is the lowest number return x
		if(x<y && x<z)
			return x;
		//if y is the lowest number return y
		else if ( y<x && y<z)
			
		return y;
		//if z is the lowest number return z
		else
			System.out.print(z);
		return z;
		}
	
		//get the max number
 public static int max(int x,int y, int z ){
 //if x is the bigest number return x
	 if (x>y && x>z)
		 return x;
	//return y if it is the biggest number
	 else if(y>x && x>z)
		 
		 return y;
	 //retun z if it is the biggest number
	 else
		 return z;
	 
 }
//get the average of the three numbers
 public static double avg(int x, int y, int z){
	 //add the numbers
  double Addall = x+ y+ z;
  //devide all numbers by how many there are
  double devide = Addall/3;
  //return the devided number
  return devide;
 }
	}
