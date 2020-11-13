package inicio.minecraft;

public class Revolver extends Arma implements Recargable {

	@Override
	public int disparar(int municiones) {
		int tiros =0;
		while(tiros <=municiones) {
			tiros--;
		}
	}
}
