/**
 * Необходимо вывести на экран числа от 5 до 1.  
 */
package task03;

public class Task02 {

	public static void main(String[] args) {

		int x = 1, y = 5;

		System.out.println(String.format("Numbers from %1$d to %2$d:", y, x));
		for (int i = y; i >= x; i--) {
			System.out.println(i);
		}
	}

}
