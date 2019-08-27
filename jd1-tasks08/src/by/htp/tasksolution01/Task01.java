package by.htp.tasksolution01;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 * 
 * @author s.kisel
 *
 */

public class Task01 {

	public static void main(String[] args) {
		int changedNumberA = 5, changedNumberB = 10;

		Test1 test1 = new Test1();
		test1.setNumA(changedNumberA);
		test1.setNumB(changedNumberB);
		test1.print();
		int sum = test1.getSum();
		System.out.println("Сумма элементов: " + sum);
		int max = test1.getMax();
		System.out.println("Максимальный элемент: " + max);
	}

}
