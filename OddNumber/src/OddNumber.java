
public class OddNumber {

	public static void main(String[] args) {
		int[] array1 = new int[]{3,5};
		int[] array2 = new int[] {3,5,7};
		int[] array3 = new int[] {3,5,7,9};
		int[] array4 = new int[] {1,2,3,4,5};
		System.out.println(isOdd(1));
		System.out.println(isOdd(2));
		System.out.println(isOdd(0));
		System.out.println(findOdd(array1));
		System.out.println(findOdd(array2));
		System.out.println(findOdd(array3));
		System.out.println(findOdd(array4));
		System.out.println(findOddRec(array3));

	}

	public static boolean isOdd(int number)
	{
	   if (number % 2 == 1)
	   {
	      return true;
	   }
	   else
	   {
	      return false;
	   }
	}
	public static int findOdd(int[] numArray)
	{
	   int oddCount = 0;
	   int oddNum = -1;
	   for (int i = numArray.length - 1; i >= 0; i--)
	   {
	      if (oddCount < 3)
	      {
	         if (isOdd(numArray[i]))
	         {
	            oddCount++;
	         }
	         oddNum = numArray[i];
	      }
	   }
	   if (oddCount < 3)
	   {
	      return -1;
	   }
	   else 
	   {
	      return oddNum;
	   }
	}
	public static int findOddRec(int[] numArray)
	{
	   int[] oddArray = new int[] {};
	   int maxIndex = numArray.length-1;
	   int count = 0;
	   if (count == maxIndex)
	   {
	      return oddArray[count] = numArray[maxIndex];
	   }
	   else
	   {
	      return findOddRec(oddArray);
	   }
	}

}