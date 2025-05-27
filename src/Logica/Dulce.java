package Logica;

/**
 * Clase que representa un Dulce y hereda de Producto
 * no agrega atributos ni metodos nuevos, es solo para clasificar.
 */
public abstract class Dulce extends Producto {
    /**
     *Llama al constructor de Producto.
     * @param serie le da la serie al constructor de Producto.
     */
    public Dulce(int serie){
        super(serie);
    }
}
