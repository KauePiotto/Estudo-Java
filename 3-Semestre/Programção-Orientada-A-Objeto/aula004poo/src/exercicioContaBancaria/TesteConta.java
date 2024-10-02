package exercicioContaBancaria;

import java.util.Scanner;

import aula004poo.Cliente;
import aula004poo.ContaCorrente;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente[] contaCorrente = new ContaCorrente[5];
		Cliente[] cliente = new Cliente[5];
		Scanner scan = new Scanner(System.in);

		double valor;
		int opcao, qtd, num, posic,conta;

		do {
			System.out.println("Informe a opão desejada");
			System.out.println("1. Criar Conta\n" + "2.Criar Cliente\n" + "3. Associar cliente à conta\n"
					+ "4. Realizar dépostito" + "5. Realizar transferência\n" + "6. Exibir dados do cliente\n"
					+ "7. Exibir dados da conta\n" + "8. Encerrar");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Quantas contas deseja criar");
				qtd = scan.nextInt();
				contaCorrente = new ContaCorrente[qtd];
				break;
			case 2:
				System.out.println("Quanos cliente deseja crirar");
				qtd = scan.nextInt();
				cliente = new Cliente[qtd];
				break;
			case 3:
				System.out.println("Qual a posição do cliente que deseja associar?");
				posic = scan.nextInt();
				Cliente c = cliente[posic];
				System.out.println("A qual conta (posição) deseja associar o cliente");
				posic = scan.nextInt();
				// contaCorrente[posic].titular = c;
				break;
			case 4:
				System.out.println("Informe para qual conta (posição) você deseja fazer o deposito");
				conta = scan.nextInt();
			case 5:
				System.out.println("Qual conta (posição) deseja fazer a tranferência");
			case 6:

			case 7:

			case 8:
				break;
			}
		} while (opcao != 8);
	}
}
