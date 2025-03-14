import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 7
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);

        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // capturando palpite
            System.out.println("Digite o palpite entre 0 à 100:");
            int palpite = scanner.nextInt();

            tentativas++;

            // Comparações
            if (tentativas == 5) {
                System.out.println("Perdeu! Seu número de tentativas acabou!");
                break;
            }

            if (palpite > numeroAleatorio) {
                System.out.println("O número aleatório é menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número aleatório é maior");
            } else {
                System.out.println("Parabéns você acertou: " + numeroAleatorio);
                break;
            }
        }
    }
}
