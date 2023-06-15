// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 12  
public class TestCircleWithPrivateDataFields {
 /** Main method */
 public static void main(String[] args) {
 // Create a circle with radius 5.0
 CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
 CircleWithPrivateDataFields yourCircle = new CircleWithPrivateDataFields(40.0);
 System.out.println("The area of the circle of radius "
 + myCircle.getRadius() + " is " + myCircle.getArea());

 // Increase myCircle's radius by 10%
 myCircle.setRadius(myCircle.getRadius() * 1.1);
 System.out.println("The area of the circle of radius "
 + myCircle.getRadius() + " is " + myCircle.getArea());
 
//Increase myCircle's radius by 10%
yourCircle.setRadius(myCircle.getRadius() * 1.5);
System.out.println("The area of the circle of radius "
+ yourCircle.getRadius() + " is " + yourCircle.getArea());

System.out.println("The number of objects created is "
 + CircleWithPrivateDataFields.getNumberOfObjects());
 }
 }