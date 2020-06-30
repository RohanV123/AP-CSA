
public class APExams {

	private String subject;
	private String date;
	private int scorewanted;
	
	public APExams(String s, String d, int score) {
		this.subject = s;
		this.date = d;
		this.scorewanted = score;
	}
	
	public String getSubject() {
		return subject;
	}
	public String getDate() {
		return date;
	}
	public int getScore() {
		return scorewanted;
	}
}
