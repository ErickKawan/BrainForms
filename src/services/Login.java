package services;

import models.User;

import java.util.Scanner;

public class Login {
    public static void login(Scanner scanner) {
        System.out.println("\nVamos iniciar seu login\n");
        System.out.print("Insira seu e-mail: ");
        String email = scanner.nextLine();

        if (ValidarEmail.validateEmail(email)) {
            System.out.println("\nE-mail válido! Podemos prosseguir!\n");
            System.out.print("Insira sua senha (A senha deve ter pelo menos 8 caracteres, incluindo números e letras): ");
            String senha = scanner.nextLine();

            if (ValidarEmail.validatePassword(senha)) {
                System.out.println("\nSenha válida! Acesso liberado!\n");
            } else {
                System.out.println("\nA senha não atende aos critérios mínimos de segurança! Tente novamente.\nREDIRECIONANDO AO MENU INICIAL...\n");
            }
        } else {
            System.out.println("\nEmail inválido!\nREDIRECIONANDO AO MENU INICIAL...\n");
        }
    }
}
