
/*
	Leer un número entero y determinar:
	- Si es positivo, negativo o cero
	- Si es par o impar
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		int number = input.nextInt();

		if (number > 0) {
			System.out.println("El número es positivo");
		} else if (number < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es cero");
			System.out.println("El número es cero, no es par ni impar");
			return;
		}

		if (number % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
}
