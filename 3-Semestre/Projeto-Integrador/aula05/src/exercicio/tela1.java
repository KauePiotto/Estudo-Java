package exercicio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tela1 extends JFrame implements ActionListener {
	JLabel CPF;
	JTextField txtCPF;

	public tela1() {
		// Titulo da janela
		setTitle("Cadastro");
		// Tamanho da janela
		setSize(700, 600);
		// Anula o layout padrao
		getContentPane().setLayout(null);
		// Cor de fundo da janela no padrao RGB (Red Green Blue)
		getContentPane().setBackground(new Color(188, 188, 188));
		// Comando para centralizar a janela
		Centralizar();
		// Label do CPF
		CPF = CriarLabel("CPF", 10, 10, 270, 50);
		// Text Field do CPF
		txtCPF = txtCPF(10, 50, 300, 35);
		// Exibindo Janela
		setVisible(true);
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

	public JLabel CriarLabel(String string, int desq, int dtop, int larg, int alt) {
		JLabel jl = new JLabel(string);

		// distancia esq e topo
		jl.setLocation(desq, dtop);
		// larg e alt do rotulo
		jl.setSize(larg, alt);
		// Cor da Fonte
		jl.setForeground(new Color(0, 0, 0));
		// nome,estilo e tamanho da fonte
		jl.setFont(new Font("Courier new", Font.BOLD, 12));
		// Inserir o Jlabel na Janela
		add(jl);

		return jl;
	}

	public JTextField txtCPF(int desq, int dtop, int larg, int alt) {
		JTextField txtCpf = new JTextField();

		txtCpf.setBounds(desq, dtop, larg, alt);
		// Caixa de texto
		txtCpf.setHorizontalAlignment(JTextField.LEFT);
		// Inserir o JtextField na janela
		add(txtCpf);

		return txtCpf;
	}

	public static void main(String[] args) {
		new tela1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}