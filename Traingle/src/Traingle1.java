
public class Traingle1 {
	
	String checkTriangle(int x, int y, int z)
	{
	    // Check for equilateral triangle
	    if (x == y && y == z ) 
	        return "Equilateral";
	 
	    // Check for isosceles triangle
	    else if (x == y || y == z || z == x )
	    	return "Isosceles";
	 
	    // Otherwise scalene triangle
	    else
	    	return "Scalene";
	}
	 
}
