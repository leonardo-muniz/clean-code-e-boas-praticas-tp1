package Ex04;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        livros.add(new Livro(titulo));
    }

    public boolean emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                livro.emprestar();
                return true;
            }
        }
        return false;
    }

    public boolean devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                return true;
            }
        }
        return false;
    }

    public void listarLivros() {
        System.out.println("=== Catálogo da Biblioteca ===");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}