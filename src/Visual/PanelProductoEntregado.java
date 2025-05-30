package Visual;

import javax.swing.*;
import java.awt.*;

public class PanelProductoEntregado extends JPanel {
    public PanelProductoEntregado(){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        JPanel rectangulo = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(40, 10, 310,90);

            }
        };
        rectangulo.setBackground(Color.PINK);
        rectangulo.setPreferredSize(new Dimension(80, 90));
        this.add(rectangulo);
    }
}
