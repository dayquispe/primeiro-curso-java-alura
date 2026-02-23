package desafios;

public class Desafios {
    public static void main(String[] args) {
        double temperaturaCelcius = 20.45;

        double paraFahrenheit = (int) (temperaturaCelcius + 1.8) + 32;

        // Imprimir valor sem casa decimais
        System.out.println("O valor convertido para Fahrenheit é " + paraFahrenheit);

    }
}
