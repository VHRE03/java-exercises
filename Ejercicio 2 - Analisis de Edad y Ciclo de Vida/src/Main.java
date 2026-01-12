/*
	Ejercicio 2: Análisis de Edad y Ciclo de Vida
	Solicitar nombre y edad del usuario, mostrar:
	- Si es mayor o menor de edad
	- Años restantes para jubilarse (65 años)
	- Mensaje personalizado según edad
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String name = input.nextLine();
		int age = 0;
		while (age == 0){
			System.out.print("Ingrese su edad: ");
			age = input.nextInt();
		}

		System.out.print(
			name + "\n" +
			(age >= 18 ? "Es mayor de edad": "Es menor de edad") + "\n" +
			"Años restantes para jubilarse: " + (65 - age) + "\n"
		);
	}
}
