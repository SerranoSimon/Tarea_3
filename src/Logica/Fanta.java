package Logica;

/**
 * Clase que representa una Fanta y hereda de bebida
 */
public class Fanta extends Bebida {
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Fanta(int serie){
        super(serie);

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Fanta";
    }
}