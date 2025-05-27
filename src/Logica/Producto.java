package Logica;

/**
 * Clase abstracta Producto, donde cada producto tendrá un número de serie asociado
 */
public abstract class Producto {
    private int serie;

    /**
     * Asignacion de número de serie
     * @param serie serie la cual será asociada el producto
     */
    public Producto(int serie){
        this.serie=serie;
    }

    /**
     *
     * @return retorna la serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     *
     * @return El producto consumido
     */
    public abstract String consumir();
}
