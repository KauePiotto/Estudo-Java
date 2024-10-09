package exercicio;

public class Aluno {

	private String Ra, Nome, Telefone, CEP;
	double nota1, nota2;

	public String getRa() {
		return Ra;
	}

	public void setRa(String ra) {
		Ra = ra;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public Aluno(String ra, String nome, String telefone, String cEP, double nota1, double nota2) {
		super();
		Ra = ra;
		Nome = nome;
		Telefone = telefone;
		CEP = cEP;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
}
