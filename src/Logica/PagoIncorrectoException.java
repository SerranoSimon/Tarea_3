package Logica;

/**
 * Exception que se lanza si la moneda es nula.
 * no entrega ni producto ni vuelto.
 */
public class PagoIncorrectoException extends Exception {
    /**
     *Crea una nueva exception con mensaje personalizado.
     * @param message describe el motivo del error.
     */
    public PagoIncorrectoException(String message) {
        super(message);
    }
}
