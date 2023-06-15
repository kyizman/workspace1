// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 5
import java.util.*;
public class KeyPad {

	public static void main(String[] args){
//new scanner
		Scanner input = new Scanner(System.in);
{//Promt user for a letter
System.out.println("Enter a letter");
String Enter = input.next();
//change letter imput to lower case
Enter = Enter.toLowerCase();
// out put 2 for a,b,c
if (Enter.equals("a") || Enter.equals("b") || Enter.equals("c"))
{
System.out.print("The Corresponding Number is 2");
}//output 3 if d,e,f
	else if (Enter.equals("d") || Enter.equals("e") || Enter.equals("f"))
{System.out.println("The Corresponding Number is 3");}
//output 4 if g,h,i
	else if (Enter.equals("g") || Enter.equals("h") || Enter.equals("i"))	
{System.out.println("The Corresponding Number is 4");}
	//output 5 if j,k,l
	else if (Enter.equals("j") || Enter.equals("k") || Enter.equals("l"))	
{System.out.println("The Corresponding Number is 5");}
	//output 6 if m,n,o
	else if (Enter.equals("m") || Enter.equals("n") || Enter.equals("o"))	
{System.out.println("The Corresponding Number is 6");}
	//output 7 if p,q,r,s
	else if (Enter.equals("p") || Enter.equals("q") || Enter.equals("r") || Enter.equals("s"))
{System.out.println("The Corresponding Number is 7");}
	//output 8 if t,u,v
	else if (Enter.equals("t") || Enter.equals("u") || Enter.equals("v"))
{System.out.println("The Corresponding Number is 8");}
	//output 9 if x,y,z
	else if (Enter.equals("w") || Enter.equals("x") || Enter.equals("y") || Enter.equals("z"))
{System.out.println("The Corresponding Number is 9");}
	else//output for any other 
		System.out.println("The input is invalid");
}
	}
}