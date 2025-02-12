import java.util.Scanner;

public class Desafio1
{
    public static void main(String[] args)
    {
        Scanner produto = new Scanner(System.in);

        System.out.println("Olá, temos apenas 3 tipos de bebidas:");
        System.out.println("1. Cerveja");
        System.out.println("2. Refrigerante");
        System.out.println("3. Água");
        System.out.print("Escolha a bebida que deseja comprar, digitando a opção correta: ");

        int opcao = produto.nextInt();

        if (opcao == 1)
        {
            System.out.println("Você selecionou cerveja. Informe sua idade: ");
            int idade = produto.nextInt();

            if (idade < 18)
            {
                System.out.println("Compra negada. Menores de 18 anos não podem consumir bebida alcoolica.");
            } else
            {
                System.out.println("Compra efetuada com sucesso.");
            }
        } else if (opcao == 2)
        {
            System.out.println("Você escolheu refrigerante. Compra efetuada com sucesso.");
        } else if (opcao == 3)
        {
            System.out.println("Você escolheu água. Compra efetuada com sucesso.");
        } else
        {
            System.out.println("Opção inválida. Escolha uma opção válida.");
        }
        produto.close();
    }
}