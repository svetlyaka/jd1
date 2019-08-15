/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  sin x + cos y
 *  ------------- * tg xy
 *  cos x - sin y
 */
package task01;

public class Task10 {

	public static void main(String[] args) {

		double x = 60.0, y = 0.0, result;
		double radianX, radianY, radianXY;
		radianX = Math.toRadians(x);
		radianY = Math.toRadians(y);
		radianXY = Math.toRadians(x * y);
		result = (Math.sin(radianX) + Math.cos(radianY)) / (Math.cos(radianX) - Math.sin(radianY)) * Math.tan(radianXY);
		System.out.println("Result: " + result);
	}

}
