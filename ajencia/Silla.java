package ajencia;

public class Silla {
	private char letra;
	private int num;
	private Pasajero pasajero;
	
	public Silla(char letra, int num, Pasajero pasajero) {
		super();
		this.letra = letra;
		this.num = num;
		this.pasajero = pasajero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		return "Silla [letra=" + letra + ", num=" + num + ", pasajero=" + pasajero + "]";
	}
	
}
