
public class Sphere extends Shape{
	
	public Sphere (double radius, double height)
	{
		super(radius, height);
	}
	
	public double getVolume ()
	{
		return ((4.0/3.0)*Math.PI*(Math.pow(radius, 3)));
	}
	
	public double getSurfaceArea ()
	{
		return (4 * Math.PI*(Math.pow(radius, 2)));
	}
	
	public String toString()
	{
		return this.getClass().toString() + " with radius " + this.radius + " and height " + this.height;
	}
}
