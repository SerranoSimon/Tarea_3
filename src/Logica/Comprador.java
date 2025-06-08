package Logica;

import java.util.ArrayList;

/**
 *La clase comprador representa una compra en el expendedor
 * el constructor realiza automáticamente la compra, el consumo del producto y calcula el vuelto.
 */
public class Comprador {
    private Moneda monedaSelecc;
    private ArrayList<Moneda> billetera;

    /**
     * Constructor de comprador que inicializa una nueva billetera y especifica que no hay una moneda seleccionada al comienzo.
     */
    public Comprador(){
        this.billetera=new ArrayList<>();
        this.monedaSelecc=null;

    }

    /**
     * metodo que permite realizar la compra de un producto en expendedor.
     * @param m moneda con la que se comprará el producto.
     * @param seleccion tipo de producto elegido para realizar la compra.
     * @param exp expendedor donde se realiza la compra.
     * @throws PagoIncorrectoException En caso de que la moneda sea nula.
     * @throws NoHayProductoException En caso de que no haya un producto disponible en el deposito.
     * @throws PagoInsuficienteException En caso de que el valor de la moneda seleccionada sea menor al precio del producto.
     */
    public void comprarProducto(Moneda m, Productos seleccion, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        exp.comprarProducto(m, seleccion);

    }

    /**
     * metodo que muestra el producto consumido.
     * @return String del producto consumido.
     */


    /**
     * metodo para obtener la moneda seleccionada en el comprador (moneda a usar)
     * @return retorna la moneda seleccionada por el usuario.
     */
    public Moneda getMonedaSeleccionada(){
        return monedaSelecc;
    }

    /**
     * metodo para definir las moneda a seleccionar por el usuario.
     * @param moneda a seleccionar.
     */
    public void setMonedaSelecc(Moneda moneda){
        monedaSelecc=moneda;
    }

    /**
     * metodo para obtener la billetera a utilizar, se refiere a su contenido.
     * @return billetera del comprador.
     */
    public ArrayList<Moneda> getBilletera(){
        return billetera;
    }


}