package Ex05;

public class SistemaBancario {
    public static void main(String[] args) {
        SistemaBancarioService banco = new SistemaBancarioService();

        banco.criarConta("Alice", 1000.0);
        banco.criarConta("Bob", 500.0);

        System.out.println("=== Contas Iniciais ===");
        for (Conta conta : banco.listarContas()) {
            System.out.println(conta);
        }

        System.out.println("\n--- Tentando transferir R$ 200 de Alice para Bob ---");
        if (banco.transferir("Alice", "Bob", 200.0)) {
            System.out.println("✅ Transferência realizada com sucesso!");
        } else {
            System.out.println("❌ Erro na transferência.");
        }

        System.out.println("\n=== Contas Após Transferência ===");
        for (Conta conta : banco.listarContas()) {
            System.out.println(conta);
        }
    }
}