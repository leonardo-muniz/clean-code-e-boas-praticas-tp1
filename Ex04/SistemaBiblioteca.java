package Ex04;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro("1984");
        biblioteca.adicionarLivro("Dom Casmurro");
        biblioteca.adicionarLivro("O Senhor dos Anéis");

        biblioteca.listarLivros();

        System.out.println("\n-- Empréstimos --");
        if (biblioteca.emprestarLivro("1984")) {
            System.out.println("Livro emprestado: 1984");
        } else {
            System.out.println("Livro não disponível.");
        }

        biblioteca.listarLivros();

        System.out.println("\n-- Devoluções --");
        if (biblioteca.devolverLivro("1984")) {
            System.out.println("Livro devolvido: 1984");
        } else {
            System.out.println("Livro não encontrado.");
        }

        biblioteca.listarLivros();
    }
}