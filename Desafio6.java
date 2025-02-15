import java.util.Scanner;

public class Desafio6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Digite um número inteiro de 1 a 10: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 1 && numero <= 10) {
                    System.out.println("Você digitou: " + numero);
                    if (numero == 10) {
                        System.out.println("Número 10 digitado. Encerrando o programa...");
                        break;
                    }
                } else {
                    System.out.println("Erro: O número deve estar entre 1 e 10. Tente novamente.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
