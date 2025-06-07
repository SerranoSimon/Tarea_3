package Visual;
import Logica.*;
import java.awt.*;
import javax.swing.*;

/**
 * Clase que actua como panel principal, utiliza el panelComprador y panelExpendedor para dar una interfaz grafica que permite la interaccion entre ambos paneles, representando la compra y funcionamiento de un expendedor.
 * Actua como contenedor principal de la interfaz grafica de la aplicacion.
 */
public class PanelPrincipal extends JPanel{

    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    /**
     *Constructor que inicializa el panel principal
     * Crea y configura los paneles de expendedor y comprador con sus respectivos tamaños y resolución.
     */
    public PanelPrincipal(){
        super();
        Expendedor exp=new Expendedor(6);
        this.setLayout(new GridLayout(1,2));

        this.setSize(1920,1080);

        panelComprador = new PanelComprador();
        panelComprador.setPreferredSize(new Dimension(300,300));

        panelExpendedor=new PanelExpendedor(panelComprador, exp);
        this.setBackground(Color.WHITE);



        panelExpendedor.setPreferredSize(new Dimension(1000,1400));
        this.add(panelComprador);
        this.add(panelExpendedor);
        this.setVisible(true);



    }

}
