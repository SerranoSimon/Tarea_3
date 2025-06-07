package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa los paneles unicamente para los depositos de productos.
 * Permite manejar el metodo de rellenar depositos.
 */
public class PanelDepositosIndividuales extends JPanel {
    private String num;
    private DepositoGenerico<Producto> deposito;
    private ImageIcon icono;
    private JPanel panelGris;

    /**
     * constructor que inicia un panel para un deposito de productos especifico.
     * @param dep deposito logico de productos.
     * @param num identificador numerico del deposito.
     */
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
        rectangulo.setPreferredSize(new Dimension(390, 100)); //

        // Contenedor gris de productos
        this.panelGris = new JPanel(new GridLayout(1, dep.getArr().size(), 5, 5)); // da espacio entre productos
        panelGris.setBackground(Color.GRAY);
        panelGris.setPreferredSize(new Dimension(350, 80));


        rectangulo.add(panelGris);

        this.add(labelNum);
        this.add(Box.createRigidArea(new Dimension(5, 0)));
        this.add(rectangulo);

        //Relleno de depositos de acuerdo a lo que se pone en expendedor al crearlo
        int cantidad=deposito.getArr().size();

            for (int i = 0; i < cantidad; i++) {
                panelGris.add(new JLabel(deposito.getArr().get(i).getIcon()));


        }

    }

    /**
     * metodo para obtener el deposito logico asociado al panel visual.
     * @return deposito de productos.
     */
    public DepositoGenerico<Producto> getDeposito(){
        return deposito;
    }

    /**
     * metodo que permite actualizar los depositos, elimina el ultimo elemento.
     *
     */
    public void actualizar(){
        panelGris.remove(deposito.getArr().size());
        panelGris.revalidate();
        panelGris.repaint();

    }

    /**
     * rellena visualmente el deposito con los productos correspondientes.
     */
    public void rellenar(){
        for (int i = 0; i < deposito.getArr().size(); i++) {
            panelGris.add(new JLabel(deposito.getArr().get(i).getIcon()));
        }
        panelGris.revalidate();
        panelGris.repaint();


    }
}
