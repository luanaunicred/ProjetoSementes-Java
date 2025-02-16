import java.util.HashSet;

public class Desafio14 {
    public static void main(String[] args) {
        String[] nomes = {
                "Luana", "Diogo", "Ceci", "Marley", "Mel", "Nelson", "Nair", "Elaine", "Jorge", "Rita", "Diogo",
                "Marley", "Mel", "Ceci", "Maria", "Andrea", "Carmen", "Joana", "Luana", "Rita"
        };

        HashSet<String> nomesUnicos = new HashSet<>();
        for (String nome : nomes) {
            nomesUnicos.add(nome);
        }

        System.out.println("Nomes únicos após remover duplicatas: ");
        for (String nome : nomesUnicos) {
            System.out.println(nome);
        }
    }
}
