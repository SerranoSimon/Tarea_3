package Visual;

import javax.swing.*;
import java.awt.*;
import Logica.*;


public class PanelProductoEntregado extends JPanel {
    private JPanel rectangulo;
    private JPanel depositoProductoEntregado;

    public PanelProductoEntregado() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(Color.PINK);

        // Panel fondo Rosado
        rectangulo = new JPanel();
        rectangulo.setBackground(Color.PINK);
        rectangulo.setPreferredSize(new Dimension(390, 100));

        //Rectangulo que simboliza el deposito donde estará el producto
        depositoProductoEntregado = new JPanel(new GridLayout(1, 1));
        depositoProductoEntregado.setBackground(Color.BLACK);
        depositoProductoEntregado.setPreferredSize(new Dimension(350, 80));

        rectangulo.add(depositoProductoEntregado);
        //espacio para margenes
        this.add(Box.createRigidArea(new Dimension(5, 0)));
        this.add(rectangulo);
        this.add(Box.createRigidArea(new Dimension(5, 0)));
    }

    public JPanel getDepositoProductoEntregado() {
        return depositoProductoEntregado;
    }
    public void mostrarProducto(Producto producto) {
        depositoProductoEntregado.removeAll();
        if (producto != null) {
            depositoProductoEntregado.add(new JLabel(producto.getIcon()));
        }
        depositoProductoEntregado.revalidate();
        depositoProductoEntregado.repaint();
    }
}
