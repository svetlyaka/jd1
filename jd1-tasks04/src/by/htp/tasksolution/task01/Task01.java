package by.htp.tasksolution.task01;

/**
 * ����������� ����� ������������ ����� ������. �������� ����� ��� ����������
 * ��� �������.
 * 
 * @author s.kisel
 *
 */
public class Task01 {

	public static void main(String[] args) {
		Point pointA = new Point(1, 3);
		Point pointB = new Point(2, -5);
		Point pointC = new Point(-8, 4);
		double result;
		result = getSquare(pointA, pointB, pointC);
		System.out.print("Result : " + result);
	}

	static double getSquare(Point x, Point y, Point z) {
		return 0.5 * Math.abs((x.getX() - z.getX()) * (y.getY() - z.getY()) - (y.getX() - z.getX()) * (x.getY() - z.getY()));
	}

}