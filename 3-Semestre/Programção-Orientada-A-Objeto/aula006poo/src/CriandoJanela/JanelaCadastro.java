package CriandoJanela;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaCadastro extends JFrame {
	private JButton btn;
	private Font fonte;
	private JLabel lbl;
	private JTextField txt;

	public JanelaCadastro() {
		//Font
		fonte = new Font("Arial",Font.BOLD, 15);
		//Botao Limpar
		btn = new JButton("Limpar");
		btn.setBounds(229,250,100,30);
		btn.setFont(fonte);
		
		getContentPane().add(btn);
		getContentPane().setLayout(null);
		//Botao Excluir
		btn = new JButton("Excluir");
		btn.setBounds(120,250,100,30);
		btn.setFont(fonte);
		
		getContentPane().add(btn);
		getContentPane().setLayout(null);
		//Botao Salvar
		btn = new JButton("Salvar");
		btn.setBounds(10,250,100,30);
		btn.setFont(fonte);
		
		getContentPane().add(btn);
		getContentPane().setLayout(null);
		//Label
		lbl = new JLabel();
		
		// Adicionando componentes
		setTitle("Cadastro Produtos");
		setResizable(false);
		setBounds(250, 250, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}