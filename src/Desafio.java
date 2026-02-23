import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Dayana Quispe";
        String conta = "Corrente";
        double saldo = 250;

        Scanner leitura = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo conta:       " + conta);
        System.out.println("Saldo inicial:    R$" + saldo);
        System.out.println("**********************************************");
        int escolha = 1;
        String menu = """
                Operações:
                [1] Consultar saldos
                [2] Receber valor
                [3] Transferir valor
                [4] Sair
                """;
        while (escolha != 4) {
            System.out.println(menu);

            System.out.println("Digite a opção desejada: ");
            escolha = leitura.nextInt();

            if (escolha <= 0 || escolha >= 5){
                System.out.println("Opção inválida\n");
            } else{
                if (escolha == 1){
                    System.out.println("O saldo atual é de R$ " + saldo);
                } else if (escolha == 2) {
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = leitura.nextDouble();
                    saldo += valorReceber;
                    System.out.println("O seu saldo foi atualizado R$" + saldo);
                } else if (escolha == 3) {
                    System.out.println("Informe o valor que deseja trasnferir:");
                    double valortransferir = leitura.nextDouble();
                    if (saldo >= valortransferir){
                        saldo -= valortransferir;
                        System.out.println("O seu saldo foi atualizado R$" + saldo);
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    }

                }
            }
        }











    }
}
