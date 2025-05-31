package Logica;

import javax.swing.*;

/**
 * CLase que representa un Super 8 y hereda de Dulce
 */
public class Super8 extends Dulce{
    private ImageIcon imagen;
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Super8(int serie){
        super(serie);
        this.imagen=new ImageIcon("resources/imagenes/super8.png");

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Super8";
    }

    @Override
    public ImageIcon getIcon() {
        return imagen;
    }
}
