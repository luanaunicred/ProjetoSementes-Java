import java.util.Scanner;


public class Desafio3
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a nota da primeira prova: ");
        double n1 = scanner.nextDouble();
        System.out.println("Informe a nota da segunda prova: ");
        double n2 = scanner.nextDouble();
        System.out.println("Informe a nota da terceira prova: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("A média do aluno %s foi de %.2f:\n", nome, media);

        if (media >= 7)
        {
            System.out.printf("Parabéns, o aluno %s está aprovado com média de: %.2f", nome, media);
        } else if (media >= 5)
        {
            System.out.printf("Atenção, o aluno %s está em recuperação com média de: %.2f", nome, media);
        } else
        {
            System.out.printf("Infelizmente, o aluno %s está reprovado com média de: %.2f", nome, media);
        }

        scanner.close();
    }
}
