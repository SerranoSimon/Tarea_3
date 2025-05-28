package Visual;
import Logica.*;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor(){
        this.setBackground(Color.BLUE);
        this.setLayout(new GridLayout(6,1));
        for(int i=0;i<6;i++){
            if(i!=5){
            this.add(new JLabel("  Producto "+i));}
            else{
                this.add(new JLabel("  Recoga su producto ->"));
            }

        }

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.PINK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
    }


}
