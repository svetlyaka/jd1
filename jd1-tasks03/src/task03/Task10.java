package task03;

/**
 * ��������� ��������� ���������� ������������ ��������� ������ ������� �����.
 *
 */
public class Task10 {

	public static void main(String[] args) {
		int result = 1, min = 1, max = 20;

		for (int i = min; i <= max; i++) {
			result *= Math.pow(i, 2);

		}
		System.out.println("Result :" + result);
	}

}
