public class longStreak {

	public static void main(String[] args) {
		System.out.println(longestStreak("CCCAAAAATTT!"));
		System.out.println(longestStreak("DDOOOGGGGG!"));
		System.out.println(longestStreak("BBBBBIIIRRRDDD!"));
	}
	
	public static String longestStreak (String str)
	{
		int count = 1;
		int prevcount = 0;
		char letter = 0;
		char prevletter = 0;
		
		for (int i=0; i<str.length()-1; i++)
		{
			if (str.charAt(i)==str.charAt(i+1))
			{
				count++;
				letter = str.charAt(i);
			}
			else
			{
				if (count>prevcount)
				{
					prevcount = count;
					prevletter = letter;
				}
				count = 1;
			}
		}
		return prevletter + " " + prevcount;
	}

}
