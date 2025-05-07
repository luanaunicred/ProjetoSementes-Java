import java.util.HashSet;

public class Desafio14 {
    public static void main(String[] args) {
        String[] nomes = {
                "Luana", "Diogo", "Ceci", "Marley", "Mel", "Nelson", "Nair", "Elaine", "Jorge", "Rita", "Diogo",
                "Marley", "Mel", "Ceci", "Maria", "Andrea", "Carmen", "Joana", "Luana", "Rita"
        };

        String[] nomesUnicos = new String[nomes.length];
        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < contador; j++) {
                if (nomes[i].equals(nomesUnicos[j])) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                nomesUnicos[contador] = nomes[i];
                contador++;
            }
        }

        System.out.println("Nomes únicos após remover duplicatas: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(nomesUnicos[i]);
        }
    }
}
