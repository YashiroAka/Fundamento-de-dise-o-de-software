package ejercicio1;
//Gomez Tarazona Paula Lucia
//Mondragon Rey Nicolas Jacobo
public class Vivienda extends Cuenta implements Deposito {
	
	private long precio;
	private String tipo;
	
	public Vivienda(int numero, int añoapertura, Titular titular,long precio, String tipo) {
		super(numero, añoapertura, titular);
		// TODO Auto-generated constructor stub
		this.precio=precio;
		this.tipo=tipo;
	}
	@Override
	public void depositar(long valor) {
		// TODO Auto-generated method stub
		if(precio>saldo) {
			saldo+=valor;
		}else {
			if(precio<=saldo) {
				System.out.println("Monto maximo alcanzado");
			}
		}
	}
	@Override
	public String toString() {
		return "Numero de cuenta "+numero+" - año apertura "+añoapertura+ " - titular: "+titular.getNombre()+" "+titular.getApellido()+
				" - de la cuenta tipo vivienda";
	}
}
