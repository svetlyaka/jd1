/**
 *  Ќаписать код дл€ решени€ задачи. ¬ n малых бидонах 80 л молока. —колько литров молока в m больших бидонах,
 *   если в каждом большом бидоне на 12 л. больше, чем в малом? 
 */
package task01;

public class Task06 {

	public static void main(String[] args) {

		int n = 2, m = 3, x, y, result;
		x = 80 / n;
		y = x + 12;
		result = m * y;
		System.out.println("Result: " + result);
	}

}
