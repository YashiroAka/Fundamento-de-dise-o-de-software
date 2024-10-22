package Banco;

public class Corriente extends Cuenta implements retiro, deposito {
	
	private long sobregiro;

	public Corriente(int numero, String titular,long sobregiro) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
		this.sobregiro=sobregiro;
	}

	@Override
	public void depositar(long valor) {
		// TODO Auto-generated method stub
		if(valor>0){
			saldo+=valor;
		}
		else{
			System.out.println("valor no valido");
		}
	}

	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if((saldo+sobregiro)>0) {
			saldo-=valor;
		}
		else {
			System.out.println("El retiro no se puede realizar");
		}

	}

}
