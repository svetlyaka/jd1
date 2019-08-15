/**
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
 */
package task01;

public class Task07 {

	public static void main(String[] args) {

		int width = 4, length, square;
		length = width * 2;
		square = length * width;
		System.out.print("Result(square): " + square);
	}

}
