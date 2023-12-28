package utilfixdois;

public class BankServer {

	
	public String nome;
	private int numeroConta;
	private double saldo;
	
	
	
	public int getnumeroConta() {
		return numeroConta;
	}
	public void setnumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaque(double saque) {
		saldo = saldo - saque - 5.00;
	}
	public void setDeposito(double deposito) {
		saldo += deposito;
	}
	
	
	
	
}
