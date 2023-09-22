package javaQuiz1Retake;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SpecialNumbers {
	private final int[] numbers;
	private int length = 0;
	
	public SpecialNumbers(int capacity){
		numbers = new int[capacity];
	}
	
	public void conditionalAdd(int newElement) {
		for(int i = 0; i < length; i++) {
			if(numbers[i] == newElement) {
				throw new IllegalStateException(newElement + " already exists");
			}
		}
		if(length == numbers.length) {
			throw new IllegalStateException("Capacity is full");
		}
		// Successful entry of unique number
		numbers[length++] = newElement;
	}
	
	public int getCapacity() {
		return numbers.length;
	}
	
	public Double median() {
		if(isEmpty()) {
			throw new NoSuchElementException("no number");
		}
		// Create a copy with mentioned quantity of elements from beginning
		int[] temp = Arrays.copyOf(numbers, length);
		Arrays.sort(temp); // Sorts the array in ascending order
		if(temp.length % 2 == 0) {
			return (temp[temp.length/2] + temp[temp.length/2 - 1]) / 2.0;
		}
		else {
			return temp[temp.length/2] * 1.0;
		}
	}
	
	public int nth(int n) {
		if(isEmpty()) {
			throw new NoSuchElementException("no numbers");
		}
		if(n > length) {
			n = length;
		}
		else if(n < 1) {
			n = 1;
		}
		// Create a copy with mentioned quantity of elements from beginning
		int[] temp = Arrays.copyOf(numbers, length);
		// Partial sort up to n-th element
		for (int i = 1; i <= n; ++i) {
			int minLocation = i -1;
			for(int j = minLocation + 1; j < temp.length; ++j) {
				if(temp[j] < temp[minLocation]) {
					minLocation = j;
				}
			}
				if(i - 1 != minLocation) {
					int backup = temp[i - 1];
					temp[i - 1] = temp[minLocation];
					temp[minLocation] = backup;
				}
		}
		return temp[n - 1];
	}
	
	public int[] getNumbers() {
		return Arrays.copyOf(numbers, length);
	}
	
	public int getLength() {
		return length;
	}
	
	private boolean isEmpty() {
		return getLength() == 0;
	}
	
	public String toString() {
		return Arrays.toString(getNumbers());
	}
	
	private SpecialNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public SpecialNumbers subNumbers(int start, int end) {
		if(start < 1) {
			start = 1;
		}
		if(end > getLength()) {
			end = getLength();
		}
		if(start > end) {
			throw new IllegalArgumentException();
		}
		int[] subarray = Arrays.copyOfRange(numbers, start - 1, end);
		SpecialNumbers subNumbers = new SpecialNumbers(subarray);
		subNumbers.length = subarray.length;
		return subNumbers;
	}
}
