public class Car implements Location
{
	public double[] location = new double[2];
	private int ID = (int)(Math.random()*999999)+1;
	
	public Car()
	{
		location = new double[2];
	}
	
	public int getID()
	{
		return (int)(Math.random()*999999)+1;
	}
	public void move(double x1, double y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	public double[] getLoc()
	{
		return location;
	}
}