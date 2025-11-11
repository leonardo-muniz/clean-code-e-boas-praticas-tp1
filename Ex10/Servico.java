package Ex10;

public class Servico {

    public void processar(String dado) {
        if (dado == null) {
            throw new IllegalArgumentException("O dado não pode ser nulo.");
        }
        System.out.println("Processando: " + dado.toUpperCase());
    }
}