package desafios;

public class Desconto {
    public static void main(String[] args) {
        // 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal;
        precoOriginal = 100;

        double percentualDesconto;
        percentualDesconto = precoOriginal - (0.1 * precoOriginal);
        System.out.println("Valor sem desconto: R$" + precoOriginal + ". Valor com desconto de 10%: R$" + percentualDesconto);

    }
}
