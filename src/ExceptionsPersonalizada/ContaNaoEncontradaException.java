package ExceptionsPersonalizada;

public class ContaNaoEncontradaException extends RuntimeException {
    public ContaNaoEncontradaException(String message) {
        super(message);
    }
}
