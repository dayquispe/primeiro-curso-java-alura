package desafios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite um número: ");
        int numero = leitura.nextInt();

        if (numero % 2 == 0 && numero != 0) {
            System.out.println("Número " + numero + " é PAR");
        } else if (numero % 2 == 1) {
            System.out.println("Número " + numero + " é ÍMPAR");
        } else {
            System.out.println("Número 0 é nulo");
        }
    }
}
