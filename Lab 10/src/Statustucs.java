// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 10
import java .util.*;
public class Statustucs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean cont = false;
do{	
Scanner input = new Scanner(System.in);
		//declair numbers as 10 long
		double[] numbers = new double [10];
		//loop to prompt the user for input and take input
		for(int i = 0 ; i< 10;i++)
		{
			System.out.println("Enter A Number");
			double enter = input.nextDouble();
			numbers[i]=enter;
		}
	//output the mean 
	System.out.println("The Mean is " + mean(numbers));
	//output the deviation rounded
	System.out.println("The Deviation is " + (double) Math.round(deviation(numbers)*100000)/100000);
	
	
	// prompt the users if they would like to re run the program
	System.out.println("Would you Like to Run the Program Again? (yes/no)");
	// take user input

	String rerun = input.next();
	// if they would like to re run the program changes cont to true
	if (rerun.equalsIgnoreCase("yes"))
		cont = true;

	// terminates program if no loop is needed
	else {
		cont = false;
		System.out.println(" Thank You For your time");
	}


			}while (cont);// resets do wile



	}

//to get the mean
public static double mean(double[] x)
{
	//set added to 0
double added = 0;
//loop to add the numbers together
for( int i = 0; i < x.length; i++)
{
added += x[i];
}
//to out put the all the added numbers and devide it by the length and round
double mean = (double) Math.round((added/x.length)*10000)/10000;
//reurn the mean
return mean;
}




//get the deviation
public static double deviation( double [] x)
{
	//set added to 0
	double added = 0;
	//loop to add the numbers together
	for( int i = 0; i < x.length; i++)
	{
	added += x[i];
	}
//get the mean by deviding the added numbers by the length
double mean = added/x.length;

//set sub to 0
double sub = 0;
//loop to subtract the mean from the number and square it
for(int z =0; z < x.length ; z++)
{
	x[z] =  Math.pow((x[z]- mean),2);
	{
		// add the numbers back to gether
		 sub += x[z];
		}
}
//declair deviation
double deviation;
//set deviation to the added numbers decided by the length - 1
  deviation = ( Math.sqrt(sub/(x.length-1)));
	
//return deviation
return deviation;
}
}