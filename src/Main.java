import services.Login;
import services.RegistrarUsuario;
import services.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja Muito Bem Vindo ao BrainForms!!\n");

        while (true) {
            System.out.println("Você deseja fazer verificação de login ou cadastro?");
            System.out.println("L=login");
            System.out.println("C=cadastro\n");
            System.out.print("Digite: ");
            String entrada = scanner.nextLine().toUpperCase();

            if (entrada.equals("L") || entrada.equals("LOGIN")) {
                Login.login(scanner);
                break;  // Sair após o login bem-sucedido
            } else if (entrada.equals("C") || entrada.equals("CADASTRO")) {
                RegistrarUsuario.register(scanner);
                break;  // Sair após o registro bem-sucedido
            } else {
                System.out.println("\nERRO. Sua escolha está inválida!\nREDIRECIONANDO AO MENU INICIAL...\n");
            }
        }

        Menu.selectTopic(scanner);
    }
}
