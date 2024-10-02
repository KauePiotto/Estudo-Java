package aula01;

import java.util.Scanner;

public class aula01 {
	public static void main(String[] args) {
		int escolha, resp;
		double num1 = 0, num2 = 0, soma = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Escolha uma opção: " + "\n 1 - soma" + "\n 2 - Subtração" + "\n 3 - Multiplicação" + "\n 4 - Divisão");
		escolha = scan.nextInt();
		switch (escolha) {
		case 1:
			System.out.println("Digite um numero:");
			num1 = scan.nextDouble();
			System.out.println("Digite outro numero:");
			num2 = scan.nextDouble();
			soma = num1 + num2;
			System.out.println("O resultado é: " + soma);
			break;
		case 2:
			System.out.println("Digite um numero:");
			num1 = scan.nextDouble();
			System.out.println("Digite outro numero:");
			num2 = scan.nextDouble();
			soma = num1 - num2;
			System.out.println("O resultado é: " + soma);
			break;
		case 3:
			System.out.println("Digite um numero:");
			num1 = scan.nextDouble();
			System.out.println("Digite outro numero:");
			num2 = scan.nextDouble();
			soma = num1 * num2;
			System.out.println("O resultado é: " + soma);
			break;
		case 4:
			System.out.println("Digite um numero:");
			num1 = scan.nextDouble();
			do {
				System.out.println("Digite outro numero:");
				num2 = scan.nextDouble();
				if (num2 == 0) {
					System.out.println("O divisor não pode ser ZERO");
				}
			} while (num2 == 0);
			soma = num1 / num2;
			System.out.println("O resultado é: " + soma);
			break;
		default:
			System.out.println("Nehuma das opções acima foi escolhida");
			scan.close();
			break;
		}
	}
}
