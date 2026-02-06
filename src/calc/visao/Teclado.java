package calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	private final Color COR_AZUL = new Color(22, 145, 216);
	private final Color COR_CINZA_CLARO = new Color(64, 64, 64);
	private final Color COR_CINZA_ESCURO = new Color(49, 49, 49);
	private final Color COR_PRETO = new Color(30,30,30);
	
	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(1,1,1,1);
		
		setLayout(layout);
		
		setBackground(COR_PRETO);
		
		c.weightx = 1;
		c.weighty = 1;
		
		c.fill = GridBagConstraints.BOTH;
		
		adicionarBotao("%", COR_CINZA_ESCURO, c, 0, 0);
		adicionarBotao("CE", COR_CINZA_ESCURO, c, 1, 0);
		adicionarBotao("C", COR_CINZA_ESCURO, c, 2, 0);
		adicionarBotao("⌫", COR_CINZA_ESCURO, c, 3, 0);
		
		adicionarBotao("¹/x", COR_CINZA_ESCURO, c, 0, 1);
		adicionarBotao("X²", COR_CINZA_ESCURO, c, 1, 1);
		adicionarBotao("²√x", COR_CINZA_ESCURO, c, 2, 1);
		adicionarBotao("÷", COR_CINZA_ESCURO, c, 3, 1);
		
		adicionarBotao("7", COR_CINZA_CLARO, c, 0,2);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("9", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("*", COR_CINZA_ESCURO, c, 3, 2);
		
		adicionarBotao("4", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("6", COR_CINZA_CLARO, c, 2, 3);
		adicionarBotao("-", COR_CINZA_ESCURO, c, 3, 3);
		
		adicionarBotao("1", COR_CINZA_CLARO, c, 0, 4);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 4);
		adicionarBotao("3", COR_CINZA_CLARO, c, 2, 4);
		adicionarBotao("+", COR_CINZA_ESCURO, c, 3, 4);
		
		adicionarBotao("+/-", COR_CINZA_CLARO, c, 0, 5);
		adicionarBotao("0", COR_CINZA_CLARO, c, 1,5 );
		adicionarBotao(",", COR_CINZA_CLARO, c, 2,5 );
		adicionarBotaoCorDeTextoDiferente("=", COR_AZUL,
				new Color(30,30,30), c, 3, 5);
	}

	private void adicionarBotao(String texto, Color cor,
			GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
	}
	
	private void adicionarBotaoCorDeTextoDiferente(String texto,
			Color cor, Color corTexto,
			GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		botao.setForeground(corTexto);
		add(botao, c);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());

		}
	}
}
