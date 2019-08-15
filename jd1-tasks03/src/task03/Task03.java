/**
 *  Необходимо вывести на экран таблицу умножения на 3 
 */
package task03;

public class Task03 {

	public static void main(String[] args) {

		int x = 3;
		System.out.println(String.format("Multiplication table by %1$d:", x));
		for (int i = 0; i <= 10; i++) {
			System.out.println(String.format("%1$2d x %2$2d = %3$2d", i, x, i * x));
		}
	}
}
