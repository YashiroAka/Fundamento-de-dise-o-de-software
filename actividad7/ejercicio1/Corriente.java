package ejercicio1;
import java.time.LocalDate;
//Gomez Tarazona Paula Lucia
//Mondragon Rey Nicolas Jacobo
public class Corriente extends Cuenta implements Deposito, Retiro {
	
	private LocalDate ultimomov;
	private long valorultimo;
	
	public Corriente(int numero, int añoapertura, Titular titular) {
		super(numero, añoapertura, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if(valor<saldo) {
			saldo-=valor;
			ultimomov=LocalDate.now();
			valorultimo=valor;
		}else {
			System.out.println("monto de retiro no valido");
		}
	}

	@Override
	public void depositar(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			valorultimo=valor;
			saldo+=valor;
			ultimomov=LocalDate.now();
		}else {
			System.out.println("valor no valido");
		}
	}

	@Override
	public String toString() {
		return "Numero de cuenta "+numero+" - año apertura "+añoapertura+ " - titular: "+titular.getNombre()+" "+titular.getApellido()+
				" - de la cuenta tipo corriente";
	}
}
