package by.htp.tasksolution01;

/**
 * �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� �
 * ������ ��������� ���� ����������. �������� �����, ������� ������� �����
 * �������� ���� ����������, � �����, ������� ������� ���������� �������� ��
 * ���� ���� ����������.
 * 
 * @author s.kisel
 *
 */

public class Task01 {

	public static void main(String[] args) {
		int changedNumberA = 5, changedNumberB = 10;

		Test1 test1 = new Test1();
		test1.setNumA(changedNumberA);
		test1.setNumB(changedNumberB);
		test1.print();
		int sum = test1.getSum();
		System.out.println("����� ���������: " + sum);
		int max = test1.getMax();
		System.out.println("������������ �������: " + max);
	}

}
