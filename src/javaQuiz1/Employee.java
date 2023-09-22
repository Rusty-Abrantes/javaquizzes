package javaQuiz1;

public class Employee extends Person{
	private static int counter = 1;
	private int id;
	private String department;
	
	public Employee(String department, String lastName, String firstName, Character middleInitial, Date birthDate) {
		super(lastName, firstName, middleInitial, birthDate);
		id = counter++;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDepartment() {
		return department;
	}

	public String toString() {
		return "ID: " + getId() + "\nDepartment: " + getDepartment() + "\n" + super.toString();
	}
}
