package Logica;

import javax.swing.*;

/**
 * CocaCola hereda de Bebida
 */
public class Sprite extends Bebida {
    private ImageIcon imagen;
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Sprite(int serie){
        super(serie);
        this.imagen= new ImageIcon("resources/imagenes/sprite.png");
    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Sprite";
    }
    /**
     *metodo para obtener el icono del producto Sprite.
     * @return retorna el ImageIcon del producto correspondiente.
     */
    public ImageIcon getIcon(){
        return imagen;
    }
}
