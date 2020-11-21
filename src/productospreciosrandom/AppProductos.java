package productospreciosrandom;

import java.util.Random;

/*
	 * Se venden productos por la web de la empresa. Se dispone de 100 productos con codigo numerico. Esos productos 
	 * tiene un codigo secuencial desde 1 a 100 y un precio que oscila entre 5 y 20 pesos.
	 * Realizar un algoritmo que venda 10 productos al azar con una cantidad determinada y calcule el precio
	 * total de la operación
	 * 
	 * Aleatorios para numeros enteros
	 * Aleatorios para numeros decimales (double)
	 */
public class AppProductos {

	public static void main(String[] args) {
		Producto[] productos = new Producto[100];

		for (int i = 0; i < productos.length; i++) {
			int codigo = i + 1;
			Random r = new Random();
			double randomValue = 5 + (20 - 5) * r.nextDouble();
			productos[i] = new Producto(codigo, randomValue);

		}
		for (int i = 0; i < 10; i++) {
			int numero = (int) (Math.random() * 100 + 1);
			System.out.println(numero);
			System.out.print(productos[numero - 1]);
		}

	}

}
