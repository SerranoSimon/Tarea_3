package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;

public class PanelVuelto extends JPanel {
    private DepositoGenerico<Moneda> MonVu;
    public PanelVuelto(Expendedor exp){
        this.setBackground(Color.BLACK);
        this.setLayout(new FlowLayout());
        this.MonVu=exp.getMonVu();

    }
    public void mostrarVuelto(){
        this.removeAll();
        Collections.sort(MonVu.getArr());
        for(Moneda m: MonVu.getArr()){
            this.add(new JLabel(new ImageIcon(m.getIcon().getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH))));
        }
        this.revalidate();
        this.repaint();

    }
}
