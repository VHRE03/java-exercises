
/*
	Solicitar una cadena y mostrar:
	- Longitud
	- Versión en mayúsculas
	- Versión en minúsculas
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Ingresa una cadena de texto: ");
		String inputString = input.nextLine();
		input.close();

		System.out.print(
			"Longitud de cadena: " + inputString.length() + "\n" +
			"Cadena en mayúsculas: " + inputString.toUpperCase() + "\n" +
			"Cadena en minúsculas: " + inputString.toLowerCase()
		);
	}
}
