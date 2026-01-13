
/*
	Leer tres números y mostrar:
	- El mayor
	- El menor
	- El promedio
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Ingresa el primer número: ");
		float number1 = input.nextFloat();

		System.out.print("Ingresa el segundo número: ");
		float number2 = input.nextFloat();

		System.out.print("Ingresa el tercer número: ");
		float number3 = input.nextFloat();

		float maxNumber = number1;
		float minNumber = number1;
		if (number2 > maxNumber){
			maxNumber = number2;
		}else if (number2 < minNumber){
			minNumber = number2;
		}

		if (number3 > maxNumber){
			maxNumber = number3;
		}else if (number3 < minNumber){
			minNumber = number3;
		}

		System.out.print(
			"Número mayor: " + maxNumber + "\n" +
			"Número menor: " + minNumber + "\n" +
			"Promedio: " + ((number1 + number2 + number3) / 3)
		);
	}
}
