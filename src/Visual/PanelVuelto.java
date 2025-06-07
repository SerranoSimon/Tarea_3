package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;

/**
 * Clase de tipo panel que representa una zona donde se puede recoger el vuelto luego de una compra en un expendedor.
 */
public class PanelVuelto extends JPanel {
    private DepositoGenerico<Moneda> MonVu;
    private PanelComprador panelComprador;

    /**
     * Inicia el panel del vuelto con su expendedor y comprador asociado.
     * @param exp expendedor logico
     * @param panelComprador panel del comprador asociado al expendedor.
     */
    public PanelVuelto(Expendedor exp, PanelComprador panelComprador){
        this.setBackground(Color.BLACK);
        this.setLayout(new FlowLayout());
        this.MonVu=exp.getMonVu();
        this.panelComprador=panelComprador;



        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(MonVu.getArr().size()==0){
                    JOptionPane.showMessageDialog(null, "¡No hay vuelto por recoger!");
                }
                else {
                    vueltoRecoger();
                }
            }
        });

    }

    /**
     * muestra visualmente las monedas disponibles para recoger con un tamaño reducido.
     */
    public void mostrarVuelto(){
        this.removeAll();
        Collections.sort(MonVu.getArr());
        for(Moneda m: MonVu.getArr()){
            this.add(new JLabel(new ImageIcon(m.getIcon().getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH))));
        }
        this.revalidate();
        this.repaint();

    }

    /**
     *gestiona la recoleccion de vuelto mediante una actualizacion visual, remueve la primera moneda y las transfiere al panel de comprador.
     */
    public void vueltoRecoger(){

            this.remove(0);
            this.revalidate();
            this.repaint();
            PanelComprador.comprador.getBilletera().add(MonVu.get());
            panelComprador.acBilletera();



    }
}
