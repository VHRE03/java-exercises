/*
Ejercicio 1: Calculadora de Operaciones Básicas Enunciado
Crear un programa que solicite dos números enteros y muestre:
- Suma
- Resta
- Multiplicación
- División (validando división entre cero)
- Módulo
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ingresa el primer número: ");
		float number1 = input.nextInt();
		System.out.print("Ingresa el segundo número: ");
		float number2 = input.nextInt();

		System.out.println("Addition: " + (number1 + number2));
		System.out.println("Subtraction" + (number1 - number2));
		System.out.print(
			"Addition: " + (number1 + number2) + "\n" +
				"Subtraction: " + (number1 - number2) + "\n" +
				"Multiplication: " + (number1 * number2) + "\n" +
				"Division: " + (number2 != 0 ? (number1 / number2) : "No es posible dividir si el segundo número es 0") + "\n" +
				"Mod: " + (number2 != 0 ? (number1 % number2) : "No es posible otener el residuo si el segundo número es 0") + "\n"
		);
	}
}