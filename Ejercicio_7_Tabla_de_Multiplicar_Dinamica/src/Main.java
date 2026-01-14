
/*
	Leer un número y mostrar su tabla de multiplicar del 1 al 10.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Programa para obtener la tabla de multiplicar de un número");
		System.out.print("Ingrese un número: ");
		int number = input.nextInt();
		input.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + number + " = " + i * number);
		}
	}
}
