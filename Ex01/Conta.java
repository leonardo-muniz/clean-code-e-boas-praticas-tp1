package Ex01;

class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta: " + nome + " - Saldo: " + saldo;
    }
}