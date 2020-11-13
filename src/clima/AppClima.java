package clima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Realicé números random para cantidad de lluvias y temperatura para una semana. 

public class AppClima {

	public static void main(String[] args) {
		List<Medicion> mediciones = new ArrayList<Medicion>();
		Random randomSol = new Random();
		Random randomLluvia = new Random();

		Medicion medicion;
		for (int i = 0; i < 7; i++) {
			int lluvia = randomLluvia.nextInt(10);
			int temperatura = randomSol.nextInt(30);
			
			medicion = new Medicion(temperatura,lluvia);
			mediciones.add(medicion);
		}
		
		for (Medicion itemMedicion : mediciones) {
			System.out.println(itemMedicion);
			
		}

	}
}
