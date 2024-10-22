package Banco;

public class Nomina extends Cuenta implements retiro{

	public Nomina(int numero, String titular,int saldo) {
		super(numero, titular);
		this.saldo=saldo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if (saldo>=valor) {
			saldo-=valor;
		}else {
			System.out.println("el retiro no se puede realizar");
		}
	}

}
