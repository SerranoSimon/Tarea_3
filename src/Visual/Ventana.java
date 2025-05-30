package Visual;

import javax.swing.*;
import java.awt.*;
import Logica.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;
    private Snickers snickers;
    public Ventana(){
        super();
        this.setLayout(null);
        /*this.snickers=new Snickers(200) ;
        //panelPrincipal=new PanelPrincipal();
        this.setTitle("Ventana");
        JLabel label=new JLabel("foto:");
        label.setIcon(snickers.getIcon());*/
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(false);
        this.panelPrincipal=new PanelPrincipal();
        this.add(panelPrincipal);






       // this.add(panelPrincipal);
        this.setVisible(true);
    }
}
