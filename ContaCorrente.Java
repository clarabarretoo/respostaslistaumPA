public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	
	public ContaCorrente(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void getSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor<=saldo) {
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public String toString() {
		return "Conta." + numeroConta + "\nsaldo:R$ " + saldo;
	
	}
	
}
