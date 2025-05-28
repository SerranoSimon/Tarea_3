package Logica;

/**
 * Enumeración para definir las constantes: Tipo de producto junto a su precio
 */
public enum Productos {
    COCACOLA(800),
    SPRITE(800),
    FANTA(700),
    SUPER8(300),
    SNICKERS(600),
    OTRO(0);

    private final int precioProducto;

    /**
     * Como el precio es constante irá en una variable del tipo final
     * @param precioProducto Precio del Producto
     */
    Productos(int precioProducto){
        this.precioProducto=precioProducto;
    }

    /**
     *
     * @return Retorna el precio del producto deseado
     */
    public int getPrecioProducto() {
        return precioProducto;
    }
}
