
public class Cone extends Shape {
	
	public Cone (double radius, double height)
	{
		super(radius, height);
	}
	
	public double getVolume()
	{
		return (Math.PI * (Math.pow(radius, 2)) * (height/3));
	}
	
	public double getSurfaceArea()
	{
		return (Math.PI * radius) * (radius + (Math.sqrt((Math.pow(height, 2)) + Math.pow(radius, 2))));
	}
	
	public String toString()
	{
		return this.getClass().toString() + " with radius " + this.radius + " and height " + this.height;
	}

}
