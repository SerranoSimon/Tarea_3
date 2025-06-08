package Visual;

import javax.swing.*;
import java.awt.*;
import Logica.*;
/**
 * Clase que representa la ventana principal de la aplicación.
 * Extiende de JFrame para crear una ventana de la GUI.
 */
public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;
    /**
     * Constructor de ventana que inicializa la ventana, configura su tamaño, comportamiento de cierre
     * y agrega el panel principal a la ventana.
     */
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setResizable(false);
        this.panelPrincipal=new PanelPrincipal();
        this.add(panelPrincipal);
        this.setVisible(true);
    }
}
