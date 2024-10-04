package bancoInterface;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
	JButton meuBotao;

	public MeuFrame() {
//meuBotao
		meuBotao = new JButton("Meu Botão");
		meuBotao.setBounds(20, 20, 80, 20);

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
}