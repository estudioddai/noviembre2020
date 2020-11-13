package paquete;

import java.util.Scanner;

/* * se desea enviar un paquete a distintos departamentos de mendoza
 * cada zona tiene un precio
 * godoy_cruz$150
 * ciudad$20
 * peso máximo de 3 kilogramos. Se desea calcular el costo del envío por peso...
 */


public class Envio{
	private static final int godoy_cruz = 10;
	private static final int ciudad= 20;
	private static final float PESO_MAXIMO = 5;

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ingrese peso:");
		float peso=sc.nextFloat();
		
		if(peso >0&&peso<=PESO_MAXIMO) {
			System.out.println("ingrese zona 1: godoy_cruz o 2: dad");
			
			int  zona=sc.nextInt();
			
			
			float costoEnvio=0;
			
			switch(zona) {
			case 1:
			costoEnvio=peso *godoy_cruz;// 2 * 10; 5*10; 
			break;
			case 2:
			costoEnvio =peso*ciudad;
			break;
			
			}
			System.out.println("el costo del envio es"+costoEnvio);
			
		} 		else {
			System.out.println("sin servicio");
			
		}
		
			
		
		
		}
}



		