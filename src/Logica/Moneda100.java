package Logica;

import javax.swing.*;

/**
 * Clase que hereda de Moneda y representa una moneda de $100
 */
public class Moneda100 extends Moneda {
    private ImageIcon imagen;
    /**
     * El constructor llama al constructor de Moneda
     */
    public Moneda100(){
        super();
        this.imagen=new ImageIcon("resources/imagenes/moneda100.png");
    }

    /**
     *
     * @return el valor de la moneda en pesos
     */
    @Override
    public int getValor() {
        return 100;
    }

    @Override
    public ImageIcon getIcon() {
        return imagen;
    }
}
