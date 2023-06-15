package geometricObjects;

import java.util.Scanner;

public class testTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Point A = new Point();
		Point B = new Point();
		Point C = new Point();
		
		double distance;
		System.out.println("Enter the x then y for point A");
		
		double xa= input.nextInt();
		double ya= input.nextInt();
		  A.setx(xa);
		  A.sety(ya);
		
			
			
System.out.println("Enter the x then y for point B");
		
		double xb= input.nextInt();
		double yb= input.nextInt();
		
		B.setx(xb);
		B.sety(yb);
		
		
		
		
System.out.println("Enter the x then y for point C");
		
		double xc= input.nextInt();
		double yc= input.nextInt();
		
		C.setx(xc);
		C.sety(yc);
		
		double testcx =C.getx();
		double testcy =C.gety();
		
		
		
		
		System.out.println("Which Sides would you like to Find the Distance of");
		
		
		System.out.println("1: A,B");
		System.out.println("2: B,C");
		System.out.println("3: C,A");
		
		int choice = input .nextInt();
		
		if(choice == 1){
			
			System.out.println("The Distance of A and B");
		 distance= A.distance(B);
		System.out.println(distance);
		}
		else if(choice == 2)
		{
			
		
			System.out.println("The Distance of A and B");
		distance= B.distance(C);
		System.out.println(distance);
		
		}
		else if(choice == 3)
		{
			
		
			System.out.println("The Distance of A and B");
		distance= A.distance(B);
		System.out.println(distance);
		
		}
		double area= getArea();
		
		
System.out.println(A.toString());
	

		
		
		
		
	}

}
