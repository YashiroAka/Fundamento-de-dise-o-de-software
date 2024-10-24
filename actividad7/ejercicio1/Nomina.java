package ejercicio1;
import java.time.LocalDate;
//Gomez Tarazona Paula Lucia
//Mondragon Rey Nicolas Jacobo
public class Nomina extends Cuenta implements Retiro {
	
	private String empresa;
	private LocalDate ultimoret;
	
	public Nomina(int numero, int añoapertura, Titular titular, String empresa, long saldo) {
		super(numero, añoapertura, titular);
		// TODO Auto-generated constructor stub
		this.empresa=empresa;
		this.saldo=saldo;
	}
	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if(valor<saldo) {
			saldo+=valor;
			ultimoret=LocalDate.now();
		}else {
			System.out.println("fondos insuficientes");
		}
	}
	@Override
	public String toString() {
		return "Numero de cuenta "+numero+" - año apertura "+añoapertura+ " - titular: "+titular.getNombre()+" "+titular.getApellido()+
				" - de la cuenta tipo nomina";
	}
}
