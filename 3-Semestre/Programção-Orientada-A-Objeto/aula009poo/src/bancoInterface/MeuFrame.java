package bancoInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame implements ActionListener {
	JButton meuBotao;

	public MeuFrame() {
		// meuBotao
		meuBotao = new JButton("Meu Botão");
		meuBotao.setBounds(20, 20, 80, 20);
		meuBotao.addActionListener(this);
		MeuActionListerner listener = new MeuActionListerner();
		meuBotao.addActionListener(listener);

		// Frame
		getContentPane().setLayout(null);
		getContentPane().add(meuBotao);
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MeuFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliquei no botão");
	}

	// Classe Interna
	class MeuActionListerner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clique no botão de novo");
		}
	}
}