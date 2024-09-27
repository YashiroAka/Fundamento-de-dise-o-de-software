package ajencia;

import java.util.ArrayList;

public class Agencia {
	public static ArrayList<Vuelo> lista_vuelos=new ArrayList<>();
	

	public static void main(String[] args) {
		Ciudad ciudad1 = new Ciudad(001,"bogota");
		Ciudad ciudad2 = new Ciudad(002,"ocaña");
		
		Piloto piloto = new Piloto("juan",5000);
		
		Vuelo vuelo1020 = new Vuelo (1020,ciudad1,ciudad2,4,2,piloto,10);
		
		Pasajero pasajero1 = new Pasajero (001,"leonardo",19,"masculino");
		
		Silla silla1 = new Silla('A',1,pasajero1);
		
		vuelo1020.asignarsilla(silla1);
		
		vuelo1020.lista_pasajeros();
	}

}
