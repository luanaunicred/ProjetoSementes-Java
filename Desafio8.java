import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int numero;

        do {
            System.out.println("Digite um número inteiro entre 1 e 10: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Valor inválido! Por favor, digite um número entre 1 e 10.");
            }
        } while (numero < 1 || numero > 10);

        System.out.println("Tabuada do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
