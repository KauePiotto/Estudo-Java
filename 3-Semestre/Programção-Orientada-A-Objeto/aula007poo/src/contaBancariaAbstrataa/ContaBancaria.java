package contaBancariaAbstrataa;

public abstract class ContaBancaria {
	private String agencia;
	private double saldo;
	private String numero;

	public ContaBancaria() {
		
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public abstract void sacar(double valor);

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(ContaBancaria conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}
}
