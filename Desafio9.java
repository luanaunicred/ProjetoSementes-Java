import java.util.Scanner;

public class Desafio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2 = 0;
        do {
            System.out.println("Informe o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();

            if (valor2 == 0) {
                System.out.println("O segundo valor não pode ser zero. Por favor, informe um novo valor:");
            }
        } while (valor2 == 0);

        double resultado = valor1 / valor2;
        System.out.printf("O resultado da divisão é: " + String.format("%.2f",resultado));

    scanner.close();
    }
}
