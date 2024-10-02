package contaBancariaAbstrataa;

public class ContaCorrente extends ContaBancaria {
	
	double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if (this.getSaldo() + limite >= valor) {
			this.setSaldo(getSaldo() - valor);
		}

	}
}
