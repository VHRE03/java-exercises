
/*
	Calcular el factorial de un número positivo.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Programa para calcular el factorial de un número positivo");
		System.out.print("Ingrese un número: ");
		int number = input.nextInt();

		if (number < 0){
			System.out.println("El número es negativo o cero, no se puede calcular su factorial");
			return;
		}

		int factorial = 1;
		for (int i = number; i > 0; i--){
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + number + " es " + factorial);
	}
}
