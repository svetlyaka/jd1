package by.htp.tasksolution02;

public class Test2 {

	private int numberA;
	private int numberB;

	Test2() {
		this.numberA = 0;
		this.numberB = 0;
	}

	Test2(int numberA, int numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}

	public void setNumA(int number) {
		this.numberA = number;
	}

	public void setNumB(int number) {
		this.numberB = number;
	}

	public int getNumA() {
		return numberA;
	}

	public int getNumB() {
		return numberB;
	}

}
