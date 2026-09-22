package com.vtduarte.av2exercicio1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o saldo atual: ");
            double saldoAtual = Double.parseDouble(sc.nextLine());
            System.out.print("Digite o valor: ");
            double valor = Double.parseDouble(sc.nextLine());
            System.out.print("Digite o tipo de operacao: ");
            String tipoOperacao = sc.nextLine().toLowerCase();

            double novoSaldo = calcularSaldo(saldoAtual, valor, tipoOperacao);
            System.out.println("Saldo atual: " + novoSaldo);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida! Digite apenas numeros");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static double calcularSaldo(double saldoAtual, double valor, String tipoOperacao) {
        if (saldoAtual < 0) {
            throw new IllegalArgumentException("O saldo atual não pode ser negativo!");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }

        return switch (tipoOperacao) {
            case "deposito" -> saldoAtual + valor;
            case "saque" -> {
                if (valor > saldoAtual) {
                    throw new IllegalArgumentException("Saldo insuficiente!");
                }
                yield saldoAtual - valor;
            }
            default -> throw new IllegalArgumentException("Tipo de operacao invalida!");
        };
    }
}
