package javaQuiz1;

public class BirthDayRooster {
	static String[] day = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	
	public static void main(String[] args) {
		Employee[] emp = {new Employee("IT", "Dela Cruz", "John", 'X', new Date(7, 8, 1974)), 
				new Employee("AC", "Victoria", "Glenda", 'Y', new Date(4, 29, 1980)),
				new Employee("HR", "Hillary", "Brent", 'Z', new Date(10, 25, 1991)), 
				new Employee("UN", "John", "Doe", 'A', new Date(1, 20, 1901))};
		
		for (Employee e : emp) {
			System.out.println(e + " (" + day[e.getBirthDate().dayOfWeek()] + ") ");
			System.out.println();
		}
	}

}
