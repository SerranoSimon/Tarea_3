package Logica;

import javax.swing.*;

/**
 * Clase que representa una Fanta y hereda de bebida
 */
public class Fanta extends Bebida {
    private ImageIcon imagen;
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Fanta(int serie){
        super(serie);
        this.imagen=new ImageIcon("resources/imagenes/fanta.png");

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Fanta";
    }

    /**
     * metodo para obtener el icono (imagen) del producto fanta.
     * @return retorna un ImageIcon relacionado al producto.
     */

    @Override
    public ImageIcon getIcon() {
        return imagen;
    }
}