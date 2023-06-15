
public class LozaWozaCoza {
public static void main (String[] args){
	
	for (int count = 1; count <=110; count ++){
		
		
		if (count % 11 == 0)
			System.out.println();
		
		if (count % 3 == 0 )
			System.out.print("coza");
			
		if(count %5  == 0)
			System.out.print("loza");
		
		if(count % 7 ==0)
			System.out.print("woza");
		
		else 
			System.out.print(" "+count + " ");
		
	}
}
}
