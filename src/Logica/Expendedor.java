package Logica;

import java.util.ArrayList;

/**
 * La clase Expendedor actúa como una máquina expendedora que vende bebidas y dulces,
 * manejando la lógica de la compra validando los pagos y entregando el vuelto en monedas de 100
 */

public class Expendedor {
    private DepositoGenerico<Producto> coca;
    private DepositoGenerico<Producto> sprite;
    private DepositoGenerico<Producto> fanta;
    private DepositoGenerico<Producto> snickers;
    private DepositoGenerico<Producto> super8;
    private DepositoGenerico<Moneda> MonVu;
    private DepositoGenerico<Moneda> depositoMonedas;
    private Producto productoEntregado;


    /**
     * El Constructor inicia con una cantidad determinada de cada producto, la misma para todos.
     * @param numProductos cantidad con la que se carga cada depósito de productos
     */
    public Expendedor(int numProductos){
        this.coca=new DepositoGenerico<>();
        this.sprite=new DepositoGenerico<>();
        this.fanta=new DepositoGenerico<>();
        this.snickers=new DepositoGenerico<>();
        this.super8=new DepositoGenerico<>();
        this.MonVu=new DepositoGenerico<>();
        this.depositoMonedas=new DepositoGenerico<>();
        for(int i=0; i<numProductos;i++){
            Bebida b1=new Cocacola(100+i);
            Bebida b2=new Sprite(200+i);
            Bebida b3=new Fanta(300+i);
            Dulce e1=new Snickers(400+i);
            Dulce e2=new Super8(500+i);
            coca.add(b1);
            sprite.add(b2);
            fanta.add(b3);
            snickers.add(e1);
            super8.add(e2);

        }

    }

    /**
     *
     * @param producto Tipo de producto que se busca
     * @return Deposito del producto deseado
     */
    public DepositoGenerico<Producto> getDeposito(Productos producto){
        return switch (producto) {
            case COCACOLA -> coca;
            case SPRITE -> sprite;
            case FANTA -> fanta;
            case SUPER8 -> super8;
            case SNICKERS -> snickers;
        };
    }

    /**
     *
     * @return UNA moneda del depósito de vuelto
     */
    public Moneda getVuelto(){
        return MonVu.get();
    }
    public DepositoGenerico<Moneda> getMonVu(){return MonVu;}

    /**
     * Metodo encargado de realizar la compra,La valida recibiendo una moneda y la numeracion
     * del producto deseado considerando las excepciones(Pago insuficiente, No hay producto,
     * Moneda inválida, elección invalida)
     *
     * @param m Moneda con la que se comprará
     * @param seleccion Numero que representa la elección del producto
     * @return El producto deseado
     * @throws NoHayProductoException Si no queda del producto o hubo una elección invalida
     * @throws PagoIncorrectoException Si se pagó con una moneda nula
     * @throws PagoInsuficienteException Si la moneda es de un valor menor al precio del producto
     */
    public void comprarProducto(Moneda m, Productos seleccion) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {

            if(m==null){
                throw new PagoIncorrectoException("Moneda nula");
            }

            if(getDeposito(seleccion).getArr().size()==0){
                MonVu.add(m);
                throw new NoHayProductoException("Producto agotado");
            }
            if(seleccion.getPrecioProducto()> m.getValor()){
                MonVu.add(m);
                throw new PagoInsuficienteException("Pago insuficiente");
            }


            int vuelto= m.getValor() -seleccion.getPrecioProducto();
            depositoMonedas.add(m);

            while (vuelto > 0) {
                while(vuelto>=1000){
                    MonVu.add(new Moneda1000());
                    vuelto-=1000;
                }
                while(vuelto>=500){
                    MonVu.add(new Moneda500());
                    vuelto-=500;
                }
                while(vuelto>=100){
                    MonVu.add(new Moneda100());
                    vuelto-=100;
                }

            }
            switch (seleccion) {
                case FANTA -> productoEntregado=fanta.get();
                case SPRITE -> productoEntregado=sprite.get();
                case COCACOLA -> productoEntregado=coca.get();
                case SNICKERS -> productoEntregado=snickers.get();
                case SUPER8 -> productoEntregado=super8.get();
            }



    }
    public Producto getProducto(){
        return productoEntregado;
    }
}
