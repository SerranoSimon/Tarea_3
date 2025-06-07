package Visual;

import Logica.DepositoGenerico;

import javax.swing.*;
import java.awt.*;
import Logica.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *Clase que representa visualmente el deposito de monedas de un expendedor
 * muestra las monedas almacenadas como iconos pequeños y permite la actualizacion de su visualizacion dependiendo de los eventos.
 */
public class PanelDepositoMonedas extends JPanel {
    private DepositoGenerico<Moneda> depositoMonedas;

    /**
     *constructor que inicia el panel.
     * @param exp expendedor del cual se crea el panel de deposito de monedas.
     */
    public PanelDepositoMonedas(Expendedor exp){
        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout());
        this.depositoMonedas=exp.getDepositoMonedas();

    }

    /**
     *metodo para actualizar visualmente el deposito de monedas.
     * las ordena y las muestra en un tamaño mas pequeño.
     */
    public void actualizar() {
         this.removeAll();
        Collections.sort(depositoMonedas.getArr());
        for (Moneda m : depositoMonedas.getArr()) {
            this.add(new JLabel(new ImageIcon(m.getIcon().getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH))));

            this.revalidate();
            this.repaint();

        }
    }


}
