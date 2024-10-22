package Banco;

public class Appbanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ahorro cuenta1 = new Ahorro(001, "sebastian");
		Corriente cuenta2 = new Corriente(002, "juan", 5000000);
		Nomina cuenta3 = new Nomina(003, "katy", 9000000);
		Vivienda cuenta4 = new Vivienda(004, "selena");

		//consignacion negativa
		cuenta1.depositar(-200);
		cuenta2.depositar(-200);
		cuenta4.depositar(-200);

		//deposito exitoso
		cuenta1.depositar(100000);
		System.out.println(cuenta1);
		cuenta2.depositar(1000000);
		System.out.println(cuenta2);
		cuenta4.depositar(100000);
		System.out.println(cuenta4);

		//retiro no posible
		cuenta1.retirar(200000000);
		cuenta2.retirar(600000000);
		cuenta3.retirar(1000000000);

		//retiro exitoso
		cuenta1.retirar(500);
		System.out.println(cuenta1);
		cuenta2.retirar(500);
		System.out.println(cuenta2);
		cuenta3.retirar(500);
		System.out.println(cuenta3);
	}

}
