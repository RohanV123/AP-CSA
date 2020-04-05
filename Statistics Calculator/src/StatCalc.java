import java.util.*;

public class StatCalc {
	
	private ArrayList <Integer> numbers = new ArrayList <Integer>();
	
	public void enter(int item)
	{
		 numbers.add(item);
	}
	public int getCount()
	{
		return numbers.size();
	}
	public int getMax()
	{
		int max = numbers.get(0);
		for (int i =0; i<=getCount()-1;i++)
		{
			if (numbers.get(i)>max)
			{
				max = numbers.get(i);
			}
		}
		return max;
	}
	public int getMin()
	{
		int min = numbers.get(0);
		for (int i = 0; i<=getCount()-1;i++)
		{
			if (numbers.get(i)<min)
			{
				min = numbers.get(i);
			}
		}
		return min;
	}
	public int getSum()
	{
		int sum = 0;
		for (int i =0; i<=getCount()-1;i++)
		{
			sum += numbers.get(i);
		}
		return sum;
	}
	public double getMean()
	{
		return getSum()/getCount();
	}
	public double getStandardDeviation()
	{
		double diff = 0;
		for (int i = 0; i<=getCount()-1;i++)
		{
			diff += Math.pow((numbers.get(i)-getMean()), 2);
		}
		return Math.sqrt(diff/getCount());
	}
}
