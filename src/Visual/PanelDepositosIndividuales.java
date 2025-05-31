package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;

public class PanelDepositosIndividuales extends JPanel {
    private String num;
    private DepositoGenerico<Producto> deposito;
    private ImageIcon icono;

    public PanelDepositosIndividuales(DepositoGenerico<Producto> dep, String num) {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.num = num;
        this.deposito = dep;

        this.setBackground(Color.BLACK);
        JLabel labelNum = new JLabel(num);
        labelNum.setForeground(Color.WHITE);

        // Panel contenedor Rosado
        JPanel rectangulo = new JPanel();
        rectangulo.setBackground(Color.PINK);
        rectangulo.setPreferredSize(new Dimension(390, 100)); // un poco más ancho y alto para margen

        // Contenedor gris de productos
        JPanel panelGris = new JPanel(new GridLayout(1, 5, 5, 5)); // da espacio entre productos
        panelGris.setBackground(Color.GRAY);
        panelGris.setPreferredSize(new Dimension(350, 80));


        rectangulo.add(panelGris);

        this.add(labelNum);
        this.add(Box.createRigidArea(new Dimension(5, 0)));
        this.add(rectangulo);


        int cantidad=deposito.getArr().size();
        if (cantidad>= 5) {
            for (int i = 0; i < 5; i++) {
                panelGris.add(new JLabel(deposito.get().getIcon()));
            }
        }
        else if (cantidad==4) {
            for (int i = 0; i < 4; i++) {
                panelGris.add(new JLabel(deposito.get().getIcon()));
            }

        }
        else if (cantidad==3) {
            for (int i = 0; i < 3; i++) {
                panelGris.add(new JLabel(deposito.get().getIcon()));
            }

        }
        else if (cantidad==2) {
            for (int i = 0; i < 2; i++) {
                panelGris.add(new JLabel(deposito.get().getIcon()));
            }

        }
        else if (cantidad==1) {
            for (int i = 0; i < 1; i++) {
                panelGris.add(new JLabel(deposito.get().getIcon()));
            }

        }

    }
}
