package Visual;

import Logica.DepositoGenerico;
import Logica.Producto;

import javax.swing.*;
import java.awt.*;

public class PanelDepositosIndividuales extends JPanel {
    private String num;

    public PanelDepositosIndividuales(String num){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.num=num;
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
