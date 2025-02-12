import java.util.Scanner;

public class Desafio4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("# # # Calculadora Simples # # #");

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Escolha a operação que deseja realizar:");

        int opcao = scanner.nextInt();

        if (opcao > 4)
        {
            System.out.println("Opção inválida. Selecione uma opção entre 1 e 4.");
            scanner.close();
        } else
        {

        System.out.println("Informe o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Informe o segundo valor:");
        double valor2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcao)
        {
            case 1:
                resultado = valor1 + valor2;
                System.out.println("O resultado da adição: " + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("O resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("O resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (valor2 != 0)
                {
                    resultado = valor1 / valor2;
                    System.out.println("O resultado da divisão: " + resultado);
                    break;
                } else
                {
                    System.out.println("ERRO! Divisão por zero não é permitida!");
                }
                break;
        }
        scanner.close();
        }
    }
}