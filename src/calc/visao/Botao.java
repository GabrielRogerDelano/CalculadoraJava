package calc.visao;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

    private final int radius = 15;
    private final Color corOriginal;
    private final Color corHover;
    
    public Botao(String texto, Color cor) {
        setText(texto);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);

        this.corOriginal = cor;
        this.corHover = gerarCor(cor);
        
        setBackground(corOriginal);
        setForeground(Color.WHITE);
        setFont(new Font("Courier", Font.PLAIN, 20));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(corHover);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(corOriginal);
                repaint();
            }
        });
    }

    private Color gerarCor(Color cor) {
		return new Color(
				Math.min(cor.getRed() + 20, 255),
				Math.min(cor.getGreen() + 20, 255),
				Math.min(cor.getBlue() + 20, 255)
		);
	}

	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        super.paintComponent(g2);
        g2.dispose();
    }
}
