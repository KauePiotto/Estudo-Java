package banco;

public class ContaCorrente {
	// Atributos
	public double saldo = 0.00;
	public String titular;
	public double chequeEspecial = 1000;
	public String agencia;
	public String nrConta;
	public String banco;

	// Metodos
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public String exibirSaldo() {
		String saldoFormat;
		saldoFormat = String.format("R$ %7.2f",this.saldo);
		return saldoFormat;
	}
	
	public boolean sacar(double valorSaque) {
	     if (verificarSaldo(valorSaque)){
	    	 this.saldo -= valorSaque;
	    	 return true;
	     }
	     return false;
	}
	/* modo mais simples de fazer
	
	 public boolean tranferir (double val, ContaCorrente destino){
	       if(this.sacar(val){
	        dest.depostiar(val);
	        return true;
	        }
	        return false;
	 }
	 */
	public boolean tranferirDin( double valor, ContaCorrente destino) {
		if(verificarSaldo(saldo)){
		 this.saldo -= valor;
		 destino.saldo += valor;
		 return true;
		}
		return false;
	}

	private boolean verificarSaldo(double valor) {
	return valor <= (this.saldo + this.chequeEspecial);
	}
	
	
}
