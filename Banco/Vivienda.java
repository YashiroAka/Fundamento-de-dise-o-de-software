package Banco;

public class Vivienda extends Cuenta implements deposito {

	public Vivienda(int numero, String titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(long valor) {
		// TODO Auto-generated method stub
		if(valor>0){
			saldo+=valor;
		}else{
			System.out.println("valor no valido");
		}
	}
}
