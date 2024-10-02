package aula02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aluno {
	//Varaivel
	String nome, ra;
	short idade;
	double nota1, nota2, calculo;
	//Métodos de gravação
	public void gravarNome(String n) {
		nome = n;
	}
	public void gravarRa(String r) {
		ra = r;
	}
	public void gravarIdade(Short id) {
		idade = id;
	}
	public void gravarNota(double n1) {
		nota1 = n1;
	}
	public void gravarNota2(double n2) {
		nota2 = n2;
	}
	public void gravarCalculo(double n1, double n2) {
		calculo = n1 + n2 / 2;
	}
	
	//Métodos de leituras
	public String lerNome() {
		return nome;
	}
	public String lerRa() {
		return ra;
	}
	public short lerIdade() {
		return idade;
	}
	public double lerNota1() {
		return nota1;
	}
	public double lerNota2() {
		return nota2;
	}
	public double lerCalculo(){
		return calculo;
	}
	public void imprimir() {
	JOptionPane.showMessageDialog(null/*Deixa a caixa centralizada*/,"Ra: " +lerRa() + 
			"\nNome:" +lerNome() + 
			"\nIdade: "+ lerIdade() + 
			"\n1º Nota:" +lerNota1()+
			"\n2º Nota:" +lerNota2()+
			"\nMédia: " +lerCalculo());
}
}