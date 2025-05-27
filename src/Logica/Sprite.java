package Logica;

/**
 * CocaCola hereda de Bebida
 */
public class Sprite extends Bebida {
    /**
     * Se llama al constructor de Bebida
     * @param serie le da serie como parametro al constructor de Bebida
     */
    public Sprite(int serie){
        super(serie);

    }
    /**
     * Definimos el metodo consumir reescribiendolo
     * @return la bebida que se consumió
     */
    @Override
    public String consumir() {
        return "Sprite";
    }
}
