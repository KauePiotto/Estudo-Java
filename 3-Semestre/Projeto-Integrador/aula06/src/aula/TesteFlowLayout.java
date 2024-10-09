package aula;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class TesteFlowLayout extends JFrame {

	private JButton botao1, botao2, botao3, botao4, botao5;
	private Container c; // Criação do objeto tipo Container

	public TesteFlowLayout() {// Criação do método construtor da classe
		super("Exemplo de layout de Fluxo");
		c = getContentPane();

		// Definindo o Layout como de Fluxo
		c.setLayout(new FlowLayout());
		botao1 = CriarBotao("Botão 1", '1');
		botao2 = CriarBotao("Botão 2", '2');
		botao3 = CriarBotao("Botão 3", '3');
		botao4 = CriarBotao("Botão 4", '4');
		botao5 = CriarBotao("Botão 5", '5');

		// Criação dos botões
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(botao5);
		setSize(350, 120);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static JButton CriarBotao(String texto, char c) {
		JButton botao = new JButton(texto);

		botao.setBackground(new Color(0, 0, 170));
		botao.setForeground(Color.YELLOW);
		botao.setFont(new Font("Helvetica", Font.BOLD, 14));
		botao.setToolTipText("Botão de comando");
		botao.setHorizontalAlignment(SwingConstants.CENTER);
		botao.setVerticalAlignment(SwingConstants.CENTER);
		botao.setMnemonic(c);

		return botao;
	}

	public static void main(String[] args) {
		new TesteFlowLayout();
	}
}
