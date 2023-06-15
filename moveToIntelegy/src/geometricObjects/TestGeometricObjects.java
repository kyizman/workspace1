package geometricObjects;

/**
 * Created by Tulin on 1/25/2017.
 */
public class TestGeometricObjects {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle =
                new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle =
                new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " +
                rectangle.getPerimeter());


        /*Create a  a triangle object with vertices (17,17), (5, 30) and (5,17).
        Print the area of the triangle. The area should be 78.
         */
    }

}
