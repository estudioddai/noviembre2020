package ejerciciovector;

import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {

		int vector[] = new int[5];

		Scanner sc = new Scanner(System.in);
		int j = 0;
		for (j = 0; j < vector.length; j++) {
			System.out.println("Ingrese los valores de 5 números" + (j + 1));
			vector[j] = sc.nextInt();
			int acumulador = vector[j];

			// System.out.println("La suma de todos los números es: " + vector[j]);

		}
		int suma = 0;
		for (j = 0; j < vector.length; j++) {
			suma = suma + vector[j];
			// System.out.println("La suma de todos los números es: " + suma); lo pusismos
			// de chotas. Si lo dejamos acá suma de uno en uno los valores.....

		}
		sc.close();
		System.out.println("La suma de todos los números es: " + suma);
	}

}