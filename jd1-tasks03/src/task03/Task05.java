/**
 *  � ������� ��������� while �������� ��������� ����������� ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������. 
 */
package task03;

public class Task05 {

	public static void main(String[] args) {
		int min = 1, max = 100, i;
		i = min;
		while (i < max) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}

}
