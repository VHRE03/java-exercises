
/*
	Leer números hasta que el usuario ingrese `0` y mostrar:
	- Total de números ingresados
	- Suma total
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int count = 0;
		int accumulatedSum = 0;

		System.out.println("Programa que lee números hasta que se ingresa un 0");
		do {
			System.out.print("Ingrese un numero: ");
			number = input.nextInt();

			if(number != 0){
				count++;
				accumulatedSum = accumulatedSum + number;
			}
		} while (number != 0);

		input.close();

		System.out.print(
			"Total de números ingresados: " + count + "\n" +
			"Suma acumulada de los números ingresados: " + accumulatedSum
		);
	}
}
