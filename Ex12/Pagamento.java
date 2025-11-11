package Ex12;

public class Pagamento {

    public void processarPagamento(double valor, String metodo) {
        if (metodo == null || metodo.isBlank()) {
            throw new IllegalArgumentException("O método de pagamento não pode ser nulo ou vazio.");
        }

        switch (metodo.toLowerCase()) {
            case "cartao":
                System.out.println("Pagamento de R$" + valor + " realizado via cartão.");
                break;
            case "boleto":
                System.out.println("Pagamento de R$" + valor + " realizado via boleto.");
                break;
            default:
                throw new MetodoPagamentoInvalidoException(
                    "Método de pagamento inválido: " + metodo);
        }
    }
}