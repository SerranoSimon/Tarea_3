package Logica;

import javax.swing.*;

/**
 * Clase abstracta Moneda, cada moneda tiene un valor y una serie dada por su HashCode
 * implementa Comparable para así compararlas por su valor
 */
public abstract class Moneda implements Comparable<Moneda>{
    /**
     * Constructor por defecto
     */
    public Moneda(){
    }

    /**
     *
     * @return la instancia de la moneda como su serie
     */
    public Moneda getSerie(){
        return this;
    }

    /**
     *
     * @return numero entero que es el valor de la moneda
     */
    public abstract int getValor();

    /**
     *
     * @return String que especifica el valor y la serie de la moneda
     */
    @Override
    public String toString(){
        return "valor: "+getValor()+" y serie: "+this.hashCode();
    }

    /**
     * Compara la moneda con otra de acuerdo a su valor
     * @param m la moneda con la cual se compara
     * @return 1 si la moneda es mayor, -1 si es menor y 0 si son iguales en valor
     */
    @Override
    public int compareTo(Moneda m){
        if(this.getValor()>m.getValor()){
            return 1;
        }
        else if(this.getValor()<m.getValor()){
            return -1;
        }
        else{
            return 0;
        }
    }

    /**
     * metodo que permite obtener el icono de cada tipo de moneda.
     * @return retorna la imagen de la moneda especifica.
     */
    public abstract ImageIcon getIcon();

}
