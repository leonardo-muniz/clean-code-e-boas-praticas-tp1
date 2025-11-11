package Ex03;

import java.util.ArrayList;
import java.util.List;

class CarrinhoService {
    private List<ItemCarrinho> itens;

    public CarrinhoService() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new ItemCarrinho(nome, preco, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }
}