package Ex06;

import java.util.List;

public class RelatorioFinanceiro {

    public void gerarRelatorio(List<String> clientes, List<Double> saldos) {
        imprimirCabecalho();
        imprimirCorpo(clientes, saldos);
        imprimirRodape();
    }

    private void imprimirCabecalho() {
        System.out.println("=== Relatório Financeiro ===");
    }

    private void imprimirCorpo(List<String> clientes, List<Double> saldos) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(formatarLinha(clientes.get(i), saldos.get(i)));
        }
    }

    private String formatarLinha(String cliente, double saldo) {
        return "Cliente: " + cliente + " - Saldo: R$ " + String.format("%.2f", saldo);
    }

    private void imprimirRodape() {
        System.out.println("===========================");
        System.out.println("Fim do Relatório");
    }
}