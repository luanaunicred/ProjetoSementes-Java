import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Parabéns, mais uma venda fechada!!!");
        System.out.println("Informe o nome do imóvel (Usar o formato -> 00.000,00):");
        String nomeImovel = scanner.nextLine();

        System.out.println("Informe o valor do imóvel:");
        double valorImovel = scanner.nextDouble();

        double comissao;

        if (valorImovel >= 50000){
            comissao = valorImovel * 0.20;
        } else if (valorImovel >= 30000) {
            comissao = valorImovel * 0.15;
        } else {
            comissao = valorImovel * 0.10;
        }

        DecimalFormat df = new DecimalFormat("#,##0.00");
        String valorImovelReais = df.format(valorImovel);
        String comissaoReais = df.format(comissao);

        System.out.println("Imóvel: " + nomeImovel);
        System.out.println("Valor do imóvel: R$ " + valorImovelReais);
        System.out.println("Valor da comissão: R$ " + comissaoReais);

        scanner.close();
    }
}
