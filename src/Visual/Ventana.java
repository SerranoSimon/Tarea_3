package Visual;

import javax.swing.*;
import java.awt.*;
import Logica.*;

/**
 * Clase que crea una ventana para la visibilidad de la aplicación.
 */
public class Ventana extends JFrame {

    private PanelPrincipal panelPrincipal;

    /**
     * Crea una nueva ventana con su configuración específica y resolución.
     * Añade el panelPrincipal y lo hace visible, lo cual muestra toda la funcionalidad de la aplicación.
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
