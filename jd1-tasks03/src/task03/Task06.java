package task03;

/*
 *  �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ��������� ��� ����� �� 1 
 *  �� ���������� ������������� �����. 
 */
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		int min = 1, max, i, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		max = scan.nextInt();
		i = min;
		while (i <= max) {
			result += i;
			i++;
		}
		System.out.println("Result: " + result);
		scan.close();
	}

}
