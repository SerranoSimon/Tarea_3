package Logica;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class mainEstatico {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        //MONEDAS
        ArrayList<Moneda> mArr = new ArrayList<>();
        mArr.add(new Moneda100());
        mArr.add(new Moneda1000());
        mArr.add(new Moneda500());
        //Ordenar el Array
        Collections.sort(mArr);
        System.out.println("Array de monedas usando ToString");
        System.out.println(mArr);

        /* Numero de Deposito para cada Producto y su Precio:
                0. COCACOLA $800
                1. SPRITE $800
                2. FANTA $700
                3. SUPER8 $300
                4. SNICKERS $600 */


        //CASOS EXITOSOS:
        Expendedor exp1 = new Expendedor(1);
        Comprador c1 = new Comprador(mArr.get(2), 0, exp1);
        System.out.println("Compra 1: Consumiste " + c1.queConsumiste() + " y tu vuelto es $" + c1.cuantoVuelto());
        Comprador c2 = new Comprador(mArr.get(2), 1, exp1);
        System.out.println("Compra 2: Consumiste " + c2.queConsumiste() + " y tu vuelto es $" + c2.cuantoVuelto());
        Comprador c3 = new Comprador(mArr.get(1), 3, exp1);
        System.out.println("Compra 3: Consumiste " + c3.queConsumiste() + " y tu vuelto es $" + c3.cuantoVuelto());
        Comprador c4 = new Comprador(mArr.get(2), 4, exp1);
        System.out.println("Compra 4: Consumiste " + c4.queConsumiste() + " y tu vuelto es $" + c4.cuantoVuelto());
        Comprador c5=new Comprador(mArr.get(2),2,exp1 );
        System.out.println("Compra 5: Consumiste " + c5.queConsumiste() + " y tu vuelto es $" + c5.cuantoVuelto());
        Expendedor exp10=new Expendedor(1);





        //CASO PRODUCTO AGOTADO
        //Usamos exp1 ya que este quedó sin productos de cualquier tipo
        System.out.println("");
        System.out.println("Caso producto agotado: ");
        try {
            Comprador c = new Comprador(mArr.get(2), 2, exp1);

        } catch (NoHayProductoException e) {
            System.out.println("Tipo de error: " + e.getMessage());

        }

        //CASO MONEDA NULA
        System.out.println("");
        System.out.println("Caso moneda nula: ");
        Moneda m = null;
        try {
            Comprador c = new Comprador(m, 0, new Expendedor(1));

        } catch (PagoIncorrectoException e) {
            System.out.println("Tipo de error: " + e.getMessage());
        }
        //CASO PAGO INSUFICIENTE
        System.out.println("");
        System.out.println("Caso pago insuficiente: ");
        try {
            Comprador c = new Comprador(mArr.get(0), 3, new Expendedor(1));
        } catch (PagoInsuficienteException e) {
            System.out.println("Tipo de error: " + e.getMessage());

        }
        //CASO ELECCION FUERA DE RANGO
        System.out.println("");
        System.out.println("Eleccion fuera de rango: ");
        try {
            Comprador c = new Comprador(mArr.get(2), 5, new Expendedor(3));
        } catch (NoHayProductoException e) {
            System.out.println("Tipo de error: " + e.getMessage());
        }
        //MEZCLA DE ERRORES
        System.out.println("");
        System.out.println("Mezcla de errores: ");
        try {
            Comprador c = new Comprador(mArr.get(2), -2, exp1); // Fuera de rango y deposito vacio
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println("Tipo de error: " + e.getMessage());
        }
        try {
            Comprador c = new Comprador(mArr.get(0), 2, exp1); // Pago insuficiente y deposito vacio
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println("Tipo de error: " + e.getMessage());

        }
        try{
            Comprador c=new Comprador(null,3,new Expendedor(0)); //Moneda nula y deposito vacio
        }
        catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println("Tipo de error: " + e.getMessage());
        }
        //Prueba de metodo getSerie()
        System.out.println("");
        System.out.println("Prueba de metodo getSerie: ");
        Expendedor exp2=new Expendedor(2);
        for(int i=0;i<5;i++){
            System.out.println(exp2.comprarProducto(new Moneda1000(),i).getSerie());
            System.out.println(exp2.comprarProducto(new Moneda1000(),i).getSerie());

        }

    }
}






