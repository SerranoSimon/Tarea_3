package Logica;

/**
 * Exception que se lanza si se intenta comprar un producto que no existe o se ingresa un índice inválido.
 * se devuelve la misma moneda.
 */
public class NoHayProductoException extends Exception {
    /**
     *Crea una nueva exception con un mensaje personalizado.
     * @param message describe el motivo del error.
     */
    public NoHayProductoException(String message) {
        super(message);
    }
}
