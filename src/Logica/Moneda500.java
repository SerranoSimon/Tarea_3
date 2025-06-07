package Logica;

import javax.swing.*;

/**
 * Clase que hereda de Moneda y representa una moneda de $500
 */
public class Moneda500 extends Moneda{
    private ImageIcon imagen;
    /**
     * El constructor llama al constructor de Moneda
     */
    public Moneda500(){
        super();
        this.imagen=new ImageIcon("resources/imagenes/moneda500.png");
    }
    /**
     *
     * @return el valor de la moneda en pesos
     */
    @Override
    public int getValor() {
        return 500;
    }
    /**
     * permite obtener el ImageIcon de moneda500.
     * @return ImageIcon relacionado a la moneda.
     */
    @Override
    public ImageIcon getIcon() {
        return imagen;
    }
}
