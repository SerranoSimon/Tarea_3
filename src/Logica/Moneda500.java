package Logica;

/**
 * Clase que hereda de Moneda y representa una moneda de $500
 */
public class Moneda500 extends Moneda{
    /**
     * El constructor llama al constructor de Moneda
     */
    public Moneda500(){
        super();
    }
    /**
     *
     * @return el valor de la moneda en pesos
     */
    @Override
    public int getValor() {
        return 500;
    }
}
