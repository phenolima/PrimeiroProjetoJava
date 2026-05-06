public class Main {
    public static void main(String[] args) {

        double temperaturaCelsius = 27;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = "%.1f graus celsius equivale a %.1f graus fahrenheit".formatted(temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);

        // 1
        double nota1 = 7.5;
        double nota2 = 6.43;

        double media = (nota1 + nota2) /2;

        System.out.println("A media é: " + media);

        // 2
        double numero1 = 30.6;
        int numero2 = 25;

        System.out.println("A variavel do tipo double convertida a inteiro é: " + (int) numero1);

        // 3
        char mensagem1 = 'O';
        String mensagem2 = " Brasil vai ser hexa";

        System.out.println(mensagem1 + mensagem2);


        // 4
        double precoProduto = 50;
        int quantidade = 20;
        double valorTotal = precoProduto * quantidade;
        String mensagemValorTotal = "O valor total da compra é: $RS %.2f".formatted(valorTotal);

        System.out.println(mensagemValorTotal);

        // 5
        double valorEmDolares = 1;
        double taxaDeCambio = 4.94;
        double valorEmReais = taxaDeCambio * valorEmDolares;
        String mensagemValorEmReais = "%.2f dolares equivale a %.2f reais".formatted(valorEmDolares,valorEmReais);

        System.out.println(mensagemValorEmReais);
    }
}