import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.printf("A média final do aluno é: %.2f\n", media);

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }

            System.out.println("Deseja realizar um novo cálculo? (s/n)");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
