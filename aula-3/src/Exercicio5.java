import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int media = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota:");
            int nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido!");
                i--;
            }

            media += nota; // media = media + nota;
        }

        media /= 4; // media = media / 4;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 4) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Recuperação!");
        }
    }
}
