package bancoInterface;

public interface OperacoesBancarias {
	public void sacar(double valor);

	public void depositar(double valor);

	public double consultaSaldo();

	public void transferir(double saldo, OperacoesBancarias destino);

	default void metodoDefault() {
		System.out.println();
	}
}