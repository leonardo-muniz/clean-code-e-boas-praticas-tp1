package Ex01;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    private List<Conta> contas;

    public SistemaFinanceiro() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(String nome, double valorInicial) {
        contas.add(new Conta(nome, valorInicial));
    }

    public void processarPagamentos(double taxa) {
        for (Conta conta : contas) {
            conta.debitar(taxa);
        }
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório Financeiro ===");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}