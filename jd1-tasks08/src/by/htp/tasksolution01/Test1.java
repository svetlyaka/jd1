package by.htp.tasksolution01;

public class Test1 {
	private int numberA;
	private int numberB;

	Test1() {
		this.numberA = 0;
		this.numberB = 0;
	}

	public void setNumA(int number) {
		this.numberA = number;
	}

	public void setNumB(int number) {
		this.numberB = number;
	}

	public void print() {
		System.out.println(String.format("numberA : %d numberB: %d", numberA, numberB));
	}

	public int getSum() {
		return numberA + numberB;
	}

	public int getMax() {
		if (numberA > numberB) {
			return numberA;
		} else {
			return numberB;
		}
	}

}
