
public class CandyJar {

	private String brand;
	private int cal;
	private boolean sour;
	
	public CandyJar(String b, int c, boolean s) {
		this.brand = b;
		this.cal = c;
		this.sour = s;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getCal() {
		return cal;
	}
	public boolean getSour() {
		return sour;
	}
}
