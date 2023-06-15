// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 4
public class RandomNumbers {
	
	public static void main(String[] args){
		//to generate a random number between 30 and 50
		int thirtyTo51 = 30 + (int)(Math.random() * 21);
		//to generate a random number between negative 20 and 20
		int neg20toPos20 = -20 +(int)( Math.random() * 41);
		//to generate a number between -60 and -20
		int neg20ToNeg60 = -60 +(int)(Math.random() * 41);
		//to generate a random number between 0 and 15.9999
		double flout15 = (double)(Math.random() * 15.9999);
		
	//out put all random numbers created 
	System.out.println("A Random Number Between 30 and 50 (inclusive) is " + thirtyTo51);
	System.out.println("A Random Number Between 20 and -20 (inclusive) is " + neg20toPos20);
	System.out.println("A Random Number Between -60 and -20 (inclusive) is " + neg20ToNeg60);
	System.out.println("A Random floatin-point Number between 0.0 and 15.9999 (inclusive) is " + flout15);
	}
	
}
