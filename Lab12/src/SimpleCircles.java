// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 12  
public class SimpleCircles {
 /** Main method */
 public static void main(String[] args) {
 // Create a circle with radius 1
 SimpleCircles circle1 = new SimpleCircles();
 System.out.println("The area of the circle of radius "
 + circle1.radius + " is " + circle1.getArea());

 // Create a circle with radius 25
 SimpleCircles circle2 = new SimpleCircles(25);
 System.out.println("The area of the circle of radius "
 + circle2.radius + " is " + circle2.getArea());

 // Create a circle with radius 125
 SimpleCircles circle3 = new SimpleCircles(125);
 System.out.println("The area of the circle of radius "
 + circle3.radius + " is " + circle3.getArea());

//Create a circle with radius 125
SimpleCircles circle4 = new SimpleCircles(150);
System.out.println("The area of the circle of radius "
+ circle4.radius + " is " + circle4.getArea());

//Create a circle with radius 125
SimpleCircles circle5 = new SimpleCircles(200);
System.out.println("The area of the circle of radius "
+ circle5.radius + " is " + circle5.getArea());

 // Modify circle radius
 circle2.radius = 100;
 System.out.println("The area of the circle of radius "
 + circle2.radius + " is " + circle2.getArea());
 }


 double radius;

 /** Construct a circle with radius 1 */
 SimpleCircles() {
 radius = 1;
 }

 /** Construct a circle with a specified radius */
 SimpleCircles(double newRadius) {
 radius = newRadius;
 }

 /** Return the area of this circle */
 double getArea() {
 return radius * radius * Math.PI;
 }

//main method
//data field
//no-arg constructor
///cond constructor
//method

 /** Return the perimeter of this circle */
 double getPerimeter() {
 return 2 * radius * Math.PI;
 }

 /** Set a new radius for this circle */
 void setRadius(double newRadius) {
 radius = newRadius;
 }
 }
