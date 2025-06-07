package Logica;

import javax.swing.*;

/**
 * Clase que representa un Snickers y hereda de Dulce
 */
public class Snickers extends Dulce{
    private ImageIcon imagen;
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Snickers(int serie){
        super(serie);
        this.imagen=new ImageIcon("resources/imagenes/snickers.png");

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Snickers";
    }

    /**
     *metodo para obtener el icono del producto Snickers.
     * @return retorna el ImageIcon del producto correspondiente.
     */
    @Override
    public ImageIcon getIcon(){
        return imagen;
    }
}
