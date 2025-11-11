package Ex05;

import java.util.ArrayList;
import java.util.List;

class SistemaBancarioService {
    private List<Conta> contas;

    public SistemaBancarioService() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(String titular, double saldoInicial) {
        contas.add(new Conta(titular, saldoInicial));
    }

    public boolean transferir(String origem, String destino, double valor) {
        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);

        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    public Conta buscarConta(String titular) {
        for (Conta conta : contas) {
            if (conta.getTitular().equalsIgnoreCase(titular)) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> listarContas() {
        return contas;
    }
}