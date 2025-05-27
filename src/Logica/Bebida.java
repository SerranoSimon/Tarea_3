package Logica;

/**
 * Clase que representa un Bebida y hereda de Producto
 * no agrega atributos ni metodos nuevos, es solo para clasificar.
 */
public abstract class Bebida extends Producto {
    /**
     * Llama al constructor de Producto
     * @param serie le da la serie al constructor de Producto
     */
    public Bebida(int serie){
        super(serie);
    }

}
