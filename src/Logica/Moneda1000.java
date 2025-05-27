package Logica;

/**
 * Clase que hereda de Moneda y representa una moneda de $1000
 */
public class Moneda1000 extends Moneda{
    /**
     * El constructor llama al constructor de Moneda
     */
    public Moneda1000(){
        super();
    }
    /**
     *
     * @return el valor de la moneda en pesos
     */
    @Override
    public int getValor() {
        return 1000;
    }
}
