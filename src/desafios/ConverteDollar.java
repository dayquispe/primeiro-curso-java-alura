package desafios;

public class ConverteDollar {
    public static void main(String[] args) {
        // 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares;
        valorEmDolares = 8.30;

        double valorReal = valorEmDolares * 4.94;

        System.out.println(" o valor de U$" + valorEmDolares + " comvertendo para Real é R$" + valorReal);

    }
}
