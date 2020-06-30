import java.util.*;

public class NumberCube {

	public static int toss()
	{
		Random number = new Random();
		return(number.nextInt(6)+1);
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numTosses)
	{
		int[] tosses = new int[numTosses];
		for (int i = 0; i<numTosses; i++)
		{
			tosses[i]=toss();
		}
		return tosses;
	}
	
	public static int getLongestRun(int[] values)
	{
		int count = 1;
		int prevcount = 0;
		for (int i =0; i<values.length -1;i++)
		{
			if (values[i]==values[i+1])
			{
				count++;
			}
			else
			{
				if (count>prevcount)
				{
					prevcount = count;
				}
				count = 1;
			}
		}
		return prevcount;
	}
}
