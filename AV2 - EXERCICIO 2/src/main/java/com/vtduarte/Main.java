package com.vtduarte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Usuario> usuarios = new ArrayList<>();
    static List<Alimento> alimentos = new ArrayList<>();

    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.println("== MENU ==");
            System.out.println("1. Adicionar usuario no sistema");
            System.out.println("2. Entrar no sistema");
            System.out.println("3. Sair");

            System.out.print("Escolha: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> adicionarUsuario();
                case 2 -> fazerLogin();
                case 3 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Valor invalido!");
            }
        } while (option != 3);

        sc.close();
    }

    static void mostrarMenuPrincipal() {
        int option = 0;

        do {
            System.out.println("== MENU ==");
            System.out.println("1. Adicionar alimento no sistema");
            System.out.println("2. Voltar");

            System.out.print("Escolha: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> registrarAlimento();
                case 2 -> System.out.println("Voltando...");
                default -> System.out.println("Valor invalido!");
            }
        } while (option != 2);
    }

    static void adicionarUsuario() {
        System.out.print("Digite o email do usuario: ");
        String email = sc.nextLine();
        System.out.print("Digite a senha do usuario: ");
        String senha = sc.nextLine();

        usuarios.add(new Usuario(email, senha));
    }

    static void fazerLogin() {
        System.out.print("Digite o email do usuario: ");
        String email = sc.nextLine();
        System.out.print("Digite a senha do usuario: ");
        String senha = sc.nextLine();

        boolean usuarioEncontrado = false;

        for (Usuario usuario : usuarios) {

            if (usuario.getEmail().equals(email)
                    && usuario.getSenha().equals(senha)) {

                usuarioEncontrado = true;
                break;
            }
        }

        if (usuarioEncontrado) {
            System.out.println("Login realizado com sucesso!");
            mostrarMenuPrincipal();
        } else {
            System.out.println("Email ou senha incorretos!");
        }
    }

    static void registrarAlimento() {
        String titulo;
        String descricao;
        float preco;

        do {
            System.out.print("Digite o titulo do alimento: ");
            titulo = sc.nextLine();

            if (titulo.length() < 2) {
                System.out.println("Titulo deve ter no minimo 2 caracteres!");
            }
        } while (titulo.length() < 2);

        do {
            System.out.print("Digite a descricao do alimento: ");
            descricao = sc.nextLine();

            if (descricao.length() < 5) {
                System.out.println("Descricao deve ter no minimo 5 caracteres!");
            }
        } while (descricao.length() < 5);

        while (true) {
            try {
                System.out.print("Digite o preco do alimento: ");
                preco = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor valido!");
            }
        }

        alimentos.add(new Alimento(titulo, descricao, preco));

        System.out.println("Alimento cadastrado com sucesso!");
    }
}
