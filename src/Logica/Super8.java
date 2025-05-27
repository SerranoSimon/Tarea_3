package Logica;

/**
 * CLase que representa un Super 8 y hereda de Dulce
 */
public class Super8 extends Dulce{
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Super8(int serie){
        super(serie);

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Super8";
    }
}
