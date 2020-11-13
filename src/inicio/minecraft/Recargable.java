package inicio.minecraft;

public interface Recargable {
	
	default int recargar() {
		int municiones = 6;
		System.out.println("Pum pum pum");
		return municiones;
		
	}
	int disparar(int municiones);
		
	

}
