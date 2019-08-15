package by.htp.solution02;

import java.util.Scanner;

/**
 * Написать программу — модель анализа пожарного датчика в помещении, которая
 * выводит сообщение «Пожароопасная ситуация », если температура в комнате
 * превысила 60° С.
 *
 */
public class Task25 {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter t: ");
		t = sc.nextInt();
		if (t > 60) {
			System.out.println("Пожароопасная ситуация");
		}
		sc.close();
	}

}
