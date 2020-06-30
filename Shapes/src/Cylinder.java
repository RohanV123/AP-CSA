
public class Cylinder extends Shape{
	
	public Cylinder (double radius, double height)
	{
		super(radius,height);
	}
	
	public double getVolume()
	{
		return (Math.PI * (Math.pow(radius, 2)) * height);
	}
	
	public double getSurfaceArea()
	{
		return (2 * Math.PI * radius * height) + (2*Math.PI * Math.pow(radius, 2));
	}
	
	public String toString()
	{
		return this.getClass().toString() + " with radius " + this.radius + " and height " + this.height;
	}
}
