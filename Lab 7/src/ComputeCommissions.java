// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 7

public class ComputeCommissions {
 
public static void main (String[] args)
{
	

	
	//loop for the enter ammount until 100000
	for(double salesAmount = 0; salesAmount <= 100000; salesAmount++)
	{//declair commison and use it with the computeCommission method
		double commison = computeCommission(salesAmount);	
		//output the sales amount and the commison for that ammount
		System.out.println("Your Commission for $"+ salesAmount + " is $" + commison);
	}
 
 
 
}
	

//get the commison
public static double computeCommission (double salesAmount)
{	//if the sales amount is less than or equal too 5000
	if(salesAmount <= 5000)
	{
		//return the commison at 8%
		return (salesAmount * .08);
	}//if the sales amount is biger than 5000 but less than 10000
	else if(salesAmount <= 10000 && salesAmount > 5000) {
		//return the comisonat 10%
		return ((5000.0 *.08) + ((salesAmount - 5000.0) * .10));
	}
	//if it is greater than 10000
	else
	{	//return the commison at 12%
		return (5000 * .08 ) + (5000.0 * .10) + ((salesAmount - 10000) * .12);
	}
	
	
}
}
