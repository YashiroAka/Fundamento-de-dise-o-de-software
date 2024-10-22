package Banco;

public class Ahorro extends Cuenta implements retiro, deposito{
	
	private long interes;

	public Ahorro(int numero, String titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(long valor) {
		// TODO Auto-generated method stub
		if(valor>0) {
			saldo+=valor;
			interes+=saldo*0.03;
		}else{
			System.out.println("valor no valido");
		}

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
