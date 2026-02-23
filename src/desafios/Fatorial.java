package desafios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite um número: ");
        int numero = leitura.nextInt();

        int fatorial = numero;

        System.out.println(numero);
        for (int i=numero-1; i > 0; i--) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + numero + " é " + fatorial);

    }
}
