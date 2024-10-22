package Banco;

public class Cuenta {
	protected int numero;
	protected String titular;
	protected long saldo=0;
	public Cuenta(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Cuenta " + numero + " de titular " + titular + " tiene saldo de: " + saldo + " $";
	}
}
