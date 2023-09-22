package javaTimer;

public class CascadedCounter extends Counter{
	private Counter leftSide;

	CascadedCounter(int value, int limit, String label) {
		super(value, limit, label);
	}
	
	public void countUp() {
		if((getValue() + 1 == getLimit()) && (leftSide != null)){
			leftSide.countUp();
		}
		super.countUp();
	}
	
	public void countDown() {
		if((getValue() > 0) && (leftSide != null)) {
			leftSide.countDown();
		}
		super.countDown();
	}
	
	public void resetValue() {
		super.resetValue();
		if(leftSide != null) {
			leftSide.resetValue();
		}
	}
	
	public void connectLeft(Counter leftSide) {
		this.leftSide = leftSide;
	}
	
	public void disconnectLeft() {
		this.leftSide = null;
	}

}
