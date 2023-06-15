
public class combinedcode928 {

	 public static void main(String[] args){
		 //calculating harmonics for n
		 int fivegrand= 5000000;
		 double rsum = 0 , lsum =0;
		for (int i = 1; i<=fivegrand ; ++i  ){
			lsum += 1.0/i;
			rsum += 1.0/(fivegrand - i +1);
		}
		System.out.println("The Harmonics for n From Left to Right is: " +lsum);
	System.out.println("The harmonics for n from right to left is : " + rsum);	
	System.out.println("The diffrence in sums is: " + (lsum-rsum));}
	 
	 

}