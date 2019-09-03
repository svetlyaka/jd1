package by.htp.tasksolution03;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 * 
 * @author s.kisel
 *
 */
public class Task03 {

	public static void main(String[] args) {

		Student[] students = new Student[10];
		int[] marks = new int[] { 9, 10 };
		students[0] = new Student("Alvaro Pavis", "6060", new int[] { 9, 8, 10, 9, 9, 8 });
		students[1] = new Student("Yolando Kravchuk", "6061");
		students[2] = new Student("Vena Lamell", "6063");
		students[2].setALLMarks(8);
		students[3] = new Student("Lon Coutino", "6062");
		students[4] = new Student("Eloise Carparelli", "6062");
		students[5] = new Student("Darlena Lorn", "6061");
		students[5].setALLMarks(9);
		students[6] = new Student("William Kressly", "6060");
		students[7] = new Student("Leota Hurston", "6061", new int[] { 9, 10, 10, 9, 9, 10 });
		students[8] = new Student("Winifred Wilsom", "6064");
		students[9] = new Student("Twanda Leonel", "6063");
		students[9].setALLMarks(10);

		printHonoursPupil(students, marks);
	}

	public static void printHonoursPupil(Student[] students, int[] marks) {
		boolean isStudentAHonoursPupil;
		for (int i = 0; i < students.length; i++) {
			isStudentAHonoursPupil = students[i].areAllMarkExcelent();
			if (isStudentAHonoursPupil) {
				students[i].print();
			}
		}
	}

}
