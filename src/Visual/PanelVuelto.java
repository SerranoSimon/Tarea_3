package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;

public class PanelVuelto extends JPanel {
    private DepositoGenerico<Moneda> MonVu;
    private PanelComprador panelComprador;
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
    public void mostrarVuelto(){
        this.removeAll();
        Collections.sort(MonVu.getArr());
        for(Moneda m: MonVu.getArr()){
            this.add(new JLabel(new ImageIcon(m.getIcon().getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH))));
        }
        this.revalidate();
        this.repaint();

    }
    public void vueltoRecoger(){

            this.remove(0);
            this.revalidate();
            this.repaint();
            panelComprador.getMonedasBilletera().add(MonVu.get());
            panelComprador.acBilletera();



    }
}
