import java.util.Scanner;

public class Desafio12 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner((System.in));
        int contaImpares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para a posição " + i + ":");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                contaImpares++;
            }
        }

        System.out.println("A quantidade de valores impares para o vetor de 10 números é: " + contaImpares);
        scanner.close();
    }
}
