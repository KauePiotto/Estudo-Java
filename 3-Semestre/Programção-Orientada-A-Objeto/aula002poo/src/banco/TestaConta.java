package banco;

public class TestaConta {

	public static void main(String[] args) {
	ContaCorrente c1 = new ContaCorrente();
	c1.banco = "Itaú";
	c1.agencia = "0755";
	c1.nrConta = "1234-5";
	c1.titular ="Ana Maria";
	c1.depositar(3000);
	System.out.println("Nome: "+c1.titular+"\nBanco: "+c1.banco+"\nNúmero da conta: "+c1.nrConta+"\nAgência: "+c1.agencia+"\nSaldo: "+c1.exibirSaldo());
	if(c1.sacar(100)) {
		System.out.println("\nSaque realizdo com sucesso!");
	}else {
		System.err.println("NÃO FOI POSIVEL REALIZAR O SAQUE");
	}
	
	System.out.printf(c1.exibirSaldo());
	System.out.println("\n----------------------------------------------------------");
	ContaCorrente c2 = new ContaCorrente();
	c2.banco = "Bradesco";
	c2.agencia="1111";
	c2.nrConta = "5432-1";
	c2.titular = "Paulo";
	c2.depositar(4000);
	System.out.println("Nome: "+c2.titular+"\nBanco: "+c2.banco+"\nNúmero da conta: "+c2.nrConta+"\nAgência: "+c2.agencia+"\nSaldo: "+c2.exibirSaldo());
	System.out.println("--------------------------------------------------------------");
	c1.tranferirDin(100, c2);
	System.out.println("O seu novo saldo é "+c1.exibirSaldo());
	System.out.println("O seu novo saldo é "+c2.exibirSaldo());
	}
}
