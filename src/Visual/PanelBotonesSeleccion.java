package Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Clase de tipo Panel que representa los botones de seleccion de productos de un expendedor, enumerados del 1 al 5.
 */
public class PanelBotonesSeleccion extends JPanel {
    /**
     * constructor del panel que crea los botones con cierta configuracion.
     */
    private ArrayList<JButton> botonesSeleccion;
    public PanelBotonesSeleccion(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);
        this.botonesSeleccion=new ArrayList<>();
        for(int i=1;i<6;i++){
           JButton botonSelecc= new JButton();
           botonSelecc.setText(String.valueOf(i));
           botonSelecc.setActionCommand(String.valueOf(i));
           botonesSeleccion.add(botonSelecc);
            this.add(botonSelecc);
        }
    }

    /**
     * metodo para obtener los botones de seleccion.
     * @return lista con los botones de seleccion de un expendedor.
     */
    public ArrayList<JButton> getBotonesSeleccion() {
        return botonesSeleccion;
    }
}
