package desafios;

import java.util.Scanner;

public class Comparando {
    public static void main(String[] args) {
        //2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero = leitura.nextInt();

        System.out.println("Digite outro número: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero != segundoNumero) {
            System.out.println("Os número são diferentes");
            if (primeiroNumero > segundoNumero) {
                System.out.println("O primeiro número é maior");
            } else {
                System.out.println("O segundo número é maior");
            }
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
