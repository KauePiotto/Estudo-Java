package aula004poo;

public class TesteContaCnstrutor {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(0, 1000, "1234", "8888-8", "Itaú",
				new Cliente("Carlos", "222.222.222-99"));
	}
}
