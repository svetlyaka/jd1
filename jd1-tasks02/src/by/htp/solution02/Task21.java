package by.htp.solution02;

import java.util.Scanner;

/**
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 *
 */
public class Task21 {

	public static void main(String[] args) {
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		x = sc.next();
		if (x.equals("Д")) {
			System.out.println("Мне нравятся мальчики!");
		} else if (x.equals("М")) {
			System.out.println("Мне нравятся девочки!");
		}
		sc.close();
	}

}
