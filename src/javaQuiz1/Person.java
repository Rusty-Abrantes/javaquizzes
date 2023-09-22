package javaQuiz1;

public class Person {
	private String lastName;
	private String firstName;
	private Character middleInitial;
	private Date birthDate;
	
	public Person(String lastName, String firstName, Character middleInitial, Date birthDate) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.birthDate = birthDate;
	}
	
	public void setBirthdate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public String toString() {
		return "Name: " + lastName + ", " + firstName + " " + middleInitial + ". \nBirthDate: " + birthDate;
	}
}
