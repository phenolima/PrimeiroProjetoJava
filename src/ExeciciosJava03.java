import java.util.Scanner;

public class ExeciciosJava03 {
    public static void main(String[] args) {

        // 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número");
//        int numeroDigitado = scanner.nextInt();
//
//        if (numeroDigitado > 0){
//            System.out.println("O numero é positivo");
//        } else if (numeroDigitado < 0) {
//            System.out.println("O número é negativo");
//        }else {
//            System.out.println("O numero é neutro");
//        }

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
    }
}
