package desafios;

import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        // 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite um número: ");
        int numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Você digitou zero, número nulo");
        }
    }
}
