public class Main {
    public static void main(String[] args) {

        double temperaturaCelsius = 27;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = "%.1f graus celsius equivale a %.1f graus fahrenheit".formatted(temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);
    }
}