// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 1

import java.lang.Math;
import java.text.*;
import java.util.Scanner;
public class Lab_2_8 {

	public static void main(String[] args) {
		//new scanner input
		Scanner input = new Scanner(System.in);
		//to get the user to imput the points
		System.out.println("Enter First x");
		double x1 = input.nextDouble();

		System.out.println("Ennter First y");
		double y1 = input.nextDouble();

		System.out.println("Enter Second x");
		double x2 = input.nextDouble();

		System.out.println("Enter Second y");
		double y2 = input.nextDouble();

		System.out.println("Enter third x ");
		double x3 = input.nextDouble();

		System.out.println("Enter third y");
		double y3 = input.nextDouble();
//first side ( all formula)
		double a1 = x2 - x1;

		double b1 = y2 - y1;
//declair a1 and b1 as the frist part of the distance formula
		double side1 = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
//second side (formula)
		double b2 = y3 - y1;
		double a2 = x3 - x1;
//declair those math probles as b2 and a2
		double side2 = Math.sqrt(Math.pow(a2, 2) + Math.pow(b2, 2));
//third side
		double a3 = x3 - x2;
		double b3 = y3 - y2;
// declair a3 and b3 as the numbers int the distance formula
		double side3 = Math.sqrt(Math.pow(a3, 2) + Math.pow(b3, 2));
//to get s
		double s = (side1 + side2 + side3) / 2;
//to find the area of the sides
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//to round the answer
		double roundedArea = (double) Math.round(area * 100.0) / 100.0;
		System.out.println(" The area of the triangle is" + roundedArea);

	}

}
