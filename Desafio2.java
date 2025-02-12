import java.util.Scanner;

public class Desafio2
{
    public static void main(String[] args)
    {
        System.out.println("Olá, vamos registrar os produtos que você comprou!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.println("Informe o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        double valorTotal = preco * quantidade;
        double desconto = 0;

        if (quantidade >= 11 && quantidade <= 20)
        {
            desconto = 10;
        } else if (quantidade >= 21 && quantidade <= 50)
        {
            desconto = 20;
        } else if (quantidade > 50)
        {
            desconto = 25;
        }

        double valorFinal = valorTotal - (valorTotal * desconto) / 100;

        System.out.printf("Você comprou %d itens de %s.\n", quantidade, produto);
        System.out.printf("O valor total da sua compra foi de: R$ %.2f\n", valorTotal);

        if (desconto > 0) {
            System.out.printf("Para esta compra, você receberá %.0f%% de desconto.\n", desconto);
        } else {
            System.out.println("Para esta compra nenhum desconto foi aplicado.");
        }

        System.out.printf("O valor final da sua compra é: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}