// 1301
// fall 2016
// Kyson Manis
// Monisha Verma
// lab 6
public class Stars
{
   public static void main (String[] args)
   {//max number
      final int max = 10;
      //setting the line as the loop counter untill it hits max
      for (int line = 1; line <= max; line++)
    	  //loop for ammout of stars per line starting from high to low
      {   for (int star = 10; star >= line; star--)
    	  //output the stars
    	  System.out.print ("*");
      //next line created
         System.out.println();  }
   }//i used chapter five slideshow as a refrence point
}
