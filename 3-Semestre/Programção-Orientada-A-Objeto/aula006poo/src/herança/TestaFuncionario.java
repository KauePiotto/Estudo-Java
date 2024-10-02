package herança;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Engenheiro();
		Funcionario f3 = new Engenheiro();

		f1.setMatricula("1234");
		f3.setMatricula("1234");

		List<Funcionario> funcs = new ArrayList<Funcionario>();
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();

		c1.setMatricula("5678");
		c2.setMatricula("8910");
		c3.setMatricula("1123");

		funcs.add(c1);
		funcs.add(c2);
		funcs.add(c3);

		Contador c4 = new Contador();

		c4.setMatricula("5678");
		JOptionPane.showMessageDialog(null, funcs.contains(c4));
	}
}
