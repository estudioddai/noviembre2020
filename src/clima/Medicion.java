package clima;

public class Medicion {

	private int temperatura;
	private int lluvia;

	public Medicion(int temperatura, int lluvia) {
		this.temperatura = temperatura;
		this.lluvia = lluvia;

	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getLluvia() {
		return lluvia;

	}

	public void setLluvia(int Lluvia) {
		this.lluvia = lluvia;
	}
	public String toString() {
		return"Lluvia: " + lluvia + " Temperatura: " + temperatura;
	}
}
