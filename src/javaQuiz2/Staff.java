package javaQuiz2;

public class Staff extends Person{
	public void sendSMS() {
		System.out.println(this + "Staff sendSMS");
	}
	
	public void sendEmail() {
		System.out.println(this + "Staff sendEmail");
	}
	
	public String toString() {
		return "I am Staff";
	}
}
