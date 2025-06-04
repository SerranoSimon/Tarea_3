package Visual;

import Logica.DepositoGenerico;

import javax.swing.*;
import java.awt.*;
import Logica.*;
import java.util.ArrayList;
import java.util.Collections;

public class PanelDepositoMonedas extends JPanel {
    private DepositoGenerico<Moneda> depositoMonedas;
    public PanelDepositoMonedas(Expendedor exp){
        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout());
        this.depositoMonedas=exp.getDepositoMonedas();

    }
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
