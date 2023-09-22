package javaQuiz2;

public class Tester1 {
	public static void main(String[] args) {
		Person person1 = new Student();
		Person person2 = new PostGradStudent();
		Student student1 = new Student();
		Student student2 = new PostGradStudent();
		Staff staff1 = new Staff();
		Object obj1 = new Student();
		staff1.sendSMS();
		person1.sendEmail();
		person2.sendEmail();
		student1.sendEmail();
		student2.sendEmail();
		student1.depositAllowance();
		student2.depositAllowance();
	}
}
