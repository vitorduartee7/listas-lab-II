package com.vtduarte;

import java.util.Scanner;

import static com.vtduarte.Validacoes.validarSenha;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o nome de usuario:");
        String username = sc.nextLine().trim();

        System.out.println("Digite sua senha:");
        String senha = sc.nextLine().trim();

        System.out.println("Digite a distancia:");
        int distancia = sc.nextInt();

        System.out.println("Digite o peso:");
        float peso = sc.nextFloat();

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.println(validarUsername(username));

        validarSenha(senha);

        System.out.println("Frete: " + calcularFrete(distancia, peso));

        System.out.println("Idade: " + calcularIdade(anoNascimento, anoAtual));

        sc.close();
    }

    static boolean validarUsername(String username) {
        return username.length() >= 5;
    }

    static float calcularFrete(int distancia, float peso) {
        if (distancia <= 100) {
            return 1.50F * peso;
        }
        return 2F * peso;
    }

    static int calcularIdade(int anoNascimento, int anoAtual) {
        return anoAtual - anoNascimento;
    }
}