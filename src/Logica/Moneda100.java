package Logica;

/**
 * Clase que hereda de Moneda y representa una moneda de $100
 */
public class Moneda100 extends Moneda {
    /**
     * El constructor llama al constructor de Moneda
     */
    public Moneda100(){
        super();
    }

    /**
     *
     * @return el valor de la moneda en pesos
     */
    @Override
    public int getValor() {
        return 100;
    }
}
