import java.util.Scanner;

public class ExerciciosJava03 {
    public static void main(String[] args) {

        // 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado > 0){
            System.out.println("O numero é positivo");
        } else if (numeroDigitado < 0) {
            System.out.println("O número é negativo");
        }else {
            System.out.println("O numero é neutro");
        }

        // 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite um número");
        int numeroDigitado1 = scanner2.nextInt();
        System.out.println("Digite um segundo número");
        int numeroDigitado2 = scanner2.nextInt();

        if (numeroDigitado1 == numeroDigitado2){
            System.out.println("Os numeros sao iguais");
        } else {
            System.out.println("os numeros nao diferentes");
        }

        if (numeroDigitado1 > numeroDigitado2) {
            System.out.println("O primeiro número é maior que o segundo numero");
        } else if (numeroDigitado1 < numeroDigitado2) {
            System.out.println("O segundo número é maior que o primeiro numero");
        }

        //3
        Scanner scanner = new Scanner(System.in);

        String mensagem = """
                Seja bem vindo a calcularora de área!
                1 - Calcular área de um quadrado
                2 - Calcular área de um círculo""";
        System.out.println(mensagem);

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o valor de um dos lados do quadrado:");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = Math.pow(ladoQuadrado, 2);
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            case 2:
                System.out.println("Digite o valor do raio do círculo:");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        //4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero que voce quer ver a tabuada: ");
        int numero = scanner.nextInt();
        int i;

        for (i = 1; i <= 10; i++){
            System.out.println(i + " X " + numero + " = " + i * numero);
        }

        //5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificando se o numero é ímpar ou par, digite um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Este número é par");
        }else {
            System.out.println("Este número é ímpar");
        }

        //6
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calulando o fatorial, digite um numero: ");
        int numero = scanner.nextInt();
        int fatorial=1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
    }
}
