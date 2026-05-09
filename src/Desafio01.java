import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "Pedro Henrique Oliveira Lima";
        String tipoConta = "Corrente";
        double saldo = 3000;
        int operacao = 0;

        String mensagemInicial = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(nomeCliente, tipoConta, saldo);

        System.out.println(mensagemInicial);

        while (operacao != 4) {
            String mensagemOperacoes = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """;
            System.out.println(mensagemOperacoes);
            operacao = scanner.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Seu saldo é: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que voce vai receber: ");
                    double valorReceber = scanner.nextDouble();
                    saldo = saldo + valorReceber;
                    System.out.println("Novo saldo: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que voce vai enviar: ");
                    double valorEnviar = scanner.nextDouble();
                    if (saldo < valorEnviar ){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorEnviar;
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo da conta, até mais!");
                    break;
                default:
                    System.out.println("Opcao inválida");
                    break;
            }
        }
    }
}
