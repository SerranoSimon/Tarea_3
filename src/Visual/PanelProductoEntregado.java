package Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Logica.*;

/**
 * Clase que representa visualmente la zona donde se entrega el producto en el expendedor.
 * Permite la interacción del usuario con el producto mediante clicks.
 */
public class PanelProductoEntregado extends JPanel {
    private JPanel rectangulo;
    private JPanel depositoProductoEntregado;
    private Producto productoEntregado;

    /**
     * Inicia el panel del producto entregado, lo configura visualmente y establece los listeners del mouse.
     */
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

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(productoEntregado==null){
                    JOptionPane.showMessageDialog(null, "¡Vacio!");
                }
                else {
                     entregarProducto();

                }
            }
        });
    }

    /**
     * muestra visualmente el producto entregado en el area establecida luego de una compra en un expendedor.
     * @param producto producto entregado.
     */
    public void mostrarProducto(Producto producto) {
        this.productoEntregado=producto;
        depositoProductoEntregado.removeAll();
        if (producto != null) {
            depositoProductoEntregado.add(new JLabel(producto.getIcon()));
        }
        depositoProductoEntregado.revalidate();
        depositoProductoEntregado.repaint();
    }

    /**
     * metodo para entregar el producto al usuario, elimina el producto visualmente al hacerle click y muestra un mensaje especifico para el producto comprado.
     */
    public void entregarProducto(){
        depositoProductoEntregado.removeAll();
        JOptionPane.showMessageDialog(null, "Recogiste el producto: " + productoEntregado.consumir() +
                ", serie: " + productoEntregado.getSerie());
        productoEntregado = null;
        this.revalidate();
        this.repaint();
    }
}
