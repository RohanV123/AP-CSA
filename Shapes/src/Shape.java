
public abstract class Shape {
	public double radius;
	public double height;
	
	public Shape (double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius ()
	{
		return radius;
	}
	public double getHeight ()
	{
		return height;
	}
	
	public abstract double getVolume ();
	public abstract double getSurfaceArea ();
	
	public String toString()
	{
		return this.getClass().toString();
	}

}
