
/*
	Solicitar un carácter y determinar si es:
	- Vocal
	- Consonante
	- No es una letra
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ingresa un carácter: ");
		char character = input.next().charAt(0);
		input.close();

		character = Character.toLowerCase(character);

		if (!Character.isLetter(character)) {
			System.out.println("No es una letra");
		} else if (
			character == 'a' ||
			character == 'e' ||
			character == 'i' ||
			character == 'o' ||
			character == 'u'
		) {
			System.out.println("Es una vocal");
		}else {
			System.out.println("Es una consonante");
		}
	}
}
