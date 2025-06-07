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

    }
}






