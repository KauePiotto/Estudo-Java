package herança;

import javax.swing.JOptionPane;

public class Engenheiro extends Funcionario {
	private String numCrc;

	public Engenheiro() {
		JOptionPane.showMessageDialog(null,"O engenheiro passou por aqui");
	}

	public String getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(String numCrc) {
		this.numCrc = numCrc;
	}
}
