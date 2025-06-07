package Logica;

import javax.swing.*;

/**
 * Clase que representa una CocaCola y hereda de Bebida
 */
public class Cocacola extends Bebida {
    private ImageIcon imagen;
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Cocacola(int serie) {
        super(serie);
        this.imagen=new ImageIcon("resources/imagenes/cocacola.png");

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Cocacola";
    }

    /**
     *metodo para obtener el icono del producto coca-cola.
     * @return retorna el ImageIcon del producto correspondiente.
     */
    @Override
    public ImageIcon getIcon() {
        return imagen;
    }

}
