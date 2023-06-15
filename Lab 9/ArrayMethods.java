import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int[] list;
		
		System.out.println("How Many Numbers are you Using?");
		int ammount = input.nextInt();
		
		list = new int[ammount];
		
		for(int i = 0 ; i < ammount ; i++)
		{
			System.out.print("Enter a Number : ");
			int number = input.nextInt();
			list[i] =number;
		}
		System.out.print("Original array ");
		for(int i = 0; i < ammount;i++)
		{
			System.out.print(list[i]);
			
		}
		for(int i = 0; i < ammount;i++)
		{
			arraySquare(list);
			
		}
		

	System.out.println("");
	System.out.println("Max : "+arrayMax(list));
	System.out.println("Min : " +arraymin(list));	
	
	
	}



public static int arrayMax(int[] arr)
{
//set max to the first grade
int max = arr[0];
// loop to get max grade
for (int i = 1; i < arr.length; i++)
{//adapted from the slides
	// change max if that number in the array is bigger than the
	// first one and so on
	if (arr[i] > max)
		// set max grade to new greater number
		max = arr[i];
	// output the max grade
	}
return max;

}
public static int arraymin(int[] arr)
{
//set max to the first grade
int min = arr[0];
//loop to get max grade
for (int i = 1; i < arr.length; i++)
{//adapted from the slides
	// change max if that number in the array is bigger than the
	// first one and so on
	if (arr[i] < min)
		// set max grade to new greater number
		min = arr[i];
	// output the max grade

}
return min;
}

public static void arraySquare(int[] arr)
{
//loop to get max grade
for (int i = 1; i < arr.length; i++)
{
	
   arr[i] =(int) Math.sqrt(arr[i]);
   
}
   return;

}



public static void arrayReverse(int[] arr)
{
int count = 0;
for(int i = arr.length; i>0;i--)
{
	
	arr[count] = arr[i];
	return;
}
}
}
