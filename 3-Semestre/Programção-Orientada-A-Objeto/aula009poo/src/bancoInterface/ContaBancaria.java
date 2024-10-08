package bancoInterface;

public class ContaBancaria implements OperacoesBancarias, ValidacaoDeSaldo {
	public double saldo;

	@Override
	public boolean validar(double valor) {
		return saldo >= valor;
	}

	@Override
	public void sacar(double valor) {
		if (validar(valor)) {
			this.saldo -= valor;
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public double consultaSaldo() {
		return saldo;
	}

	@Override
	public void transferir(double saldo, OperacoesBancarias destino) {
		this.sacar(saldo);
		destino.depositar(saldo);
	}
}