import java.util.Scanner;

public class SuaConta {
    public static void main(String[] args) {
        String nome = "Francisco";
        String tipoConta = "Conta Corrente";
        double Saldo = 1599.99;
        int opcao = 0;

        System.out.println("\n***AppBancário***");
        System.out.println("\n**Dados do Cliente**");
        System.out.println("************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + Saldo);
        System.out.println("************************");

        String menu = """
                ** Escolha uma opção para iniciar**
                
                1 - Consultar Saldo
                2 - Tranferência
                3 - Receber transferência
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(" O seu saldo é: " + Saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > Saldo) {
                    System.out.println(" Seu saldo é insuficiente para transferir");
                } else {
                    Saldo -= valor;
                    System.out.println("Novo Saldo" + Saldo);
                }
            } else if (opcao == 3) {
                    System.out.println("valor recebido: ");
                    double valor = leitura.nextDouble();
                    Saldo += valor;
                    System.out.println("Novo Saldo" + Saldo);
                } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}

