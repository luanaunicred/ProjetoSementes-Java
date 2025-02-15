import java.util.Scanner;

public class Desafio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCerto = "aluno";
        String senhaCerta = "segredo";

        int tentativas = 0;
        final int max_tentativas = 3;

        while (tentativas < max_tentativas) {
            System.out.println("Digite o usuário: ");
            String usuario = scanner.nextLine();

            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCerto) && senha.equals(senhaCerta)) {
                System.out.println("Login efetuado com sucesso!!!");
                break;
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + (max_tentativas - tentativas));
            }
        }

        if (tentativas == max_tentativas) {
            System.out.println("Conta bloqueada. Número máximo de tentativas excedido.");
        }

        scanner.close();
    }
}
