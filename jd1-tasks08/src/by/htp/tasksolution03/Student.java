package by.htp.tasksolution03;

import java.util.Random;

public class Student {

	private String fullName;
	private String groupNumber;
	private int[] academicPerformance = new int[5];

	Student(String fullName, String groupNumber) {
		this.fullName = fullName;
		this.groupNumber = groupNumber;
		Random rand = new Random();
		for (int i = 0; i < academicPerformance.length; i++) {
			this.academicPerformance[i] = rand.nextInt(10) + 1;
		}
	}

	Student(String fullName, String groupNumber, int[] academicPerformance) {
		this.fullName = fullName;
		this.groupNumber = groupNumber;
		this.academicPerformance = academicPerformance;
	}

	public void print() {
		System.out.println(String.format("Full name: %s Group number: %s", this.fullName, this.groupNumber));
	}

	public void printFullInfo() {
		System.out.print(String.format("\nFull name: %s Group number: %s Academic performance: ", this.fullName,
				this.groupNumber));
		for (int i = 0; i < academicPerformance.length; i++) {
			System.out.print(String.format(this.academicPerformance[i] + " "));
		}
		System.out.println();
	}

	public void setALLMarks(int mark) {
		for (int i = 0; i < academicPerformance.length; i++) {
			this.academicPerformance[i] = mark;
		}
	}

	public int[] getAcademicPerformance() {
		return this.academicPerformance;
	}

}
