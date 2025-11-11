package Ex12;

class MetodoPagamentoInvalidoException extends RuntimeException {
    public MetodoPagamentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}