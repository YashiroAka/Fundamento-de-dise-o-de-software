package ejercicio1;
//Gomez Tarazona Paula Lucia
//Mondragon Rey Nicolas Jacobo
public class Cuenta {
	protected int numero;
    protected int añoapertura;
    protected long saldo;
    protected Titular titular;
	public Cuenta(int numero, int añoapertura,Titular titular) {
		super();
		this.numero = numero;
		this.añoapertura = añoapertura;
		this.titular=titular;
	}
}
