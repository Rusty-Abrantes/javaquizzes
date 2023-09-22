package javaQuiz2;

public class Student extends Person{
	public void sendEmail() {
		System.out.println(this + "Student sendEmail");
	}
	
	public void depositAllowance() {
		System.out.println(this + "Student depositAllowance");
		allowance += LIVING_COST;
	}
}
