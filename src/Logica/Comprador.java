package Logica;

import java.util.ArrayList;

/**
 *La clase comprador representa una compra en el expendedor
 * el constructor realiza automáticamente la compra, el consumo del producto y calcula el vuelto.
 */
public class Comprador {
    private String consumido;
    private Moneda monedaSelecc;
    private ArrayList<Moneda> billetera;

    /**
     *Constructor que realiza una compra en el expendedor
     * si nos encontramos en un caso exitoso, consume el producto y calcula el vuelto


     */
    public Comprador(){
        this.billetera=new ArrayList<>();
        this.monedaSelecc=null;

    }
    public void comprarProducto(Moneda m, Productos seleccion, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        exp.comprarProducto(m, seleccion);

    }

    /**
     *
     * @return el nombre del producto
     */
    public String queConsumiste() {
        return consumido;
    }
    public Moneda getMonedaSeleccionada(){
        return monedaSelecc;
    }
    public void setMonedaSelecc(Moneda moneda){
        monedaSelecc=moneda;
    }
    public ArrayList<Moneda> getBilletera(){
        return billetera;
    }


}