import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 nomes: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nDigite um nome para buscar: ");
        String buscaNome = scanner.nextLine();

        boolean encontrado = false;

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(buscaNome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Achei.");
        } else {
            System.out.println("Não achei!");
        }

        scanner.close();
    }
}
