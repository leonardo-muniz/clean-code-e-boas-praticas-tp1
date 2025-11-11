package Ex03;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoService carrinho = new CarrinhoService();

        carrinho.adicionarItem("Mouse", 120.0, 1);
        carrinho.adicionarItem("Teclado", 230.0, 2);

        double total = carrinho.calcularTotal();
        System.out.println("Total da compra: R$ " + total);
    }
}