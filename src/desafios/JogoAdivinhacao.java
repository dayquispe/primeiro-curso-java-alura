package desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        //Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
        //
        //Dicas:
        //
        //Para gerar um número aleatório em Java: new Random().nextInt(100);
        //Utilize o Scanner para obter os dados do usuário;
        //Utilize uma variável para contar as tentativas;
        //Utilize um loop para controlar as tentativas;
        //Utilize a instrução break; para interromper o loop.
        int numeroAleatorio = new Random().nextInt(100);
        int contagem = 5;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Você tem 5 tentativas para adivinhar o número secreto: ");
        for (int i = 1; i < 6; i++ ){
            System.out.println(i + "° tentativa.");
            System.out.println("Digite aqui: ");
            int numeroAdivinhado = leitura.nextInt();
            contagem--;
            if (numeroAdivinhado == numeroAleatorio) {
                System.out.println("Parabéns você adivinhou!");
                break;
            }
            else {
                if (contagem != 0) {
                    System.out.println("Você errou tente novamente!");
                    if (numeroAleatorio > numeroAdivinhado) {
                        System.out.println("O número secreto é maior!");
                    } else {
                        System.out.println("O número secreto é menor!");
                    }
                } else {
                    System.out.println("Você não conseguiu adivinhar!");
                }

            }
        }
        System.out.println("O Número secreto era: " + numeroAleatorio);
    }
}
