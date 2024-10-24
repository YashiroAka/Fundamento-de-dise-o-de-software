package ejercicio1;
//Gomez Tarazona Paula Lucia
//Mondragon Rey Nicolas Jacobo
public class Ahorro extends Cuenta implements Retiro, Deposito{
	
	private long interes;
	
	public Ahorro(int numero, int añoapertura, Titular titular) {
		super(numero, añoapertura, titular);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void depositar(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			interes+=(valor*0.03);
			saldo+=valor;
		}else {
			System.out.println("valor no valido");
		}
	}

	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if(valor<saldo) {
			saldo-=valor;
		}else {
			System.out.println("monto de retiro no valido");
		}
	}
	@Override
	public String toString() {
		return "Numero de cuenta "+numero+" - año apertura "+añoapertura+ " - titular: "+titular.getNombre()+" "+titular.getApellido()+
				" - de la cuenta tipo ahorro";
	}
}
