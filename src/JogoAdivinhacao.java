import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        int tentativas = 1;

        System.out.println("Jogo da Adivinhacao");

        while(tentativas <= 5){
            System.out.println("Tentativa " + tentativas + ", digite um numero: ");
            int numeroDigitado = scanner.nextInt();
            tentativas++;

            if(numeroDigitado == numeroSorteado) {
                System.out.println("Parabens voce acertou!!!");
                break;
            }else if (numeroSorteado < numeroDigitado){
                System.out.println("O numero sorteado é menor que o numero informado");
            } else{
                System.out.println("O numero sorteado é maior que o numero informado");
            }
        }

        if (tentativas > 5){
            System.out.println("Voce atingiu o numero maximo de tentativas, o numero sorteado era " + numeroSorteado + ". Reinicie a aplicacao");
        }

    }
}