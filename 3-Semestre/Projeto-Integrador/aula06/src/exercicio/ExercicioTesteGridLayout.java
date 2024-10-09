package exercicio;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExercicioTesteGridLayout extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4, b5, b6;

	public ExercicioTesteGridLayout() {
		setTitle("Exercicio de Teste GridLayout");
		setSize(300, 150);
		getContentPane().setBackground(new Color(180, 189, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		GridLayout gl = new GridLayout(3, 2, 0, 0);
		getContentPane().setLayout(gl);

		b1 = criarBotao("Linha 1 - Coluna 1");
		b2 = criarBotao("Linha 2 - Coluna 2");
		b3 = criarBotao("Linha 3 - Coluna 1");
		b4 = criarBotao("Linha 4 - Coluna 2");
		b5 = criarBotao("Linha 5 - Coluna 1");
		b6 = criarBotao("Linha 6 - Coluna 2");

		setVisible(true);
	}

	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		add(botao);
		botao.addActionListener(this);
		return botao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, b1.getText());
		} else if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, b2.getText());
		} else if (e.getSource() == b3) {
			JOptionPane.showMessageDialog(null, b3.getText());
		} else if (e.getSource() == b4) {
			JOptionPane.showMessageDialog(null, b4.getText());
		} else if (e.getSource() == b5) {
			JOptionPane.showMessageDialog(null, b5.getText());
		} else if (e.getSource() == b6) {
			JOptionPane.showMessageDialog(null, b4.getText());
		}
	}

	public static void main(String[] args) {
		new ExercicioTesteGridLayout();
	}
}