package aula;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TesteEventoAção extends JFrame implements ActionListener {
	JLabel l1;
	JButton b1, b2;
	int i1, i2;

	public TesteEventoAção() {
		setTitle("Teste Evento Acao");
		setSize(240, 120); // tamanho da janela
		getContentPane().setLayout(null); // anula o layout padrao
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		i1 = i2 = 0;
		l1 = new JLabel("Pressione os botões");
		l1.setBounds(5, 50, 220, 20);
		getContentPane().add(l1);
		b1 = criarBotao("Gravar", 10, 10, 100, 30);
		b2 = criarBotao("Sair", 120, 10, 100, 30);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			l1.setText("Botão gravar pressionado " + ++i1 + " vez(es)");
		if (e.getSource() == b2)
			l1.setText("Botão sair pressionado " + ++i2 + " vez(es)");
	}

	private JButton criarBotao(String texto, int esq, int topo, int larg, int alt) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		botao.setBounds(esq, topo, larg, alt);
		add(botao);
		return botao;
	}

	public static void main(String[] args) {
		new TesteEventoAção();
	}
}