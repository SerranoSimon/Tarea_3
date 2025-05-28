package Visual;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;
    public Ventana(){
        super();
        panelPrincipal=new PanelPrincipal();
        this.setTitle("Ventana");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,300);

        this.add(panelPrincipal);
        this.setVisible(true);
    }
}
