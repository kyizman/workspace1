package geometricObjects;

/**
 * Created by Tulin on 1/25/2017.
 */
public class Point {
    private double x;
    private double y;

 
    public void setx(double w)
    {
    	x=w;
    	
    }

    
public void sety(double q)
{
	y=q;
}

public double getx()
{
return x;
}

public double gety()
{
return y;
}



    public double distance(Point p2){
        double dist=0;
        double x2=p2.getx();
        double y2 =p2.gety();
        
        dist = Math.sqrt(Math.pow((x2-x),2)+(Math.pow((y2-y), 2)));
        return dist;
    }
	
	}





