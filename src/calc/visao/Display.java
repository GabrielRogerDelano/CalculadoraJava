package calc.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import calc.modelo.Memoria;
import calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

    private final JLabel labelBuffer;
    private final JLabel labelAtual;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(30,30,30));

        setLayout(new GridLayout(2, 1));

        labelBuffer = new JLabel("", SwingConstants.RIGHT);
        labelBuffer.setForeground(new Color(160, 160, 160));
        labelBuffer.setFont(new Font("Courier", Font.PLAIN, 15));
        labelBuffer.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

        labelAtual = new JLabel(
                Memoria.getInstancia().getTextoAtual(),
                SwingConstants.RIGHT
        );
        labelAtual.setForeground(Color.WHITE);
        labelAtual.setFont(new Font("Courier", Font.BOLD, 45));
        labelAtual.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        add(labelBuffer);
        add(labelAtual);
    }

    @Override
    public void valorAlterado(String novoValor) {
    	labelAtual.setText(novoValor);
    	labelBuffer.setText(Memoria.getInstancia().getTextoBufferDisplay() );
    }
    
    
}
