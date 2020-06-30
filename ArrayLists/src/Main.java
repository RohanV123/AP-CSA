import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> DaysofWeek = new ArrayList<String>(7);
		DaysofWeek.add("Monday");
		DaysofWeek.add("Tuesday");
		DaysofWeek.add("Wednesday");
		DaysofWeek.add("Thursday");
		DaysofWeek.add("Friday");
		DaysofWeek.add("Saturday");
		DaysofWeek.add("Sunday");
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(8);
		Numbers.add(2020);
		Numbers.add(24);
		Numbers.add(23);
		
		
		ArrayList<CandyJar> Candy = new ArrayList<CandyJar>();
		Candy.add(new CandyJar("Sour Patch", 150, true));
		Candy.add(new CandyJar("Reese's", 150, false));
		Candy.add(new CandyJar("Twix", 70, false));
		Candy.add(new CandyJar("Jelly Beans", 150, true));
		Candy.add(new CandyJar("Gummies", 100, false));
		
		ArrayList<APExams> Exams = new ArrayList<APExams>();
		Exams.add(new APExams("English Lit", "May 13th", 5));
		Exams.add(new APExams("CSA", "May 15th", 5));
		Exams.add(new APExams("Physics", "May 11th", 4));
		Exams.add(new APExams("Statistics", "May 22nd", 5));
		Exams.add(new APExams("Psychology", "May 19th", 4));
	}

}
