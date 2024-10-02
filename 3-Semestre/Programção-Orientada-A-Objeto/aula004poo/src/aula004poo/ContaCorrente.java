package aula004poo;

public class ContaCorrente {
	public double saldo;
	public Cliente titutlar;
	public double chequeEspecial;
	public String agencia;
	public String nrConta;
	public String banco;
	public String cliente;
	public static int qntContas;

	public ContaCorrente() {
		qntContas++;
		this.saldo = 0;
	}

	public ContaCorrente(double chequeEspecial) {
		this();
		this.chequeEspecial = chequeEspecial = 1000;
	}

	public ContaCorrente(boolean chequeEspecial) {
		if (chequeEspecial) {
			this.chequeEspecial = 1000;
		}
	}

	public ContaCorrente(double saldo, double chequeEspecial, String agencia, String nrConta, String banco) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.agencia = agencia;
		this.nrConta = nrConta;
		this.banco = banco;
	}

	public ContaCorrente(double saldo, double chequeEspecial, String agencia, String nrConta, String banco,
			Cliente cliente) {
		this(saldo, chequeEspecial, agencia, nrConta, banco);
		this.titutlar = cliente;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	// R$200,00
	public String exibirSaldo() {
		String saldoFormat;
		saldoFormat = String.format("R$ %7.2f", this.saldo);
		return saldoFormat;
	}

	// return valor <= (this.saldo + this.chequeEspecial);
	private boolean verificarSaldo(double valor) {
		if (valor <= (this.saldo + this.chequeEspecial)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valorT, ContaCorrente conta) {
		if (verificarSaldo(valorT)) {
			this.saldo -= valorT;
			conta.saldo += valorT;
			return true;
		} else {
			return false;
		}
	}
}