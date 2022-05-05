
public class Triangle3 {
	String checkTriangle(int x, int y, int z)
	{
		if(x+y<z || x+z<y || z+y<x) 
			return "Invalid Triangle";
		if(x <= 0 || y <= 0 || z <= 0) 
			return "Invalid Triangle";
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
