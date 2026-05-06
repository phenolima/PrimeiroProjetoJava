public class Main {
    public static void main(String[] args) {

        double temperaturaCelcius = 27;
        double temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;

        String mensagem = """
                %.1f graus celsius equivale a %.1f graus fahrenheit 
                """;

        System.out.println(mensagem.formatted(temperaturaCelcius, temperaturaFahrenheit));
    }
}