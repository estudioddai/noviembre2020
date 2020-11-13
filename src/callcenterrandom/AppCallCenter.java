package callcenterrandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Se desea conocer en cada uno de los días del mes la cantidad de reclamos y ventas que serán random
// en total son 30 días

public class AppCallCenter {
	
	public static void main(String[] args) {

	List<Llamada> calls = new ArrayList<Llamada>();
	Random randomVenta = new Random();
	Random randomReclamo = new Random();

	Llamada call;for(
	int i = 0;i<30;i++)
	{

		int ventas = randomVenta.nextInt(99)+1; //el +1 es para que lea el numero 99
		int reclamos = randomReclamo.nextInt(200); //en éste caso llega al 199

		call = new Llamada(ventas, reclamos);
		calls.add(call);

	}calls.forEach((el)->
	{
				System.out.println(el);
	});
}
}
