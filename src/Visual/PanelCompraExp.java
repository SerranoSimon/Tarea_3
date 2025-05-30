package Visual;

import javax.swing.*;
import java.awt.*;

public class PanelCompraExp extends JPanel {
    public PanelCompraExp() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("EXPENDEDOR");
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setPreferredSize(new Dimension(130, titulo.getPreferredSize().height));

        JButton rellenar = new JButton("Rellenar depósitos vacíos");
        rellenar.setAlignmentX(Component.CENTER_ALIGNMENT);
        rellenar.setPreferredSize(new Dimension(130, 30));

        this.add(Box.createVerticalStrut(20));
        this.add(titulo);
        this.add(Box.createVerticalStrut(50));
        this.add(rellenar);
        this.add(Box.createVerticalStrut(20));
    }
}
