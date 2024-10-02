package exercicio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExercicioListaSelecaoTime extends JFrame implements ItemListener {
	JLabel l1, l2, l3;
	JCheckBox cbSaoPaulo, c2, c3, c4, c5, c6, c7;

	public static void main(String args[]) {
		new ExercicioListaSelecaoTime();
	}

	ExercicioListaSelecaoTime() {
		setBackground(new Color(180, 180, 180));
		setTitle("Uso do JCheckBox");
		setSize(280, 500);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		l1 = criarRotulo();
		setLayout(new GridLayout(10, 1));
		cbSaoPaulo = criarCaixaChecagem("São Paulo");
		c2 = criarCaixaChecagem("Palmeiras");
		c3 = criarCaixaChecagem("Santos");
		c4 = criarCaixaChecagem("Corinthians");
		c5 = criarCaixaChecagem("Sport");
		c6 = criarCaixaChecagem("Santa Cruz");
		c7 = criarCaixaChecagem("Cruzeiro");
		l2 = criarRotulo();
		l2.setText("");
		l3 = criarRotulo();
		l3.setText("");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private JCheckBox criarCaixaChecagem(String texto) {
		JCheckBox cbSaoPaulo = new JCheckBox(texto);
		cbSaoPaulo.setBackground(new Color(0, 255, 0));
		cbSaoPaulo.addItemListener(this);
		add(cbSaoPaulo);
		return cbSaoPaulo;
	}

	private JLabel criarRotulo() {
		JLabel l1 = new JLabel("Selecione os times que torce");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Arial", Font.PLAIN, 20));
		l1.setForeground(new Color(26, 72, 17));
		add(l1);
		return l1;
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbSaoPaulo) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Você torce para o melhor!!!");
				l3.setText("Tricolor o melhor do Brasil");
			} else if (e.getStateChange() != ItemEvent.SELECTED) {
				l2.setText("Mude para o melhor!");
				l3.setText("Torça para o São Paulo!!!");
			}
		} else if (e.getSource() == c2) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Você torce para o " + c2.getText());
				l3.setText("Torça para o São Paulo!!!");
				c2.setSelected(true);
			}
		} else if (e.getSource() == c3) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Mude para o melhor!");
				l3.setText("Torça para o São Paulo!!!");
				c3.setSelected(true);
			}
		} else if (e.getSource() == c4) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Mude para o melhor!");
				l3.setText("Torça para o São Paulo!!!");
				c4.setSelected(true);
			}
		} else if (e.getSource() == c5) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Mude para o melhor!");
				l3.setText("Torça para o São Paulo!!!");
				c5.setSelected(true);
			}
		} else if (e.getSource() == c6) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Mude para o melhor!");
				l3.setText("Torça para o São Paulo!!!");
				c6.setSelected(true);
			}
		} else if (e.getSource() == c7) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				l2.setText("Mude para o melhor!");
				l3.setText("Torça para o São Paulo!!!");
				c7.setSelected(true);
			}
		}
	}
}