package aula02;

import javax.swing.JOptionPane;

public class CadastrarAluno {
 public static void main(String[] args) {
	 int resp = 0;
	 
	do{
	String ra = JOptionPane.showInputDialog("Digite o RA:");
	String nome = JOptionPane.showInputDialog("Digite o Nome:");
	Short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a Idade:"));
	Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
	Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
	
	Aluno aluno = new Aluno();//criando o objeto aluno
	aluno.gravarNome(nome);
	aluno.gravarRa(ra);
	aluno.gravarIdade(idade);
	aluno.gravarNota(nota1);
	aluno.gravarNota2(nota2);
	aluno.gravarCalculo(nota1,nota2);
	
	aluno.imprimir();
	resp = JOptionPane.showConfirmDialog(null,"Dseja cotinuar?");
	} while(resp == 0);
 }
}
