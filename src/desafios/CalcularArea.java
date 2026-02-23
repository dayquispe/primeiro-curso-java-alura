package desafios;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CalcularArea {
    public static void main(String[] args) {
        // 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n" +
                "[1] Calcular área do quadrado\n" +
                "[2] Calcular área do círculo\n" +
                ": ");

        int escolhido = leitura.nextInt();

        System.out.println("--------------------------------------------");
        if (escolhido == 1) {
            System.out.println("Calcular área do quadrado: ");

            System.out.println("Digite o tamanho do Lado: ");
            double lado = leitura.nextDouble();

            System.out.println("Digite o tamanho do Altura: ");
            double altura = leitura.nextDouble();

            double area = lado * altura;

            System.out.println("A área do quadrado é " + area + "m2");

        } else {
            System.out.println("Calcular área do círculo");

            System.out.println("Digite o tamanho do Raio: ");
            double lado = leitura.nextDouble();
            double areaCirculo = lado * PI;

            System.out.println("A área do circulo é " + areaCirculo + "m2");

        }
    }
}
