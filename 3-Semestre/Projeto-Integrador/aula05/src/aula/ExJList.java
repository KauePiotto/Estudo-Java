package aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ExJList extends JFrame implements ListSelectionListener, ActionListener {
	JLabel l1;
	JTextField t1;
	JButton bquant, bindice, bclear;
	// Criando objeto Lista
	JList lista;
	DefaultListModel listModel;

	public static void main(String args[]) {
		new ExJList();
	}

	public ExJList() {
		setSize(400, 300);
		setTitle("Usando do JList");
		l1 = criarRotulo("Sem selecao");
		t1 = criarTexto();

		// Vetor com o nome das frutas
		String frutas[] = { "Banana", "Pera", "Maça", "Uva" };
		// container com os itens
		listModel = criarListaModelo(frutas);
		// adicionando o listModel na Lista.
		lista = criarLista(listModel);
		// Criando painel do tipo barra de rolagem
		JScrollPane painel = new JScrollPane(lista);
		// Criando um Layout do tipo Grid
		setLayout(new GridLayout(6, 1));
		add(painel);

		bquant = criarBotao("Quantidade de itens");
		bindice = criarBotao("Indice selecionado");
		bclear = criarBotao("Remove item");

		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JList criarLista(DefaultListModel listModel) {
		// adicionando o listModel na Lista.
		JList lista = new JList(listModel);
		lista.setForeground(Color.RED);
		lista.setFont(new Font("Courier new", Font.BOLD, 18));
		// Adicionando o evento na lista
		lista.addListSelectionListener(this);
		return lista;
	}

	private JLabel criarRotulo(String texto) {
		JLabel jl = new JLabel(texto);
		jl.setFont(new Font("Courier new", Font.BOLD, 18));
		add(jl);
		return jl;
	}

	private JTextField criarTexto() {
		JTextField txt = new JTextField();
		txt.setForeground(Color.BLUE);
		txt.setFont(new Font("Courier new", Font.BOLD, 18));
		txt.addActionListener(this);
		add(txt);
		return txt;
	}

	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		botao.setFont(new Font("Arial", Font.BOLD, 18));
		botao.setForeground(Color.BLUE);
		add(botao);
		return botao;
	}

	private DefaultListModel criarListaModelo(String[] frutas) {
		DefaultListModel lista = new DefaultListModel();
		for (int i = 0; i < frutas.length; i++) {
			lista.addElement(frutas[i]);
		}
		return lista;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == t1) {
			// adiciona itens a lista
			listModel.addElement(t1.getText());
			// Limpa a caixa de texto
			t1.setText("");
		}
		if (e.getSource() == bquant)
			t1.setText("Quantidade: " + listModel.getSize());
		if (e.getSource() == bindice)
			t1.setText("Indice selecionado: " + lista.getSelectedIndex());
		if (e.getSource() == bclear) {
			int resp = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do item: " + lista.getSelectedValue());
			if (resp == 0) {
				int index = lista.getSelectedIndex();
				l1.setText("Removido : " + lista.getSelectedValue());
				listModel.remove(index);
			}
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		l1.setText("Índice Selecionado: " + lista.getSelectedValue());
	}
}