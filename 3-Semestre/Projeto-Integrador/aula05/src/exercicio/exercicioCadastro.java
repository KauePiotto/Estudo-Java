package exercicio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class exercicioCadastro extends JFrame implements ActionListener, ItemListener {
	JLabel CPF, RG, Nome, Logradouro, Endereco;
	JTextField txtCPF, txtRG, txtNome, txtEndereco;
	JComboBox combo;

	public static void main(String[] args) {
		new exercicioCadastro();
	}

	private exercicioCadastro() {
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
		CPF = lblCPF("CPF", 10, 10, 270, 50);
		// TextField do CPF
		txtCPF = txtCPF(10, 50, 150, 35);
		// Label do RG
		RG = lblRG("RG", 200, 10, 270, 50);
		// TextField do RG
		txtRG = txtRG(200, 50, 150, 35);
		// Label do Nome
		Nome = lblNome("Nome", 10, 100, 270, 50);
		// JTextField do Nome
		txtNome = txtNome(10, 200, 150, 35);
		// JLabel do Lagradouro
		Logradouro = lblLograduro("Logradouro", 10, 190, 270, 50);
		// ComboBox do Lagradouro
		String[] logr = { "Alameda", "Avenida", "Praça", "Rodovia", "Rua", "Viela" };
		combo = Combo(logr, 10, 235, 180, 40);
		// JLabel do Endereco
		Endereco = lblendereco("Endereço", 200, 190, 270, 53);
		// JTextField do Endereço
		txtEndereco = txtendereco(200, 235, 300, 40);
		// Exibindo Janela
		setVisible(true);
		// Provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void Centralizar() {
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

	// Criando o Campo Para Adicionar CPF
	private JLabel lblCPF(String string, int desq, int dtop, int larg, int alt) {
		JLabel jl = new JLabel(string);

		// distancia esq e topo
		jl.setLocation(desq, dtop);
		// larg e alt do rotulo
		jl.setSize(larg, alt);
		// Cor da Fonte
		jl.setForeground(new Color(0, 0, 0));
		// nome,estilo e tamanho da fonte
		jl.setFont(new Font("Courier new", Font.BOLD, 18));
		// Inserir o Jlabel na Janela
		add(jl);

		return jl;
	}

	private JTextField txtCPF(int desq, int dtop, int larg, int alt) {
		JTextField txtCpf = new JTextField();

		txtCpf.setBounds(desq, dtop, larg, alt);
		// Caixa de texto
		txtCpf.setHorizontalAlignment(JTextField.LEFT);
		// Inserir o JtextField na janela
		add(txtCpf);

		return txtCpf;
	}

	// Criando Campo para Adiconar RG
	private JLabel lblRG(String string, int desq, int dtop, int larg, int alt) {
		JLabel lblRG = new JLabel(string);

		// Distancia esq e top
		lblRG.setLocation(desq, dtop);
		// larg e alt do rotulo
		lblRG.setSize(larg, alt);
		// Cor da fonte
		lblRG.setForeground(new Color(0, 0, 0));
		// Nome, estilo e tamanho da fonte
		lblRG.setFont(new Font("Courier new", Font.BOLD, 18));
		// Inserir o JLabel na Janela
		add(lblRG);

		return lblRG;
	}

	private JTextField txtRG(int desq, int dtop, int larg, int alt) {
		JTextField txtRG = new JTextField();

		txtRG.setBounds(desq, dtop, larg, alt);
		// Caixa de Texto
		txtRG.setHorizontalAlignment(JTextField.LEFT);
		// Inserir o JtextField na janela
		add(txtRG);

		return txtRG;
	}

	// Criando o campo para Adicionar Nome
	private JLabel lblNome(String string, int desq, int dtop, int larg, int alt) {
		JLabel lblNome = new JLabel(string);

		// Distancia esq e top
		lblNome.setLocation(desq, dtop);
		// Larg e alt do rotulo
		lblNome.setSize(larg, alt);
		// Cor da Fonte
		lblNome.setForeground(new Color(0, 0, 0));
		// nome, estilo e tamanho da fonte
		lblNome.setFont(new Font("Courier new", Font.BOLD, 18));
		// Inserir o JLabel na Janela
		add(lblNome);

		return lblNome;
	}

	private JTextField txtNome(int desq, int dtop, int larg, int alt) {
		JTextField txtNome = new JTextField();

		txtNome.setBounds(desq, dtop, larg, alt);
		// Caixa de texto
		txtNome.setHorizontalAlignment(JTextField.LEFT);
		// Inserir o JTextField na janela
		add(txtNome);

		return txtNome;
	}

	// Criando o campo de Lograduro
	private JLabel lblLograduro(String string, int desq, int dtop, int larg, int alt) {
		JLabel lblLogradouro = new JLabel(string);

		// Distancia esq e top
		lblLogradouro.setLocation(desq, dtop);
		// Larg e alt do rotulo
		lblLogradouro.setSize(larg, alt);
		// Cor da Fonte
		lblLogradouro.setForeground(new Color(0, 0, 0));
		// nome, estilo e tamanho da fonte
		lblLogradouro.setFont(new Font("Courier new", Font.BOLD, 18));
		// Inserir o JLabel na Janela
		add(lblLogradouro);

		return lblLogradouro;
	}

	private JComboBox Combo(String[] cores, int desq, int dtop, int larg, int alt) {
		JComboBox combo = new JComboBox(cores);
		combo.addItemListener(this);
		combo.setFont(new Font("Arial", Font.BOLD, 15));
		combo.setBounds(desq, dtop, larg, alt);
		add(combo);

		return combo;
	}

	// Criando o Campo Endereço
	private JLabel lblendereco(String string, int desq, int dtop, int larg, int alt) {
		JLabel lblendereco = new JLabel(string);

		// Distancia esq e top
		lblendereco.setLocation(desq, dtop);
		// Larg e alt do rotulo
		lblendereco.setSize(larg, alt);
		// Cor da Fonte
		lblendereco.setForeground(new Color(0, 0, 0));
		// nome, estilo e tamanho da fonte
		lblendereco.setFont(new Font("Courier new", Font.BOLD, 18));
		// Inserir o JLabel na Janela
		add(lblendereco);

		return lblendereco;
	}

	private JTextField txtendereco(int desq, int dtop, int larg, int alt) {
		JTextField txtendereco = new JTextField();

		txtNome.setBounds(desq, dtop, larg, alt);
		// Caixa de texto
		txtNome.setHorizontalAlignment(JTextField.LEFT);
		// Inserir o JTextField na janela
		add(txtNome);

		return txtNome;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}
}