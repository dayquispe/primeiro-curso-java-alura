package desafios;

public class CalculaPreco {
    public static void main(String[] args) {
        // 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 30.4;
        int quantidade = 4;

        double valorTotal = precoProduto * quantidade;

        String texto = """
                O produto custa %f,
                Quantidade: %d
                Total: %f
                """.formatted(precoProduto, quantidade, valorTotal);
        System.out.println(texto);
    }
}
