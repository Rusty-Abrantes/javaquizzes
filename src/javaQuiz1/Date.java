package javaQuiz1;

public class Date {
	
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int dayOfWeek() {
		int t, mm, dd, yy, cc;
		mm = month;
		yy = year;
		if(mm < 3) {
			mm = mm + 12;
			yy = yy - 1;
		}
		cc = (int)(yy/100);
		yy = yy % 100;
		t = day + (int) (26 * (mm + 1) / 10) + yy;
		t = t + (int) (yy / 4) + (int) (cc / 4) - 2 * cc;
		dd = t % 7;
		if(dd < 0) 
			dd = dd + 7;
			return dd;
		
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}
