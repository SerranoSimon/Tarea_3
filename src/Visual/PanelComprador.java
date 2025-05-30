package Visual;
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador() {
        this.setLayout(new GridLayout(4, 1));
        this.add(new JLabel("   Escoja su Dinero"));
        this.add(new JLabel("   Moneda 100"));
        this.add(new JLabel("   Moneda 500"));
        this.add(new JLabel("   Billete 1000"));


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

    }
}
