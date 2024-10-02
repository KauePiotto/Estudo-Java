package teste;

import java.util.LinkedList;

public class Teste {
	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<String>();

		lista.add("Claudio");
		lista.add("Camila");
		lista.add("Miguel");
		lista.add("Elis");

		System.out.println(lista);
		System.out.println("Tamanho da lista = " + lista.size());
		System.out.println("Início da lista = " + lista.getFirst());
		System.out.println("Fim da Lista = " + lista.getLast());
		System.out.println("Buscar informação na 2º posição da lista: " + lista.get(2));
		System.out.println("Buscar o nome Elis na lista: " + lista.contains("Elis"));

		lista.remove(2);
		lista.remove("Claudio");

		System.out.println(lista);
		System.out.println("Tamanho da lista = " + lista.size());
	}
}
