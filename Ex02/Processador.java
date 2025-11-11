package Ex02;

public class Processador {

    public void processar(String dado) {
        if (isDadoInvalido(dado)) {
            System.out.println("Dado inválido.");
            return;
        }

        if (isDadoCurto(dado)) {
            System.out.println("Dado muito curto.");
            return;
        }

        System.out.println("Dado válido: " + dado);
    }

    private boolean isDadoInvalido(String dado) {
        return dado == null || dado.isEmpty();
    }

    private boolean isDadoCurto(String dado) {
        return dado.length() <= 10;
    }
}