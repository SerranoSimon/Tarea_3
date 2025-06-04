package Logica;

import javax.swing.*;

/**
 * Clase que hereda de Moneda y representa una moneda de $1000
 */
public class Moneda1000 extends Moneda{
    private ImageIcon imagen;
    /**
     * El constructor llama al constructor de Moneda
     */
    public Moneda1000(){
        super();
        this.imagen=new ImageIcon("resources/imagenes/moneda1000.png");
    }
    /**
     *
     * @return el valor de la moneda en pesos
     */
    @Override
    public int getValor() {
        return 1000;
    }

    @Override
    public ImageIcon getIcon() {
        return imagen;
    }
}
