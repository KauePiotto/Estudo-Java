package aula04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TesteJFrame extends JFrame {
	JLabel nome;
	JTextField txtNome;

	public TesteJFrame() {
		setTitle("Primeira Janela Swing");// Titulo da janela
		setSize(350, 300);// Tamanho da janela
		getContentPane().setLayout(null);// Anula o layout padrao
		// Cor de fundo da janela no padrao RGB (Red Green Blue)
		getContentPane().setBackground(new Color(255, 0, 0));
		Centralizar();
		nome = criarJLabel("Nome", 10, 10, 270, 50);
		txtNome = CriarTextField(10, 50, 270, 25);
		setVisible(true);// Exibindo Janela
		// Provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void Centralizar() {
		// Obtém a alturar e largura da resolusão vídeo
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		// Obtém a altura e largura da minha janela
		Dimension janela = getSize();

		if (janela.height > screen.height) {
			setSize(janela.width, screen.height);
		}
		if (janela.width > screen.height) {
			setSize(screen.width, janela.height);
		}

		setLocation((screen.width - janela.width) / 2, (screen.height - janela.width) / 2);
	}

	public JLabel criarJLabel(String string, int desq, int dtop, int larg, int alt) {
		JLabel jl = new JLabel(string);

		// jl.setText("JLabel inserido");
		jl.setLocation(desq, dtop);// distancia esq e topo
		jl.setSize(larg, alt);// larg e alt do rotulo

		// Torna opaco o fundo do rótulo

		// jl.setOpaque(true); // Fundo opcao
		// jl.setBackground(new Color(255, 255, 255));// Cor do Fundo
		jl.setForeground(new Color(0, 0, 0));// Cor da Fonte
		jl.setFont(new Font("Courier new", Font.BOLD, 12)); // nome,estilo e tamanho da fonte
		// jl.setToolTipText("JLabel Exemplo");// dica do tempo
		// jl.setHorizontalAlignment(SwingConstants.LEFT); // Alinhamento horizontal

		// Inserir o Jlabel na Janela
		add(jl);

		return jl;
	}

	public JTextField CriarTextField(int desq, int dtop, int larg, int alt) {
		JTextField jt = new JTextField();

		jt.setBounds(desq, dtop, larg, alt);
		
		jt.setText("Insira o texto aqui");
		jt.setHorizontalAlignment(JTextField.LEFT);

		// Inserir o JtextField na janela
		add(jt);

		return jt;
	}

	public static void main(String[] args) {
		new TesteJFrame();
	}
}