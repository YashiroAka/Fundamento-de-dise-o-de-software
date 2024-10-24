package ejercicio1;

import java.util.ArrayList;

public class Appbanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titular tit1 = new Titular ("juan","castillo","jucas@gmail",001);
		Titular tit2 = new Titular ("felipe","lopez","felopez@gmail",002);
		Titular tit3 = new Titular ("camila","rodriguez","camiro@gmail",003);
		Titular tit4 = new Titular ("sue","sparkle","lasustancia@gamil",004);
		
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		
		Vivienda cuenta1 = new Vivienda (100,2020,tit1, 1000000, "aparta-estudio");
		lista.add(cuenta1);
		Corriente cuenta2 = new Corriente (200,2012,tit2);
		lista.add(cuenta2);
		Ahorro cuenta3 = new Ahorro (300,2018,tit3);
		lista.add(cuenta3);
		Nomina cuenta4 = new Nomina (400,1980,tit4,"pump it up",200000000);
		lista.add(cuenta4);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		System.out.println(cuenta4);
	}

}
