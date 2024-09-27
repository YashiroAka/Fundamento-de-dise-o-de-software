package ajencia;

import java.util.ArrayList;

public class Vuelo {
	private int numero;
	private Ciudad salida;
	private Ciudad llegada;
	private int hora_salida;
	private int duracion;
	private Piloto piloto;
	private ArrayList<Silla> lista_pasajeros;
	private int nsilla;
	public Vuelo(int numero, Ciudad salida, Ciudad llegada, int hora_salida, int duracion, Piloto piloto,int nsilla) {
		super();
		this.numero = numero;
		this.salida = salida;
		this.llegada = llegada;
		this.hora_salida = hora_salida;
		this.duracion = duracion;
		this.piloto = piloto;
		this.lista_pasajeros =new ArrayList<Silla>();
		this.nsilla = nsilla;
	}
	
	public int getNsilla() {
		return nsilla;
	}

	public void setNsilla(int nsilla) {
		this.nsilla = nsilla;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Ciudad getSalida() {
		return salida;
	}
	public void setSalida(Ciudad salida) {
		this.salida = salida;
	}
	public Ciudad getLlegada() {
		return llegada;
	}
	public void setLlegada(Ciudad llegada) {
		this.llegada = llegada;
	}
	public int getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(int hora_salida) {
		this.hora_salida = hora_salida;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public ArrayList<Silla> getLista_pasajeros() {
		return lista_pasajeros;
	}

	public void setLista_pasajeros(ArrayList<Silla> lista_pasajeros) {
		this.lista_pasajeros = lista_pasajeros;
	}

	@Override
	public String toString() {
		return "Vuelo [numero=" + numero + ", salida=" + salida + ", llegada=" + llegada + ", hora_salida="
				+ hora_salida + ", duracion=" + duracion + ", piloto=" + piloto + ", nsilla=" + nsilla + "]";
	}
	
	public void asignarsilla (Silla silla) {
		if(lista_pasajeros.size()< nsilla)
			lista_pasajeros.add(silla);
		else
			System.out.println("no hay mas sillas");
	}
	
	public void lista_pasajeros() {
		System.out.println("vuelo: "+this.numero);
		System.out.println("salio de: "+this.salida);
		System.out.println("hora salida: "+this.hora_salida);
		
		for (Silla silla : lista_pasajeros) {
			System.out.println(silla);
		}
	}
}
