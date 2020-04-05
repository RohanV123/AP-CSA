
public class Statistics {

	public static void main(String[] args) {

		StatCalc calculator = new StatCalc();
		for (int i = 1; i <=10; i++)
		{
		  calculator.enter(i);
		}
		System.out.printf("There are %d items in your list.", calculator.getCount());
		System.out.println();
		System.out.printf("The max of your items is %d.", calculator.getMax());
		System.out.println();
		System.out.printf("The min of your items is %d.", calculator.getMin());
		System.out.println();
		System.out.printf("The sum of your items is %d.", calculator.getSum());
		System.out.println();
		System.out.printf("The mean of your items is %3.2f.", calculator.getMean());
		System.out.println();
		System.out.printf("The standard deviation of your items is %3.2f.", calculator.getStandardDeviation());
		System.out.println();
		}

}
