package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;

public class PanelDepositosIndividuales extends JPanel {
    private String num;
    private DepositoGenerico<Producto> deposito;
    private ImageIcon icono;

    public PanelDepositosIndividuales(DepositoGenerico<Producto> dep, String num){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.num=num;
        this.deposito= dep;

        this.setBackground(Color.BLACK);
        JLabel labelNum=new JLabel();
        labelNum.setText(num);
        labelNum.setForeground(Color.WHITE);
        JPanel rectangulo = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GRAY);
                g.fillRect(20, 10, 340,80);

            }
        };
        rectangulo.setBackground(Color.PINK);
        rectangulo.setPreferredSize(new Dimension(80, 80));
        this.add(labelNum);
        this.add(Box.createRigidArea(new Dimension(5,0))); //crea espacio entre los elementos horizontales
        this.add(rectangulo);





    }
}
