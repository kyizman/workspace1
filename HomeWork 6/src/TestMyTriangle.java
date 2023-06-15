// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// homework 6



//to test the area of a triangle
public class TestMyTriangle {

	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3){
// aassining the sides of the triangle to a b and c
double a = side1;
double b = side2;
double c = side3;
	// to get the half of the perimiter
	double p=((a+b+c)/2);
	//to find the area
	double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	//return the area
	return area;
}
}