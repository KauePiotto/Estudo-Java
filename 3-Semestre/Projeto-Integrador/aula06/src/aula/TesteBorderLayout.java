package aula;

import java.awt.*;
import javax.swing.*;

public class TesteBorderLayout extends JFrame {
	public TesteBorderLayout() {
		setTitle("Teste BorderLayout");
		setSize(350,150);
		Container c = getContentPane();
		c.setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		BorderLayout bl = new BorderLayout();
		c.setLayout(bl);
		
		JButton b1 = CriarBotao("Botão Norte", BorderLayout.NORTH, 'N');
		JButton b2 = CriarBotao("Botão Sul", BorderLayout.SOUTH, 'S');
		JButton b3 = CriarBotao("Botão Leste", BorderLayout.EAST, 'L');
		JButton B4 = CriarBotao("Botão Oeste", BorderLayout.WEST, 'O');
		JButton b5 = CriarBotao("Botão Center", BorderLayout.CENTER, 'C');
		
		setVisible(true);
	}
	
	private JButton CriarBotao(String texto, String posicao, char atalho) {
		JButton b1 = new JButton(texto);
		b1.setMnemonic(atalho);
		add(b1, posicao);
		return b1;
	}
	
	public static void main(String[] args) {
		new TesteBorderLayout();
	}
}
