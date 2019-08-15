/**
 * С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно. 
 */
package task03;

public class Task04 {

	public static void main(String[] args) {
		int min = 2, max = 100, i;
		i = min;
		while (i <= max) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
