// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 6
public class EvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declair the lowist number 
int number = 50;
//output the lable for the evens
System.out.print("Even Numbers Between 50 and 100 : " );
//loop from 50 to 100
for (;number <= 100; number++)
	
	//if even or with a ramainder of 0
if (number % 2 == 0)
{// output the even numbers
	System.out.print(number + " , ");

	
	}//output the lable for the odd numbers
System.out.print( "\n"+"Odd Numbers Between 50 and 100 : " );
 number = 50;//declair number as 50
 //loop from 50 - 100
for(;number <=100; number++)
	//if the number is odd or has a remainder of 1
	if(number  % 2 == 1)
		//output the number and a comma
		System.out.print(number +" , ");
	}



	}
