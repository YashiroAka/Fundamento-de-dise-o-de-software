package ajencia;

public class Piloto {
	private String nombre;
	private int horas_vuelo;
	
	public Piloto(String nombre, int horas_vuelo) {
		super();
		this.nombre = nombre;
		this.horas_vuelo = horas_vuelo;
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", horas_vuelo=" + horas_vuelo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras_vuelo() {
		return horas_vuelo;
	}

	public void setHoras_vuelo(int horas_vuelo) {
		this.horas_vuelo = horas_vuelo;
	}
}
