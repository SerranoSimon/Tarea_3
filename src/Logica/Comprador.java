package Logica;

/**
 *La clase comprador representa una compra en el expendedor
 * el constructor realiza automáticamente la compra, el consumo del producto y calcula el vuelto.
 */
public class Comprador {
    private String consumido;
    private int vuelto;

    /**
     *Constructor que realiza una compra en el expendedor
     * si nos encontramos en un caso exitoso, consume el producto y calcula el vuelto
     * @param m moneda que se utiliza para realizar la compra, puede ser nula
     * @param seleccion numero que representa al producto seleccionado
     * @param exp expendedor donde se realiza la compra
     * @throws PagoIncorrectoException si la moneda es nula
     * @throws NoHayProductoException si no hay stock o se ingresa un número inválido
     * @throws PagoInsuficienteException si la moneda es de un valor menor al precio del producto
     */
    public Comprador(Moneda m, Productos seleccion, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        exp.comprarProducto(m, seleccion);
        Producto p=exp.getProducto();
        consumido = p.consumir();
        Moneda temp;
        while ((temp = exp.getVuelto()) != null) {
            vuelto += temp.getValor();
        }
    }

    /**
     *
     * @return el nombre del producto
     */
    public String queConsumiste() {
        return consumido;
    }

    /**
     *
     * @return un valor int que representa al vuelto
     */
    public int cuantoVuelto() {
        return vuelto;
    }
}