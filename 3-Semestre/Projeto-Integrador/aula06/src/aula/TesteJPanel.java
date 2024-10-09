package aula;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TesteJPanel extends JFrame implements ActionListener {
	JButton b1, b2;
	JPanel p1, p2;

	public TesteJPanel() {
		setTitle("Teste JPanel");
		setSize(200, 200);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = CriarPainel(10, 10, 140, 70, Color.BLUE);

		p2 = CriarPainel(10, 90, 140, 70, Color.YELLOW);

		b1 = CriarBotao("Gravar", 20, 20, 100, 30);

		p1.add(b1);

		b2 = CriarBotao("Sair", 20, 20, 100, 30);

		p2.add(b2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	private JButton CriarBotao(String string, int i, int j, int k, int l) {
		JButton b1 = new JButton("Gravar");
		b1.setBounds(20, 20, 100, 30);
		b1.addActionListener(this);
		return b1;
	}

	private JPanel CriarPainel(int desq, int dtop, int larg, int alt, Color cor) {
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(desq, dtop, larg, alt);
		p1.setBackground(cor);
		add(p1);
		return p1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) 
			JOptionPane.showMessageDialog(null, "Clicado no botão 1");
		else if(e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "Clicado no botão 2");
		}
	}	

	public static void main(String[] args) {
		new TesteJPanel();
	}
}
