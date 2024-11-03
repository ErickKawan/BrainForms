package services;

import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrarUsuario {
    private static List<User> users = new ArrayList<>();  // Lista para armazenar usuários

    public static void register(Scanner scanner) {
        System.out.println("\nVamos iniciar seu cadastro\n");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        if (ValidarEmail.validateEmail(email)) {
            System.out.println("\nE-mail válido! Podemos prosseguir!\n");
            System.out.print("Crie sua senha: ");
            String senha = scanner.nextLine();

            if (ValidarEmail.validatePassword(senha)) {
                System.out.print("Confirme sua senha: ");
                String confirmarSenha = scanner.nextLine();

                if (confirmarSenha.equals(senha)) {
                    User newUser = new User(nome, email, senha);
                    users.add(newUser);  // Adiciona o novo usuário à lista
                    System.out.println("\nCadastro realizado com sucesso!\n");
                } else {
                    System.out.println("\nAs senhas não coincidem!\nREDIRECIONANDO AO MENU INICIAL...\n");
                }
            } else {
                System.out.println("\nA senha não atende aos critérios mínimos de segurança! Tente novamente.\nREDIRECIONANDO AO MENU INICIAL...\n");
            }
        } else {
            System.out.println("\nEmail inválido!\nREDIRECIONANDO AO MENU INICIAL...\n");
        }
    }
}

