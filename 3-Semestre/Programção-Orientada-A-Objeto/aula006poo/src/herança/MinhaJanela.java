package herança;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	private JButton meuBotao;
	private Font fonte;
	
	public MinhaJanela() {
		//Font
		fonte = new Font("Arial",Font.BOLD | Font.ITALIC, 20);
		
		//Botão
		meuBotao = new JButton("Botão");
		meuBotao.setBounds(10,10,150,30);
		meuBotao.setFont(fonte);
		
		//Adicionando componentes
		getContentPane().add(meuBotao);
		getContentPane().setLayout(null);
		
		setVisible(true);//Comando para deixar a tela visivel
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Comando para encerrar a tela
		setBounds(100,100,500,500);//Comando para colocar a cordenada X e Y da janela
		setTitle("Minha Janala");//Comando para colocar o nome da janlea
		setResizable(false);//Comando serva para não conseguir redirecionar ele
		setCursor(Cursor.HAND_CURSOR);//serve para difinir o cursor da tela
		//setExtendedState(MAXIMIZED_BOTH);//Comando serve para inicializar a tela maximizdo
	}
}
