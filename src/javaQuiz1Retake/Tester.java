package javaQuiz1Retake;

public class Tester {
	private static final int[] NUMBERS = { 20, 40, 10, 50, 30 };

	public static void main(String[] args) {
		SpecialNumbers sn = new SpecialNumbers(5);
		for(int e : NUMBERS) {
			sn.conditionalAdd(e);
		}
		System.out.println("numbers: " + sn);
		System.out.println("median: " + sn.median());
		for(int i = 1; i <= sn.getLength(); ++i) {
			System.out.println("nth(" + i + "): " + sn.nth(i));
		}
		System.out.println("nth(-5): " + sn.nth(-5));
		System.out.println("nth(100): " + sn.nth(100));
		
		SpecialNumbers sub = sn.subNumbers(2, 5);
		System.out.println("sub: " + sub.median());
		SpecialNumbers subsub = sub.subNumbers(2, 4);
		System.out.println("subsub: " + subsub.median());
	}

}
