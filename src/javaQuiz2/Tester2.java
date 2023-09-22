package javaQuiz2;

public class Tester2 {

	public static void main(String[] args) {
		Person person1 = new Student();
		Person person2 = new PostGradStudent();
		Student student1 = new Student();
		Student student2 = new PostGradStudent();
		Staff staff1 = new Staff();
		Object obj1 = new Student();
		//((PostGradStudent)staff1).depositAllowance(); - the statement causes a compile error; hence the program is not executable
		((Student)person2).depositAllowance();
		//((PostGradStudent)obj1).sendEmail(); - the statement causes a runtime exception; hence the program 

	}

}
