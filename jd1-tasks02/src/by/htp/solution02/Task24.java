package by.htp.solution02;

import java.util.Scanner;

/**
 * Составить программу, определяющую результат гадания на ромашке — «любит—не
 * любит», взяв за исходное данное количество лепестков п.
 *
 */
public class Task24 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.print("Любит");
		} else {
			System.out.print("Не л2юбит");
		}
		sc.close();
	}

}
