/**
 * � ������� ��������� while �������� ��������� ������ ���� ������ ����� � ��������� �� 2 �� 100 ������������. 
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
