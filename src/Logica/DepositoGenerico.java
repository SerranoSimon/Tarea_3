package Logica;

import java.util.ArrayList;

/**
 *Clase DepositoGenerico, representa un depósito que puede ser utilizado para distintos tipos de objetos
 * @param <T> tipo de objetos que almacenará el depósito
 */
public class DepositoGenerico<T> {
    private ArrayList<T> objs;

    /**
     *Crea un depósito vacío para almacenar objetos
     */
    public DepositoGenerico(){
        objs=new ArrayList<>();
    }

    /**
     *Agrega un objeto al depósito
     * @param obj objeto que se agrega
     */
    public void add (T obj){
        objs.add(obj);
    }

    /**
     *obtiene el primer objeto del depósito y lo remueve
     * @return el primer objeto del depósito, o null
     */
    public T get() {
        if (objs.isEmpty()) return null;
        return objs.remove(0);
    }

    /**
     *retorna el arreglo para comprobar si está vacío
     * @return lista de objetos almacenados
     */
    public ArrayList<T> getArr(){
        return  objs;
    }

}

