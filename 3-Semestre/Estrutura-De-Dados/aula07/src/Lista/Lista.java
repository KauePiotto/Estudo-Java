package Lista;

public class Lista {
	public static void main(String[] args) {

		ListaEncadeada<String> lista = new ListaEncadeada<>(0);

		lista.adicionar("Claudio");
		lista.adicionar("Camila");
		lista.adicionar("Miguel");
		lista.adicionar("Elis");

		System.out.println(lista);
		System.out.println("Tamanho da lista = " + lista.getTamanho());
		System.out.println("Início da lista = " + lista.getInicio().getElemento());
		System.out.println("Fim da lista = " + lista.getFim().getElemento());

		System.out.println("Elemento na posição 2 = " + lista.get(2).getElemento());

		lista.remover("Claudio");

		System.out.println(lista);
		System.out.println("Tamanho da lista = " + lista.getTamanho());
		System.out.println("Início da lista = " + lista.getInicio().getElemento());
		System.out.println("Fim da lista = " + lista.getFim().getElemento());
	}
}
