/**
 * Необходимо вывести на экран числа от 1 до 5.  
 */
package task03;

public class Task01 {

	public static void main(String[] args) {
		int x = 1, y = 5;

		System.out.println(String.format("Numbers from %1$d to %2$d", x, y));
		for (int i = x; i <= y; i++) {
			System.out.println(i);
		}
	}

}
